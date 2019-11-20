package utilities;

import vehicles.MotorisedVehicle;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * A workshop that can add and remove vehicles
 * @param <V> The type of vehicle that this Workshop accepts
 */
public class Workshop<V extends MotorisedVehicle> {

    private final int MAX_VEHICLES;
    private Queue<V> vehicles = new ArrayDeque<>();

    public Workshop(int max_vehicles) {
        MAX_VEHICLES = max_vehicles;
    }

    public boolean tryAddVehicle(V v) {
        if (vehicles.size() >= MAX_VEHICLES) {
            return false;
        }

        vehicles.add(v);
        return true;
    }

    public V tryRemoveVehicle() {
        return vehicles.poll();
    }
}

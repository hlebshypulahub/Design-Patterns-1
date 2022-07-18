package dp._2_creationalPatterns._4_prototype.code;

import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * TASK 2.4 - This cache uses a strange and non-compile-time safe defensive copy
 * mechanism. Introduce the prototype pattern so that all tests can actually
 * work.
 *
 * @author apuchals
 */
public final class HandHeldDeviceCache {

    private static Hashtable<String, HandHeldDevice> deviceMap = new Hashtable<>();

    public static HandHeldDevice getDevice(String deviceId) {
        HandHeldDevice cachedDevice = deviceMap.get(deviceId);
        return cachedDevice.clone();
    }

    public static void loadCache() {
        PalmTop palmTop = new PalmTop();
        palmTop.setId("1");
        deviceMap.put(palmTop.getId(), palmTop);

        Smartphone smartphone = new Smartphone("Samsong");
        smartphone.setId("2");
        deviceMap.put(smartphone.getId(), smartphone);

        Tablet tablet = new Tablet();
        tablet.setId("3");
        deviceMap.put(tablet.getId(), tablet);

        Telephone telephone = new Telephone();
        telephone.setId("4");
        deviceMap.put(telephone.getId(), telephone);
    }

    /**
     * the instance
     */
    public static final HandHeldDeviceCache INSTANCE = new HandHeldDeviceCache();

//    private List<HandHeldDevice> devices = new ArrayList<>();
//
    private HandHeldDeviceCache() {
    }
//
//    /**
//     *
//     */
    public void clear() {
        deviceMap.clear();
    }
//
//    /**
//     * @param device the device
//     */
    public void add(HandHeldDevice device) {
        deviceMap.put(deviceMap.);
    }
//
//    /**
//     * @param i the index
//     * @return the device at the index
//     */
//    public HandHeldDevice get(int i) {
//        try {
//            return devices.get(i).getClass().newInstance();
//        } //
//        catch (Throwable t) {
//            throw new RuntimeException(t);
//        }
//    }
}

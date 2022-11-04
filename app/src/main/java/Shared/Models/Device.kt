package Shared.Models


class Device (
    id: String,
    name: String,
    active: Boolean,
    wifi: String,
    deviceType: String,
    groups: Array<String>
) {

    /************ Properties ************/
    private var id: String
    private var name: String
    private var active: Boolean
    private var wifi: String
    private var deviceType: String
    private var groups: Array<String>

    /************ Initialize Class ************/
    init {
        this.id = id
        this.name = name
        this.active = active
        this.wifi = wifi
        this.deviceType = deviceType
        this.groups = groups
    }

    /************ Getters ************/

    fun getDeviceId(): String {
        return this.id
    }

    fun getDeviceName(): String {
        return this.name
    }

    fun isActive(): Boolean {
        return this.active
    }

    fun getDeviceWiFi(): String {
        return this.wifi
    }

    fun getDeviceType(): String {
        return this.deviceType
    }

    fun getDeviceGroups(): Array<String> {
        return this.groups
    }

    fun getDeviceGroupIndex(index: Int): String {
        return this.groups[index]
    }

    /************ Setters ************/

    fun setDeviceName(renameTo: String) {
        this.name = renameTo
    }

    fun setActive(active: Boolean) {
        this.active = active
    }

    fun setDeviceWiFi(WiFiName: String) {
        this.wifi = WiFiName
    }

    fun setDeviceType(type: String) {
        this.deviceType = type
    }

    fun setDeviceGroups(newGroups: Array<String>) {
        this.groups = newGroups
    }
}
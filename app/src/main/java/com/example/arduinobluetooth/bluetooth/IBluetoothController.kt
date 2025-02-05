package com.example.arduinobluetooth.bluetooth

import android.content.Context
import com.example.arduinobluetooth.bluetooth.BluetoothConfigData
import com.example.arduinobluetooth.bluetooth.MyBluetoothDevice
import com.example.arduinobluetooth.bluetooth.BluetoothState
import kotlinx.coroutines.flow.StateFlow

interface IBluetoothController  {
    val connectionState: StateFlow<BluetoothState>
    val scannedDevices: StateFlow<List<MyBluetoothDevice>>

    fun scanLeDevice(context: Context)
    fun stopScanLeDevice(context: Context)

    fun disconnectDevice()

    fun deleteSearchResults()

    fun connectDevice(deviceAdress : String)

    fun testDeviceConnection()

    fun configureArduinoDevice(configData: BluetoothConfigData)

    fun updateConnectedState(state : BluetoothState)


}
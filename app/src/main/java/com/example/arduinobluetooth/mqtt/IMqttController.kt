package com.example.arduinobluetooth.mqtt

import android.content.Context
import com.example.arduinobluetooth.bluetooth.BluetoothConfigData
import kotlinx.coroutines.flow.StateFlow
import org.eclipse.paho.android.service.MqttAndroidClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import javax.net.ssl.SSLSocketFactory

interface IMqttController {
        val rtData : StateFlow<LiveSession>
        fun createSSLSocketFactory(oneWaySSL : Boolean = false): SSLSocketFactory?
        fun getMqttClientOptions(useTLS : Boolean) : MqttConnectOptions

        fun setupMqtt(deviceSymmetricKey: ByteArray)
        fun createMqttClient(context: Context, brokerURL : String, clientId : String ) : MqttAndroidClient?

        fun connectBroker(mqttClient: MqttAndroidClient?,options : MqttConnectOptions)
        fun subscribe(topic: String, qos: Int = 1)

        fun unsubscribe(topic : String)

        fun closeMqttConnection()
}

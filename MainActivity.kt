/*
Crear un cliente de servicios de ubicación
*/

import android.location.Location
import android.os.Bundle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

private lateinit var fusedLocationClient: FusedLocationProviderClient

override fun onCreate(savedInstanceState: Bundle?) {


    fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)


/*
Conocer la ubicación más reciente
 */

    fusedLocationClient.lastLocation
        .addOnSuccessListener { location: Location? ->

        }

}
            package p000;

            import android.hardware.Sensor;
            import android.hardware.SensorEvent;
            import android.hardware.SensorEventListener;
            import android.hardware.SensorManager;
            
/* 35 */    public final class OilIoI11 implements IiI00001oI, SensorEventListener {
                public SensorManager I00iOIl;
                public Sensor I00iiI;
                public int I00iiO;

                @Override
                public final void onPause(O0oiOi o0oiOi) {
/* 3 */             this.I00iOIl.unregisterListener(this);
                }

                @Override
                public final void onResume(O0oiOi o0oiOi) {
/* 1 */             Sensor sensor = this.I00iiI;
/* 3 */             if (sensor != null) {
/* 8 */                 this.I00iOIl.registerListener(this, sensor, 3);
                    }
                }

                @Override
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    Sensor sensor;
/* 1 */             if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 1) {
/* 77 */                return;
                    }
/* 14 */            float[] fArr = sensorEvent.values;
/* 16 */            int i = 0;
/* 17 */            float f = fArr[0];
/* 19 */            float f2 = fArr[1];
                    double d = f;
/* 26 */            if (d < -7.0d) {
/* 28 */                i = 90;
                    } else if (d > 7.0d) {
/* 37 */                i = -90;
                    } else {
                        double d2 = f2;
/* 43 */                if (d2 < -7.0d) {
/* 45 */                    i = 180;
                        } else if (d2 <= 7.0d) {
/* 53 */                    i = this.I00iiO;
                        }
                    }
/* 57 */            if (i != this.I00iiO) {
/* 59 */                this.I00iiO = i;
                    }
                }

                @Override
/* 36 */        public final void onAccuracyChanged(Sensor sensor, int i) {
                }
            }

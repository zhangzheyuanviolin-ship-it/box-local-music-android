            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.content.pm.PackageManager;
            import android.location.Location;
            import android.location.LocationManager;
            import android.os.PowerManager;
            import android.util.Log;
            import java.util.Calendar;
            
/* 22 */    public final class I11o0oiOlIl extends I01loIooI {
                public final int I0000Il00O = 1;
                public final I11oi01ll I0000O;
                public final Object I0000oI00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I11o0oiOlIl(I11oi01ll i11oi01ll, Context context) {
/* 6 */             super(i11oi01ll);
/* 4 */             this.I0000O = i11oi01ll;
/* 21 */            this.I0000oI00 = (PowerManager) context.getApplicationContext().getSystemService("power");
                }

                @Override
                public final IntentFilter I000O01llI0() {
                    switch (this.I0000Il00O) {
                        case 0:
/* 29 */                    IntentFilter intentFilter = new IntentFilter();
/* 34 */                    intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
/* 37 */                    return intentFilter;
                        default:
/* 8 */                     IntentFilter intentFilter2 = new IntentFilter();
/* 13 */                    intentFilter2.addAction("android.intent.action.TIME_SET");
/* 18 */                    intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
/* 23 */                    intentFilter2.addAction("android.intent.action.TIME_TICK");
/* 26 */                    return intentFilter2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000l1() {
                    boolean z;
                    long j;
/* 3 */             int i = this.I0000Il00O;
/* 7 */             Object obj = this.I0000oI00;
                    switch (i) {
                        case 0:
/* 248 */                   if (!I11loIOOiI.I00000oIO((PowerManager) obj)) {
                                break;
                            }
                            break;
                        default:
/* 12 */                    OlilOlOiI olilOlOiI = (OlilOlOiI) obj;
/* 16 */                    LocationManager locationManager = (LocationManager) olilOlOiI.I00iiO;
/* 20 */                    I0oo0IlI01li i0oo0IlI01li = (I0oo0IlI01li) olilOlOiI.I00iio;
/* 30 */                    if (i0oo0IlI01li.I00000oOI > System.currentTimeMillis()) {
/* 32 */                        z = i0oo0IlI01li.I00000oIO;
                            } else {
/* 38 */                        Context context = (Context) olilOlOiI.I00iiI;
/* 46 */                        Location lastKnownLocation = null;
/* 47 */                        if (lI00l0oo.I00000oIO(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
/* 62 */                            Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
/* 69 */                            if (lI00l0oo.I00000oIO(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                        try {
/* 77 */                                    if (locationManager.isProviderEnabled("gps")) {
/* 79 */                                        lastKnownLocation = locationManager.getLastKnownLocation("gps");
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
/* 83 */                            if (lastKnownLocation == null || lastKnownLocation2 == null ? lastKnownLocation != null : lastKnownLocation.getTime() > lastKnownLocation2.getTime()) {
/* 99 */                                lastKnownLocation2 = lastKnownLocation;
                                    }
/* 105 */                           if (lastKnownLocation2 != null) {
/* 107 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 111 */                               OoIoO0IO ooIoO0IO = OoIoO0IO.I0000O;
/* 113 */                               if (ooIoO0IO == null) {
/* 117 */                                   ooIoO0IO = new OoIoO0IO();
/* 120 */                                   OoIoO0IO.I0000O = ooIoO0IO;
                                        }
/* 122 */                               OoIoO0IO ooIoO0IO2 = ooIoO0IO;
/* 136 */                               ooIoO0IO2.I00000oIO(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis - 86400000);
/* 148 */                               ooIoO0IO2.I00000oIO(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis);
/* 153 */                               z = ooIoO0IO2.I0000Il00O == 1;
/* 156 */                               long j2 = ooIoO0IO2.I00000oOI;
/* 158 */                               long j3 = ooIoO0IO2.I00000oIO;
/* 170 */                               ooIoO0IO2.I00000oIO(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis + 86400000);
/* 173 */                               long j4 = ooIoO0IO2.I00000oOI;
/* 179 */                               if (j2 == -1 || j3 == -1) {
/* 205 */                                   j = jCurrentTimeMillis + 43200000;
                                        } else {
/* 188 */                                   if (jCurrentTimeMillis > j3) {
/* 190 */                                       j2 = j4;
                                            } else if (jCurrentTimeMillis > j2) {
/* 196 */                                       j2 = j3;
                                            }
/* 200 */                                   j = j2 + 60000;
                                        }
/* 207 */                               i0oo0IlI01li.I00000oIO = z;
/* 209 */                               i0oo0IlI01li.I00000oOI = j;
                                    } else {
/* 216 */                               Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
/* 225 */                               int i2 = Calendar.getInstance().get(11);
/* 230 */                               if (i2 < 6 || i2 >= 22) {
/* 236 */                                   z = true;
                                        }
                                    }
                                }
                            }
/* 237 */                   if (!z) {
                                break;
                            }
                            break;
                    }
/* 6 */             return 1;
                }

                @Override
                public final void I001i1O0Ol() throws PackageManager.NameNotFoundException {
/* 1 */             int i = this.I0000Il00O;
/* 4 */             I11oi01ll i11oi01ll = this.I0000O;
                    switch (i) {
                        case 0:
/* 13 */                    i11oi01ll.I000l1(true);
                            break;
                        default:
/* 9 */                     i11oi01ll.I000l1(true);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public I11o0oiOlIl(I11oi01ll i11oi01ll, OlilOlOiI olilOlOiI) {
                    super(i11oi01ll);
/* 24 */            this.I0000O = i11oi01ll;
/* 25 */            this.I0000oI00 = olilOlOiI;
                }
            }

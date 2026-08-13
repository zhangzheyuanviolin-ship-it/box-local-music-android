            package p000;

            import android.content.ComponentName;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Message;
            import android.util.Log;
            import android.util.SparseArray;
            
            public final class li0l1I11iOO implements Handler.Callback {
                public final int I00iOIl;
                public Object I00iiI;

                public li0l1I11iOO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean handleMessage(Message message) {
/* 5 */             ComponentName componentName = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 183 */                   int i = message.arg1;
/* 189 */                   if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 203 */                       new StringBuilder(String.valueOf(i).length() + 30);
                            }
/* 208 */                   liiilOIIl liiiloiil = (liiilOIIl) this.I00iiI;
                            synchronized (liiiloiil) {
                                try {
/* 211 */                           SparseArray sparseArray = liiiloiil.I00ilI0I1;
/* 217 */                           lli1OiO lli1oio = (lli1OiO) sparseArray.get(i);
/* 219 */                           if (lli1oio != null) {
/* 255 */                               sparseArray.remove(i);
/* 258 */                               liiiloiil.I0000O();
/* 262 */                               Bundle data = message.getData();
/* 274 */                               if (!data.getBoolean("unsupported", false)) {
                                            switch (lli1oio.I0000oI00) {
                                                case 0:
/* 312 */                                           if (!data.getBoolean("ack", false)) {
/* 325 */                                               lli1oio.I0000Il00O(new I1o1lOlooI1("Invalid response to one way request", null, 13));
                                                        break;
                                                    } else {
/* 314 */                                               lli1oio.I00000oOI(null);
                                                        break;
                                                    }
                                                default:
/* 294 */                                           Bundle bundle = data.getBundle("data");
/* 298 */                                           if (bundle == null) {
/* 300 */                                               bundle = Bundle.EMPTY;
                                                    }
/* 302 */                                           lli1oio.I00000oOI(bundle);
                                                    break;
                                            }
                                        } else {
/* 283 */                                   lli1oio.I0000Il00O(new I1o1lOlooI1("Not supported by GmsCore", null, 13));
                                        }
                                    } else {
/* 235 */                               StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
/* 238 */                               sb.append("Received response for unknown request: ");
/* 241 */                               sb.append(i);
/* 248 */                               Log.w("MessengerIpcClient", sb.toString());
                                    }
                                } finally {
                                }
                            }
/* 4 */                     return true;
                        default:
/* 10 */                    int i2 = message.what;
/* 14 */                    if (i2 == 0) {
/* 115 */                       ll0oOilllo ll0ooilllo = (ll0oOilllo) this.I00iiI;
                                synchronized (ll0ooilllo.I00000oIO) {
                                    try {
/* 122 */                               lOiI1l0o loii1l0o = (lOiI1l0o) message.obj;
/* 130 */                               li0ill li0illVar = (li0ill) ll0ooilllo.I00000oIO.get(loii1l0o);
/* 132 */                               if (li0illVar != null && li0illVar.I00iOIl.isEmpty()) {
/* 144 */                                   if (li0illVar.I00iiO) {
/* 146 */                                       lOiI1l0o loii1l0o2 = li0illVar.I00ilI0I1;
/* 148 */                                       ll0oOilllo ll0ooilllo2 = li0illVar.I00io1l;
/* 152 */                                       ll0ooilllo2.I0000Il00O.removeMessages(1, loii1l0o2);
/* 159 */                                       ll0ooilllo2.I0000O.I0000Il00O(ll0ooilllo2.I00000oOI, li0illVar);
/* 162 */                                       li0illVar.I00iiO = false;
/* 165 */                                       li0illVar.I00iiI = 2;
                                            }
/* 169 */                                   ll0ooilllo.I00000oIO.remove(loii1l0o);
                                        }
                                    } finally {
                                    }
                                }
/* 4 */                         return true;
                            }
/* 16 */                    if (i2 != 1) {
/* 6 */                         return false;
                            }
/* 23 */                    ll0oOilllo ll0ooilllo3 = (ll0oOilllo) this.I00iiI;
                            synchronized (ll0ooilllo3.I00000oIO) {
                                try {
/* 30 */                            lOiI1l0o loii1l0o3 = (lOiI1l0o) message.obj;
/* 38 */                            li0ill li0illVar2 = (li0ill) ll0ooilllo3.I00000oIO.get(loii1l0o3);
/* 40 */                            if (li0illVar2 != null && li0illVar2.I00iiI == 3) {
/* 48 */                                String strValueOf = String.valueOf(loii1l0o3);
/* 60 */                                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
/* 63 */                                sb2.append("Timeout waiting for ServiceConnection callback ");
/* 66 */                                sb2.append(strValueOf);
/* 78 */                                Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
/* 81 */                                ComponentName componentName2 = li0illVar2.I00ilO0;
/* 83 */                                if (componentName2 == null) {
/* 85 */                                    loii1l0o3.getClass();
                                        } else {
/* 91 */                                    componentName = componentName2;
                                        }
/* 92 */                                if (componentName == null) {
/* 96 */                                    loii1l0o3.getClass();
/* 103 */                                   componentName = new ComponentName("com.google.android.gms", "unknown");
                                        }
/* 106 */                               li0illVar2.onServiceDisconnected(componentName);
                                    }
                                } finally {
                                }
                            }
/* 4 */                     return true;
                    }
                }
            }

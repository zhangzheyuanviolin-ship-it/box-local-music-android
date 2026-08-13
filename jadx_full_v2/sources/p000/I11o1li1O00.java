            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.lang.invoke.VarHandle;
            
/* 7 */     public final class I11o1li1O00 extends BroadcastReceiver {
                public final int I00000oIO;
                public Object I00000oOI;

                public I11o1li1O00(Object obj, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = obj;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                @Override
                public final void onReceive(Context context, Intent intent) {
                    switch (this.I00000oIO) {
                        case 0:
/* 426 */                   ((I01loIooI) this.I00000oOI).I001i1O0Ol();
                            break;
                        case 1:
/* 181 */                   I1oolIoOllO i1oolIoOllO = (I1oolIoOllO) this.I00000oOI;
                            switch (i1oolIoOllO.I000II) {
                                case 0:
/* 338 */                           String action = intent.getAction();
/* 342 */                           if (action != null) {
/* 345 */                               IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 349 */                               String str = I1ooll1ili.I00000oIO;
/* 351 */                               iIi0oIlI000II.getClass();
                                        switch (action.hashCode()) {
                                            case -1886648615:
/* 413 */                                       if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
/* 418 */                                           i1oolIoOllO.I0000Il00O(Boolean.FALSE);
                                                    break;
                                                }
                                                break;
                                            case -54942926:
/* 398 */                                       if (action.equals("android.os.action.DISCHARGING")) {
/* 403 */                                           i1oolIoOllO.I0000Il00O(Boolean.FALSE);
                                                    break;
                                                }
                                                break;
                                            case 948344062:
/* 383 */                                       if (action.equals("android.os.action.CHARGING")) {
/* 388 */                                           i1oolIoOllO.I0000Il00O(Boolean.TRUE);
                                                    break;
                                                }
                                                break;
                                            case 1019184907:
/* 368 */                                       if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
/* 373 */                                           i1oolIoOllO.I0000Il00O(Boolean.TRUE);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 1:
/* 268 */                           if (intent.getAction() != null) {
/* 272 */                               IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 276 */                               String str2 = I1ooo001OIoI.I00000oIO;
/* 278 */                               intent.getAction();
/* 281 */                               iIi0oIlI000II2.getClass();
/* 284 */                               String action2 = intent.getAction();
/* 288 */                               if (action2 != null) {
/* 290 */                                   int iHashCode = action2.hashCode();
/* 297 */                                   if (iHashCode == -1980154005) {
/* 329 */                                       if (action2.equals("android.intent.action.BATTERY_OKAY")) {
/* 334 */                                           i1oolIoOllO.I0000Il00O(Boolean.TRUE);
                                                    break;
                                                }
                                            } else if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
/* 318 */                                       i1oolIoOllO.I0000Il00O(Boolean.FALSE);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
/* 192 */                           if (intent.getAction() != null) {
/* 196 */                               IIi0oIl iIi0oIlI000II3 = IIi0oIl.I000II();
/* 200 */                               int i = OlOIOlI.I00000oIO;
/* 202 */                               intent.getAction();
/* 205 */                               iIi0oIlI000II3.getClass();
/* 208 */                               String action3 = intent.getAction();
/* 212 */                               if (action3 != null) {
/* 214 */                                   int iHashCode2 = action3.hashCode();
/* 221 */                                   if (iHashCode2 == -1181163412) {
/* 253 */                                       if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
/* 259 */                                           i1oolIoOllO.I0000Il00O(Boolean.FALSE);
                                                    break;
                                                }
                                            } else if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
/* 242 */                                       i1oolIoOllO.I0000Il00O(Boolean.TRUE);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        case 2:
/* 175 */                   ((i0Iii1o10) this.I00000oOI).I00000oOI(intent);
                            break;
                        default:
/* 8 */                     l0olllO1i l0olllo1i = (l0olllO1i) this.I00000oOI;
/* 10 */                    if (intent != null) {
/* 26 */                        String action4 = intent.getAction();
/* 30 */                        if (action4 != null) {
/* 46 */                            int iHashCode3 = action4.hashCode();
/* 53 */                            if (iHashCode3 == -1928239649) {
/* 108 */                               if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
/* 110 */                                   iIO0ooOool.I00000oIO();
/* 122 */                                   if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 125 */                                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 127 */                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 134 */                                       l01o0io1ooo0.I00lll10.I00000oOI("App receiver notified triggers are available");
/* 137 */                                       l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 139 */                                       l0olllO1i.I000II(l0o10ooo0);
/* 146 */                                       lOii1o loii1o = new lOii1o(11);
/* 149 */                                       loii1o.I00iiI = l0olllo1i;
/* 151 */                                       VarHandle.storeStoreFence();
/* 154 */                                       l0o10ooo0.I010o0o0oO(loii1o);
                                                break;
                                            }
                                        }
                                    } else if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
/* 69 */                                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 71 */                                l0olllO1i.I000II(l01o0io1ooo02);
/* 78 */                                l01o0io1ooo02.I00lll10.I00000oOI("[sgtm] App Receiver notified batches are available");
/* 81 */                                l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 83 */                                l0olllO1i.I000II(l0o10ooo02);
/* 90 */                                lOii1o loii1o2 = new lOii1o(8);
/* 93 */                                loii1o2.I00iiI = this;
/* 95 */                                VarHandle.storeStoreFence();
/* 98 */                                l0o10ooo02.I010o0o0oO(loii1o2);
                                        break;
                                    }
/* 158 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 160 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 167 */                           l01o0io1ooo03.I00l0I0l0lO1.I00000oOI("App receiver called with unknown action");
                                    break;
                                } else {
/* 32 */                            l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 34 */                            l0olllO1i.I000II(l01o0io1ooo04);
/* 41 */                            l01o0io1ooo04.I00l0I0l0lO1.I00000oOI("App receiver called with null action");
                                    break;
                                }
                            } else {
/* 12 */                        l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 14 */                        l0olllO1i.I000II(l01o0io1ooo05);
/* 21 */                        l01o0io1ooo05.I00l0I0l0lO1.I00000oOI("App receiver called with null intent");
                                break;
                            }
                            break;
                    }
                }

/* 8 */         public I11o1li1O00() {
/* 9 */             this.I00000oIO = 3;
                }
            }

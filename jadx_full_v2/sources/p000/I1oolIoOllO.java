            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class I1oolIoOllO {
                public final OloIli I00000oIO;
                public final Context I00000oOI;
                public Object I0000oI00;
                public final int I000II;
                public final Object I0000Il00O = new Object();
                public final LinkedHashSet I0000O = new LinkedHashSet();
                public final I11o1li1O00 I0001Ioi1lo = new I11o1li1O00(this, 1);

                public I1oolIoOllO(Context context, OloIli oloIli, int i) {
/* 1 */             this.I000II = i;
/* 6 */             this.I00000oIO = oloIli;
/* 12 */            this.I00000oOI = context.getApplicationContext();
                }

                public final IntentFilter I00000oIO() {
                    switch (this.I000II) {
                        case 0:
/* 40 */                    IntentFilter intentFilter = new IntentFilter();
/* 45 */                    intentFilter.addAction("android.os.action.CHARGING");
/* 50 */                    intentFilter.addAction("android.os.action.DISCHARGING");
/* 53 */                    return intentFilter;
                        case 1:
/* 24 */                    IntentFilter intentFilter2 = new IntentFilter();
/* 29 */                    intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
/* 34 */                    intentFilter2.addAction("android.intent.action.BATTERY_LOW");
/* 37 */                    return intentFilter2;
                        default:
/* 8 */                     IntentFilter intentFilter3 = new IntentFilter();
/* 13 */                    intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
/* 18 */                    intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
/* 21 */                    return intentFilter3;
                    }
                }

                public final Boolean I00000oOI() {
/* 1 */             int i = this.I000II;
/* 11 */            Context context = this.I00000oOI;
/* 13 */            boolean z = true;
                    switch (i) {
                        case 0:
/* 140 */                   Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
/* 144 */                   if (intentRegisterReceiver == null) {
/* 152 */                       IIi0oIl.I000II().I0000oI00(I1ooll1ili.I00000oIO, "getInitialState - null intent received");
/* 155 */                       return Boolean.FALSE;
                            }
/* 158 */                   int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
/* 163 */                   if (intExtra != 2 && intExtra != 5) {
/* 169 */                       z = false;
                            }
/* 170 */                   return Boolean.valueOf(z);
                        case 1:
/* 82 */                    Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
/* 86 */                    if (intentRegisterReceiver2 == null) {
/* 94 */                        IIi0oIl.I000II().I0000oI00(I1ooo001OIoI.I00000oIO, "getInitialState - null intent received");
/* 97 */                        return Boolean.FALSE;
                            }
/* 118 */                   float intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
/* 119 */                   if (intentRegisterReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
/* 129 */                       z = false;
                            }
/* 130 */                   return Boolean.valueOf(z);
                        default:
/* 22 */                    Intent intentRegisterReceiver3 = context.registerReceiver(null, I00000oIO());
/* 26 */                    if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
/* 35 */                        String action = intentRegisterReceiver3.getAction();
/* 39 */                        if (action == null) {
/* 71 */                            z = false;
                                } else {
/* 41 */                            int iHashCode = action.hashCode();
/* 48 */                            if (iHashCode == -1181163412) {
/* 67 */                                action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                                    } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    }
/* 71 */                            z = false;
                                }
                            }
/* 72 */                    return Boolean.valueOf(z);
                    }
                }

                public final void I0000Il00O(Boolean bool) {
                    synchronized (this.I0000Il00O) {
/* 4 */                 Object obj = this.I0000oI00;
/* 6 */                 if (obj == null || !obj.equals(bool)) {
/* 18 */                    this.I0000oI00 = bool;
/* 22 */                    List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I0000O);
/* 32 */                    Io1iO1Ooo0l io1iO1Ooo0l = (Io1iO1Ooo0l) ((OillOo0) this.I00000oIO).I00ilI0I1;
/* 38 */                    I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(21);
/* 41 */                    i0iOo0oioiO.I00iiI = listI00iIi0i1o;
/* 43 */                    i0iOo0oioiO.I00iiO = this;
/* 45 */                    VarHandle.storeStoreFence();
/* 48 */                    io1iO1Ooo0l.execute(i0iOo0oioiO);
                        }
                    }
                }
            }

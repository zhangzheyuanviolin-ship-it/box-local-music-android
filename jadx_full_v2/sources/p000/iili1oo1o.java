            package p000;

            import android.app.Service;
            import android.content.Intent;
            
            public final class iili1oo1o implements Runnable {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public iili1oo1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 173 */                   ((ii01iI1oI1l) this.I00iiO).zzb((iOli1OIoI0o) this.I00iio, this.I00iiI == 1 ? 1 : 0, (iOlI0O0iIiO) this.I00ilI0I1);
                            break;
                        case 1:
/* 151 */                   ((ii0IiOii) this.I00iiO).zzb((iOioIII1i) this.I00iio, this.I00iiI == 1 ? 1 : 0, (iOiI1oOo1l) this.I00ilI0I1);
                            break;
                        case 2:
/* 129 */                   ((ii0IiiI) this.I00iiO).zzb((iOioO0lIOo) this.I00iio, this.I00iiI == 1 ? 1 : 0, (iOiIOO1ll) this.I00ilI0I1);
                            break;
                        case 3:
/* 107 */                   ((iOlloil01Ilo) this.I00iiO).zzb((iOIoil) this.I00iio, this.I00iiI == 1 ? 1 : 0, (iOIIOoOoii) this.I00ilI0I1);
                            break;
                        case 4:
/* 85 */                    ((lIlOiO0OoO0) ((l0I0Ii1OIi0) this.I00iiO).I00ilO0).I00000oIO(this.I00iiI, (Exception) this.I00iio, (byte[]) this.I00ilI0I1);
                            break;
                        default:
/* 10 */                    i0O1lIi1O0IO i0o1lii1o0io = (i0O1lIi1O0IO) this.I00iiO;
/* 12 */                    int i = this.I00iiI;
/* 16 */                    l01O0IO1ooO0 l01o0io1ooo0 = (l01O0IO1ooO0) this.I00iio;
/* 20 */                    Intent intent = (Intent) this.I00ilI0I1;
/* 24 */                    Service service = (Service) i0o1lii1o0io.I00iiI;
/* 27 */                    lOo0oolIi1 loo0oolii1 = (lOo0oolIi1) service;
/* 33 */                    if (loo0oolii1.zza(i)) {
/* 43 */                        l01o0io1ooo0.I00lll10.I0000Il00O("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
/* 51 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllO1i.I000l1(service, null, null, null).I00ilO0;
/* 53 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 60 */                        l01o0io1ooo02.I00lll10.I00000oOI("Completed wakeful intent.");
/* 63 */                        loo0oolii1.I00000oIO(intent);
                                break;
                            }
                            break;
                    }
                }
            }

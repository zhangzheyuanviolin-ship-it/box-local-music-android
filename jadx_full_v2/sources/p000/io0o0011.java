            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class io0o0011 implements liI0OilOI1I1 {
                public final int I00000oIO;
                public ioii01Ii100 I00000oOI;

                public io0o0011(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    liOoo0oli0 liooo0oli0I00000oOI;
                    switch (this.I00000oIO) {
                        case 0:
/* 256 */                   ioii01Ii100 ioii01ii100 = this.I00000oOI;
/* 258 */                   l00Oi001i1l l00oi001i1l = (l00Oi001i1l) obj;
/* 264 */                   OoIol00Ool ooIol00Ool = new OoIol00Ool(11);
/* 267 */                   ooIol00Ool.I00iiI = ioii01ii100;
/* 269 */                   ooIol00Ool.I00iiO = l00oi001i1l;
/* 271 */                   VarHandle.storeStoreFence();
/* 282 */                   return l00oi001i1l.I00000oOI.I0000oI00(iOiiloIII0O.I00000oIO(ooIol00Ool), i1O01oOIoI0I.I00ooiO1I);
                        case 1:
/* 183 */                   ioii01Ii100 ioii01ii1002 = this.I00000oOI;
/* 185 */                   Integer num = (Integer) obj;
/* 191 */                   if (num.intValue() == 0 || num.intValue() == 2147483646) {
/* 251 */                       return ioii01ii1002.I00000oIO();
                            }
/* 203 */                   int iIntValue = num.intValue();
/* 209 */                   lil11i lil11iVar = ioii01ii1002.I00000oIO.I00iOIl;
/* 213 */                   ilioiOl0l0O ilioiol0l0o = new ilioiOl0l0O();
/* 216 */                   ilioiol0l0o.I00000oIO = iIntValue;
/* 218 */                   VarHandle.storeStoreFence();
/* 223 */                   lio1llilO lio1llilo = new lio1llilO(ilioiol0l0o);
/* 226 */                   lil11iVar.execute(lio1llilo);
/* 229 */                   liIOoOi1Ii1 liioooi1ii1I000o00OoI0I = liIOoOi1Ii1.I000o00OoI0I(lio1llilo);
/* 236 */                   io0o0011 io0o0011Var = new io0o0011(5);
/* 239 */                   io0o0011Var.I00000oOI = ioii01ii1002;
/* 241 */                   VarHandle.storeStoreFence();
/* 246 */                   return ll0li01oO0li.I0000Il00O(liioooi1ii1I000o00OoI0I, io0o0011Var, ioii01ii1002.I0000O);
                        case 2:
/* 122 */                   ilOi00IOiII iloi00ioiii = (ilOi00IOiII) obj;
/* 124 */                   ioii01Ii100 ioii01ii1003 = this.I00000oOI;
                            try {
/* 126 */                       iIolOi01l0o iioloi01l0o = iloi00ioiii.I00000oIO;
/* 130 */                       lOiIOoIi11I loiiooii11iI00000oIO = ioii01ii1003.I00000oOI.I00000oIO();
/* 134 */                       iIlI1O1liI0 iili1o1lii0 = (iIlI1O1liI0) iioloi01l0o;
/* 136 */                       Parcel parcelI00Iooi00oi = iili1o1lii0.I00Iooi00oi();
/* 140 */                       int i = lO0Ooi.I00000oIO;
/* 143 */                       parcelI00Iooi00oi.writeInt(1);
/* 146 */                       loiiooii11iI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 151 */                       Parcel parcelI00O0i0ii = iili1o1lii0.I00O0i0ii(39, parcelI00Iooi00oi);
/* 155 */                       int i2 = parcelI00O0i0ii.readInt();
/* 159 */                       parcelI00O0i0ii.recycle();
/* 166 */                       return ll0li01oO0li.I00000oIO(Integer.valueOf(i2));
                            } catch (RemoteException e) {
/* 178 */                       return ll0li01oO0li.I00000oOI(ilIoOl.I0000O("Failed to connect to AICore service.", e, 6));
                            }
                        case 3:
/* 117 */                   return this.I00000oOI.I00000oIO.I00000oIO();
                        case 4:
/* 37 */                    ioii01Ii100 ioii01ii1004 = this.I00000oOI;
/* 39 */                    ilOi00IOiII iloi00ioiii2 = (ilOi00IOiII) obj;
/* 41 */                    ioii01ii1004.getClass();
                            try {
/* 50 */                        Object objI00000oOI = ioii01ii1004.I00000oOI(iloi00ioiii2.I00000oIO);
/* 56 */                        il0llll00oO il0llll00oo = iloi00ioiii2.I00000oOI;
/* 58 */                        l00Oi001i1l l00oi001i1l2 = new l00Oi001i1l();
/* 61 */                        if (objI00000oOI == null) {
/* 77 */                            IOOlIIilOl0.I000II("Null getService");
/* 5 */                             return null;
                                }
/* 63 */                        l00oi001i1l2.I00000oIO = objI00000oOI;
/* 65 */                        l00oi001i1l2.I00000oOI = il0llll00oo;
/* 67 */                        VarHandle.storeStoreFence();
/* 70 */                        return ll0li01oO0li.I00000oIO(l00oi001i1l2);
                            } catch (RemoteException e2) {
/* 98 */                        Log.e("ioii01Ii100", "Failed to initialize service.", e2);
/* 105 */                       liooo0oli0I00000oOI = ll0li01oO0li.I00000oOI(ilIoOl.I00000oOI(6, e2, "Failed to initialize service."));
/* 96 */                        return liooo0oli0I00000oOI;
                            } catch (RuntimeException e3) {
/* 85 */                        Log.e("ioii01Ii100", "Failed to initialize service.", e3);
/* 92 */                        liooo0oli0I00000oOI = ll0li01oO0li.I00000oOI(ilIoOl.I00000oOI(0, e3, "Failed to initialize service."));
/* 96 */                        return liooo0oli0I00000oOI;
                            }
                        default:
                            return !((Boolean) obj).booleanValue() ? ll0li01oO0li.I00000oOI(ilIoOl.I0000O("Request blocked due to background use.", null, 30)) : this.I00000oOI.I00000oIO();
                    }
                }
            }

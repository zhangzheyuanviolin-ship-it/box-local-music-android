            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class iOiOO11l implements liI0OilOI1I1 {
                public final int I00000oIO;
                public Object I00000oOI;

                public iOiOO11l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    GenAiException genAiException;
                    GenAiException genAiException2;
                    switch (this.I00000oIO) {
                        case 0:
/* 160 */                   iOil1lO10l ioil1lo10l = (iOil1lO10l) this.I00000oOI;
/* 162 */                   ilOiOOII0I0 iloiooii0i0 = (ilOiOOII0I0) obj;
/* 164 */                   if (iloiooii0i0 == null) {
/* 205 */                       ioil1lo10l.getClass();
/* 212 */                       return ll0li01oO0li.I00000oIO(0);
                            }
/* 166 */                   l00Iil l00iil = ioil1lo10l.I00iOIl;
/* 168 */                   l00iil.I000II();
/* 183 */                   li1l1liO1i0l li1l1lio1i0lI0000O = ll0li01oO0li.I0000O(liIOoOi1Ii1.I000o00OoI0I(l00iil.I00000oIO()), ioo0I10ilio.I00000oIO, liI1iIi1IllO.I00iOIl);
/* 190 */                   iOiOO11l ioioo11l = new iOiOO11l(2);
/* 193 */                   ioioo11l.I00000oOI = iloiooii0i0;
/* 195 */                   VarHandle.storeStoreFence();
/* 200 */                   return ll0li01oO0li.I0000Il00O(li1l1lio1i0lI0000O, ioioo11l, l00iil.I00iOIl);
                        case 1:
/* 83 */                    Throwable th = (Throwable) obj;
/* 87 */                    if (th instanceof GenAiException) {
/* 89 */                        genAiException2 = (GenAiException) th;
                            } else {
/* 94 */                        if (th instanceof ilIoOl) {
/* 96 */                            ilIoOl iliool = (ilIoOl) th;
/* 106 */                           genAiException = new GenAiException(iliool, iliool.I00iOIl, iliool.I0000oI00());
                                } else {
/* 115 */                           if (th instanceof CancellationException) {
/* 119 */                               String message = th.getMessage();
/* 128 */                               genAiException = new GenAiException(message != null ? message : "", th, 7);
                                    } else {
/* 134 */                               String message2 = th.getMessage();
/* 142 */                               genAiException = new GenAiException(message2 != null ? message2 : "", th, 0);
                                    }
                                }
/* 109 */                       genAiException2 = genAiException;
                            }
/* 150 */                   ((iOiO11oOi1) this.I00000oOI).I0001Ioi1lo(genAiException2);
/* 153 */                   return ll0li01oO0li.I00000oOI(genAiException2);
                        default:
/* 9 */                     ilOiOOII0I0 iloiooii0i02 = (ilOiOOII0I0) this.I00000oOI;
/* 11 */                    iIolOi01l0o iioloi01l0o = (iIolOi01l0o) obj;
                            try {
/* 13 */                        lOiIOoIi11I loiiooii11iI00000oIO = iloiooii0i02.I00000oIO();
/* 17 */                        iIlI1O1liI0 iili1o1lii0 = (iIlI1O1liI0) iioloi01l0o;
/* 19 */                        Parcel parcelI00Iooi00oi = iili1o1lii0.I00Iooi00oi();
/* 23 */                        int i = lO0Ooi.I00000oIO;
/* 26 */                        parcelI00Iooi00oi.writeInt(1);
/* 29 */                        loiiooii11iI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 33 */                        Parcel parcelI00O0i0ii = iili1o1lii0.I00O0i0ii(3, parcelI00Iooi00oi);
/* 37 */                        int i2 = parcelI00O0i0ii.readInt();
/* 41 */                        parcelI00O0i0ii.recycle();
/* 48 */                        return ll0li01oO0li.I00000oIO(Integer.valueOf(i2));
                            } catch (RemoteException e) {
/* 64 */                        Log.e("l00Iil", "AiCore service failed to get feature status for ".concat(iloiooii0i02.I00000oIO), e);
/* 78 */                        return ll0li01oO0li.I00000oOI(ilIoOl.I0000Il00O(6, e, "AiCore service failed to get feature status for ".concat(iloiooii0i02.I00000oIO)));
                            }
                    }
                }
            }

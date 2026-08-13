            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class iooo1l implements liI0OilOI1I1 {
                public int I00000oIO;

                @Override
                public final ListenableFuture zza(Object obj) {
/* 1 */             iIolOi01l0o iioloi01l0o = (iIolOi01l0o) obj;
/* 3 */             int i = this.I00000oIO;
                    try {
/* 7 */                 iIlI1O1liI0 iili1o1lii0 = (iIlI1O1liI0) iioloi01l0o;
/* 15 */                Parcel parcelI00O0i0ii = iili1o1lii0.I00O0i0ii(11, iili1o1lii0.I00Iooi00oi());
/* 19 */                int i2 = parcelI00O0i0ii.readInt();
/* 23 */                parcelI00O0i0ii.recycle();
/* 27 */                if (i2 < 6) {
/* 37 */                    return ll0li01oO0li.I00000oOI(ilIoOl.I0000Il00O(8, null, "getFeatureOrControl is not supported before AICoreVersion V7"));
                        }
/* 46 */                iIlI1O1liI0 iili1o1lii02 = (iIlI1O1liI0) iioloi01l0o;
/* 48 */                Parcel parcelI00Iooi00oi = iili1o1lii02.I00Iooi00oi();
/* 52 */                parcelI00Iooi00oi.writeInt(i);
/* 56 */                parcelI00Iooi00oi.writeInt(-1);
/* 61 */                Parcel parcelI00O0i0ii2 = iili1o1lii02.I00O0i0ii(32, parcelI00Iooi00oi);
/* 71 */                lOiIOoIi11I loiiooii11i = (lOiIOoIi11I) lO0Ooi.I00000oIO(parcelI00O0i0ii2, lOiIOoIi11I.CREATOR);
/* 73 */                parcelI00O0i0ii2.recycle();
/* 76 */                if (loiiooii11i == null) {
/* 78 */                    Locale locale = Locale.ENGLISH;
/* 98 */                    return ll0li01oO0li.I00000oOI(new ilIoOl(3, 606, IIlIOloOOO.I00100l0("Feature ", i, " is not available."), null, null));
                        }
/* 103 */               String str = loiiooii11i.I00ioIO;
/* 105 */               if (str == null) {
/* 107 */                   str = "";
                        }
/* 109 */               String str2 = loiiooii11i.I00iOIl;
/* 111 */               String str3 = loiiooii11i.I00iiI;
/* 113 */               int i3 = loiiooii11i.I00iiO;
/* 115 */               int i4 = loiiooii11i.I00iio;
/* 117 */               int i5 = loiiooii11i.I00ilI0I1;
/* 119 */               int i6 = loiiooii11i.I00ilO0;
/* 121 */               int i7 = loiiooii11i.I00io1l;
/* 125 */               ilOiOOII0I0 iloiooii0i0 = new ilOiOOII0I0();
/* 128 */               if (str2 == null) {
/* 164 */                   IOOlIIilOl0.I000II("Null name");
/* 26 */                    return null;
                        }
/* 130 */               iloiooii0i0.I00000oIO = str2;
/* 132 */               if (str3 == null) {
/* 158 */                   IOOlIIilOl0.I000II("Null modelName");
/* 26 */                    return null;
                        }
/* 134 */               iloiooii0i0.I00000oOI = str3;
/* 136 */               iloiooii0i0.I0000Il00O = i3;
/* 138 */               iloiooii0i0.I0000O = i4;
/* 140 */               iloiooii0i0.I0000oI00 = i5;
/* 142 */               iloiooii0i0.I0001Ioi1lo = i6;
/* 144 */               iloiooii0i0.I000II = i7;
/* 146 */               iloiooii0i0.I000O01llI0 = str;
/* 148 */               VarHandle.storeStoreFence();
/* 151 */               return ll0li01oO0li.I00000oIO(iloiooii0i0);
                    } catch (RemoteException e) {
/* 172 */               Log.e("l00Iil", "AiCore service failed to get feature.", e);
/* 179 */               return ll0li01oO0li.I00000oOI(ilIoOl.I0000Il00O(6, e, "AiCore service failed to get feature."));
                    }
                }
            }

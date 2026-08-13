            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class iio10oooI0O implements l0OI000IIIi {
                @Override
                public final ListenableFuture zza(Object obj) {
                    try {
/* 4 */                 iolOiIoi ioloiioi = (iolOiIoi) ((l0o1looii0Ol) obj);
/* 12 */                Parcel parcelI00O0i0ii = ioloiioi.I00O0i0ii(11, ioloiioi.I00Iooi00oi());
/* 16 */                int i = parcelI00O0i0ii.readInt();
/* 20 */                parcelI00O0i0ii.recycle();
/* 24 */                if (i < 6) {
/* 34 */                    return ll00lliII.I00000oIO(iOIIOoOoii.I0000Il00O(8, null, "getFeatureOrControl is not supported before AICoreVersion V7"));
                        }
/* 41 */                Parcel parcelI00Iooi00oi = ioloiioi.I00Iooi00oi();
/* 47 */                parcelI00Iooi00oi.writeInt(627);
/* 51 */                parcelI00Iooi00oi.writeInt(1);
/* 56 */                Parcel parcelI00O0i0ii2 = ioloiioi.I00O0i0ii(32, parcelI00Iooi00oi);
/* 60 */                Parcelable.Creator<il1I1O> creator = il1I1O.CREATOR;
/* 62 */                int i2 = iil1ii1loOI1.I00000oIO;
/* 72 */                il1I1O il1i1oCreateFromParcel = parcelI00O0i0ii2.readInt() == 0 ? null : creator.createFromParcel(parcelI00O0i0ii2);
/* 80 */                parcelI00O0i0ii2.recycle();
/* 83 */                if (il1i1oCreateFromParcel == null) {
/* 85 */                    Locale locale = Locale.ENGLISH;
/* 97 */                    return ll00lliII.I00000oIO(new iOIIOoOoii(3, 606, "Feature 627 is not available.", null));
                        }
/* 102 */               String str = il1i1oCreateFromParcel.I00iOIl;
/* 104 */               String str2 = il1i1oCreateFromParcel.I00iiI;
/* 106 */               int i3 = il1i1oCreateFromParcel.I00iiO;
/* 108 */               int i4 = il1i1oCreateFromParcel.I00iio;
/* 110 */               int i5 = il1i1oCreateFromParcel.I00ilI0I1;
/* 112 */               int i6 = il1i1oCreateFromParcel.I00ilO0;
/* 116 */               iOli1OIiO1I0 ioli1oiio1i0 = new iOli1OIiO1I0();
/* 119 */               if (str == null) {
/* 152 */                   IOOlIIilOl0.I000II("Null name");
/* 23 */                    return null;
                        }
/* 121 */               ioli1oiio1i0.I00000oIO = str;
/* 123 */               if (str2 == null) {
/* 146 */                   IOOlIIilOl0.I000II("Null modelName");
/* 23 */                    return null;
                        }
/* 125 */               ioli1oiio1i0.I00000oOI = str2;
/* 127 */               ioli1oiio1i0.I0000Il00O = i3;
/* 129 */               ioli1oiio1i0.I0000O = i4;
/* 131 */               ioli1oiio1i0.I0000oI00 = i5;
/* 133 */               ioli1oiio1i0.I0001Ioi1lo = i6;
/* 135 */               VarHandle.storeStoreFence();
/* 140 */               return new l0lI0IOIl000(ioli1oiio1i0);
                    } catch (RemoteException e) {
/* 160 */               Log.e("il1OOI0", "AiCore service failed to get feature.", e);
/* 167 */               return ll00lliII.I00000oIO(iOIIOoOoii.I0000Il00O(6, e, "AiCore service failed to get feature."));
                    }
                }
            }

            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class iiio1li1iIiI implements iol0i0iOol {
                public int I00000oIO;
                public int I00000oOI;

                @Override
                public final ListenableFuture zza(Object obj) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = this.I00000oOI;
                    try {
/* 8 */                 io100oIo io100oio = (io100oIo) ((l0IIolOoi0I) obj);
/* 16 */                Parcel parcelI00O0i0ii = io100oio.I00O0i0ii(11, io100oio.I00Iooi00oi());
/* 20 */                int i3 = parcelI00O0i0ii.readInt();
/* 24 */                parcelI00O0i0ii.recycle();
/* 28 */                if (i3 < 6) {
/* 38 */                    return lioli1IO.I00000oIO(iOiI1oOo1l.I0000Il00O(8, null, "getFeatureOrControl is not supported before AICoreVersion V7"));
                        }
/* 46 */                Parcel parcelI00Iooi00oi = io100oio.I00Iooi00oi();
/* 50 */                parcelI00Iooi00oi.writeInt(i);
/* 53 */                parcelI00Iooi00oi.writeInt(i2);
/* 58 */                Parcel parcelI00O0i0ii2 = io100oio.I00O0i0ii(32, parcelI00Iooi00oi);
/* 62 */                Parcelable.Creator<il11O1OlI> creator = il11O1OlI.CREATOR;
/* 64 */                int i4 = iil0I01i.I00000oIO;
/* 74 */                il11O1OlI il11o1oliCreateFromParcel = parcelI00O0i0ii2.readInt() == 0 ? null : creator.createFromParcel(parcelI00O0i0ii2);
/* 82 */                parcelI00O0i0ii2.recycle();
/* 85 */                if (il11o1oliCreateFromParcel == null) {
/* 87 */                    Locale locale = Locale.ENGLISH;
/* 105 */                   return lioli1IO.I00000oIO(new iOiI1oOo1l(3, 606, IIlIOloOOO.I00100l0("Feature ", i, " is not available."), null));
                        }
/* 110 */               String str = il11o1oliCreateFromParcel.I00iOIl;
/* 112 */               String str2 = il11o1oliCreateFromParcel.I00iiI;
/* 114 */               int i5 = il11o1oliCreateFromParcel.I00iiO;
/* 116 */               int i6 = il11o1oliCreateFromParcel.I00iio;
/* 118 */               int i7 = il11o1oliCreateFromParcel.I00ilI0I1;
/* 120 */               int i8 = il11o1oliCreateFromParcel.I00ilO0;
/* 124 */               iOoOlIOOi ioooliooi = new iOoOlIOOi();
/* 127 */               if (str == null) {
/* 159 */                   IOOlIIilOl0.I000II("Null name");
/* 27 */                    return null;
                        }
/* 129 */               ioooliooi.I00000oIO = str;
/* 131 */               if (str2 == null) {
/* 153 */                   IOOlIIilOl0.I000II("Null modelName");
/* 27 */                    return null;
                        }
/* 133 */               ioooliooi.I00000oOI = str2;
/* 135 */               ioooliooi.I0000Il00O = i5;
/* 137 */               ioooliooi.I0000O = i6;
/* 139 */               ioooliooi.I0000oI00 = i7;
/* 141 */               ioooliooi.I0001Ioi1lo = i8;
/* 143 */               VarHandle.storeStoreFence();
/* 146 */               return lioli1IO.I00000oOI(ioooliooi);
                    } catch (RemoteException e) {
/* 167 */               Log.e("il0I11I011", "AiCore service failed to get feature.", e);
/* 174 */               return lioli1IO.I00000oIO(iOiI1oOo1l.I0000Il00O(6, e, "AiCore service failed to get feature."));
                    }
                }
            }

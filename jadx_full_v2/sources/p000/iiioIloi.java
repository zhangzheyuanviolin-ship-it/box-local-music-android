            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class iiioIloi implements iol0ioiIO1iI {
                public int I00000oIO;
                public int I00000oOI;

                @Override
                public final ListenableFuture zza(Object obj) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = this.I00000oOI;
                    try {
/* 8 */                 io1011lii io1011liiVar = (io1011lii) ((l0IO0lo0ool) obj);
/* 16 */                Parcel parcelI00O0i0ii = io1011liiVar.I00O0i0ii(11, io1011liiVar.I00Iooi00oi());
/* 20 */                int i3 = parcelI00O0i0ii.readInt();
/* 24 */                parcelI00O0i0ii.recycle();
/* 28 */                if (i3 < 6) {
/* 38 */                    return liolilo.I00000oIO(iOiIOO1ll.I0000Il00O(8, null, "getFeatureOrControl is not supported before AICoreVersion V7"));
                        }
/* 46 */                Parcel parcelI00Iooi00oi = io1011liiVar.I00Iooi00oi();
/* 50 */                parcelI00Iooi00oi.writeInt(i);
/* 53 */                parcelI00Iooi00oi.writeInt(i2);
/* 58 */                Parcel parcelI00O0i0ii2 = io1011liiVar.I00O0i0ii(32, parcelI00Iooi00oi);
/* 62 */                Parcelable.Creator<il11i0> creator = il11i0.CREATOR;
/* 64 */                int i4 = iil0IIlIl0oo.I00000oIO;
/* 74 */                il11i0 il11i0VarCreateFromParcel = parcelI00O0i0ii2.readInt() == 0 ? null : creator.createFromParcel(parcelI00O0i0ii2);
/* 82 */                parcelI00O0i0ii2.recycle();
/* 85 */                if (il11i0VarCreateFromParcel == null) {
/* 87 */                    Locale locale = Locale.ENGLISH;
/* 105 */                   return liolilo.I00000oIO(new iOiIOO1ll(3, 606, IIlIOloOOO.I00100l0("Feature ", i, " is not available."), null));
                        }
/* 110 */               String str = il11i0VarCreateFromParcel.I00iOIl;
/* 112 */               String str2 = il11i0VarCreateFromParcel.I00iiI;
/* 114 */               int i5 = il11i0VarCreateFromParcel.I00iiO;
/* 116 */               int i6 = il11i0VarCreateFromParcel.I00iio;
/* 118 */               int i7 = il11i0VarCreateFromParcel.I00ilI0I1;
/* 120 */               int i8 = il11i0VarCreateFromParcel.I00ilO0;
/* 124 */               iOoOoIioii iooooiioii = new iOoOoIioii();
/* 127 */               if (str == null) {
/* 159 */                   IOOlIIilOl0.I000II("Null name");
/* 27 */                    return null;
                        }
/* 129 */               iooooiioii.I00000oIO = str;
/* 131 */               if (str2 == null) {
/* 153 */                   IOOlIIilOl0.I000II("Null modelName");
/* 27 */                    return null;
                        }
/* 133 */               iooooiioii.I00000oOI = str2;
/* 135 */               iooooiioii.I0000Il00O = i5;
/* 137 */               iooooiioii.I0000O = i6;
/* 139 */               iooooiioii.I0000oI00 = i7;
/* 141 */               iooooiioii.I0001Ioi1lo = i8;
/* 143 */               VarHandle.storeStoreFence();
/* 146 */               return liolilo.I00000oOI(iooooiioii);
                    } catch (RemoteException e) {
/* 167 */               Log.e("il0I1i0Oo1", "AiCore service failed to get feature.", e);
/* 174 */               return liolilo.I00000oIO(iOiIOO1ll.I0000Il00O(6, e, "AiCore service failed to get feature."));
                    }
                }
            }

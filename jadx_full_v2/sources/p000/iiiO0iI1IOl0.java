            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class iiiO0iI1IOl0 implements iollIi0II1o {
                public int I00000oIO;
                public int I00000oOI;

                @Override
                public final ListenableFuture zza(Object obj) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = this.I00000oOI;
                    try {
/* 8 */                 io101O1Il io101o1il = (io101O1Il) ((l0IIO1Oi0lOi) obj);
/* 16 */                Parcel parcelI00O0i0ii = io101o1il.I00O0i0ii(11, io101o1il.I00Iooi00oi());
/* 20 */                int i3 = parcelI00O0i0ii.readInt();
/* 24 */                parcelI00O0i0ii.recycle();
/* 28 */                if (i3 < 6) {
/* 38 */                    return lioo0lo01i.I00000oIO(iOlI0O0iIiO.I0000Il00O(8, null, "getFeatureOrControl is not supported before AICoreVersion V7"));
                        }
/* 46 */                Parcel parcelI00Iooi00oi = io101o1il.I00Iooi00oi();
/* 50 */                parcelI00Iooi00oi.writeInt(i);
/* 53 */                parcelI00Iooi00oi.writeInt(i2);
/* 58 */                Parcel parcelI00O0i0ii2 = io101o1il.I00O0i0ii(32, parcelI00Iooi00oi);
/* 62 */                Parcelable.Creator<il11il01o> creator = il11il01o.CREATOR;
/* 64 */                int i4 = iil0Ii00oOI1.I00000oIO;
/* 74 */                il11il01o il11il01oVarCreateFromParcel = parcelI00O0i0ii2.readInt() == 0 ? null : creator.createFromParcel(parcelI00O0i0ii2);
/* 82 */                parcelI00O0i0ii2.recycle();
/* 85 */                if (il11il01oVarCreateFromParcel == null) {
/* 87 */                    Locale locale = Locale.ENGLISH;
/* 105 */                   return lioo0lo01i.I00000oIO(new iOlI0O0iIiO(3, 606, IIlIOloOOO.I00100l0("Feature ", i, " is not available."), null));
                        }
/* 110 */               String str = il11il01oVarCreateFromParcel.I00iOIl;
/* 112 */               String str2 = il11il01oVarCreateFromParcel.I00iiI;
/* 114 */               int i5 = il11il01oVarCreateFromParcel.I00iiO;
/* 116 */               int i6 = il11il01oVarCreateFromParcel.I00iio;
/* 118 */               int i7 = il11il01oVarCreateFromParcel.I00ilI0I1;
/* 120 */               int i8 = il11il01oVarCreateFromParcel.I00ilO0;
/* 124 */               ii00Il000 ii00il000 = new ii00Il000();
/* 127 */               if (str == null) {
/* 159 */                   IOOlIIilOl0.I000II("Null name");
/* 27 */                    return null;
                        }
/* 129 */               ii00il000.I00000oIO = str;
/* 131 */               if (str2 == null) {
/* 153 */                   IOOlIIilOl0.I000II("Null modelName");
/* 27 */                    return null;
                        }
/* 133 */               ii00il000.I00000oOI = str2;
/* 135 */               ii00il000.I0000Il00O = i5;
/* 137 */               ii00il000.I0000O = i6;
/* 139 */               ii00il000.I0000oI00 = i7;
/* 141 */               ii00il000.I0001Ioi1lo = i8;
/* 143 */               VarHandle.storeStoreFence();
/* 146 */               return lioo0lo01i.I00000oOI(ii00il000);
                    } catch (RemoteException e) {
/* 167 */               Log.e("il00iIOo1", "AiCore service failed to get feature.", e);
/* 174 */               return lioo0lo01i.I00000oIO(iOlI0O0iIiO.I0000Il00O(6, e, "AiCore service failed to get feature."));
                    }
                }
            }

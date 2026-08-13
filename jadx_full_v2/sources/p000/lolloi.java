            package p000;

            import android.os.Parcel;
            
            public final class lolloi extends i0I1ioiiIioI {
                public final loo11OllO I00OI1(IoOlilli0ol ioOlilli0ol, loliO1I0 lolio1i0) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.I000OOo1O);
/* 10 */            int i = iil0li.I00000oIO;
/* 13 */            if (ioOlilli0ol == null) {
/* 15 */                parcelObtain.writeStrongBinder(null);
                    } else {
/* 23 */                parcelObtain.writeStrongBinder(ioOlilli0ol.asBinder());
                    }
/* 27 */            parcelObtain.writeInt(1);
/* 31 */            lolio1i0.writeToParcel(parcelObtain, 0);
/* 35 */            Parcel parcelI00O0i0ii = I00O0i0ii(3, parcelObtain);
/* 48 */            loo11OllO loo11olloCreateFromParcel = parcelI00O0i0ii.readInt() != 0 ? loo11OllO.CREATOR.createFromParcel(parcelI00O0i0ii) : null;
/* 57 */            parcelI00O0i0ii.recycle();
/* 106 */           return loo11olloCreateFromParcel;
                }
            }

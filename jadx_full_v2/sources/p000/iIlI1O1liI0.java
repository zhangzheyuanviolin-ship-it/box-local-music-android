            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class iIlI1O1liI0 extends i0I1ioiiIioI implements iIolOi01l0o {
                public iIlI1O1liI0(IBinder iBinder) {
/* 5 */             super(iBinder, "com.google.android.apps.aicore.aidl.IAICoreService", 12);
                }

                public final int I00OI1(lOiIOoIi11I loiiooii11i, ioll1i1llO ioll1i1llo) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             int i = lO0Ooi.I00000oIO;
/* 8 */             parcelI00Iooi00oi.writeInt(1);
/* 12 */            loiiooii11i.writeToParcel(parcelI00Iooi00oi, 0);
/* 15 */            parcelI00Iooi00oi.writeStrongBinder(ioll1i1llo);
/* 20 */            Parcel parcelI00O0i0ii = I00O0i0ii(12, parcelI00Iooi00oi);
/* 24 */            int i2 = parcelI00O0i0ii.readInt();
/* 28 */            parcelI00O0i0ii.recycle();
/* 37 */            return i2;
                }
            }

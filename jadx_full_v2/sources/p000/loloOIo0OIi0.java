            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class loloOIo0OIi0 extends i0I1ioiiIioI implements loo01iI0 {
                public final lolloi I00OI1(OIOiOlIO01 oIOiOlIO01, looIIoOl looiiool) {
                    lolloi lolloiVar;
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.I000OOo1O);
/* 10 */            int i = iil0li.I00000oIO;
/* 16 */            parcelObtain.writeStrongBinder(oIOiOlIO01.asBinder());
/* 20 */            parcelObtain.writeInt(1);
/* 24 */            looiiool.writeToParcel(parcelObtain, 0);
/* 27 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelObtain);
/* 31 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 35 */            if (strongBinder == null) {
/* 37 */                lolloiVar = null;
                    } else {
/* 41 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
/* 57 */                lolloiVar = iInterfaceQueryLocalInterface instanceof lolloi ? (lolloi) iInterfaceQueryLocalInterface : new lolloi(strongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 8);
                    }
/* 61 */            parcelI00O0i0ii.recycle();
/* 106 */           return lolloiVar;
                }
            }

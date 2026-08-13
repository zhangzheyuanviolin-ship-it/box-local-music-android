            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import java.lang.invoke.VarHandle;
            
            public abstract class iiIo0i extends iOo1lllooOO implements iiO01lOloo {
                public static iiO01lOloo asInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
/* 13 */            if (iInterfaceQueryLocalInterface instanceof iiO01lOloo) {
/* 15 */                return (iiO01lOloo) iInterfaceQueryLocalInterface;
                    }
/* 20 */            iiIiiOIoliII iiiiioioliii = new iiIiiOIoliII();
/* 23 */            iiiiioioliii.I000II = iBinder;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return iiiiioioliii;
                }

                @Override
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i != 1) {
/* 45 */                return false;
                    }
/* 8 */             IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 18 */            iOoOoOOI1 iooooooi1 = (iOoOoOOI1) iil0Oi1Oo.I00000oIO(parcel, iOoOoOOI1.CREATOR);
/* 20 */            iil0Oi1Oo.I00000oOI(parcel);
/* 23 */            iiIIi0ll11iI iiiii0ll11iiNewBarcodeScanner = newBarcodeScanner(ioOlilli0olI00O0i0ii, iooooooi1);
/* 27 */            parcel2.writeNoException();
/* 30 */            if (iiiii0ll11iiNewBarcodeScanner == null) {
/* 33 */                parcel2.writeStrongBinder(null);
                    } else {
/* 41 */                parcel2.writeStrongBinder(iiiii0ll11iiNewBarcodeScanner.asBinder());
                    }
/* 1 */             return true;
                }
            }

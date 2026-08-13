            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            
            public abstract class i10iloI1I1 extends i0llOl1 implements i10iloi {
                public static i10iloi asInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
/* 13 */            if (iInterfaceQueryLocalInterface instanceof i10iloi) {
/* 15 */                return (i10iloi) iInterfaceQueryLocalInterface;
                    }
/* 20 */            i10iIiOOo i10iiiooo = new i10iIiOOo();
/* 23 */            i10iiiooo.I000II = iBinder;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return i10iiiooo;
                }

                @Override
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 3 */             if (i == 1) {
/* 66 */                IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 70 */                i0loiIo0lI.I00000oIO(parcel);
/* 73 */                i10i1O i10i1oNewTextRecognizer = newTextRecognizer(ioOlilli0olI00O0i0ii);
/* 77 */                parcel2.writeNoException();
/* 80 */                if (i10i1oNewTextRecognizer == null) {
/* 82 */                    parcel2.writeStrongBinder(null);
/* 2 */                     return true;
                        }
/* 90 */                parcel2.writeStrongBinder(i10i1oNewTextRecognizer.asBinder());
/* 2 */                 return true;
                    }
/* 6 */             if (i != 2) {
/* 8 */                 return false;
                    }
/* 14 */            IoOlilli0ol ioOlilli0olI00O0i0ii2 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 18 */            Parcelable.Creator<i10l0iOo01i> creator = i10l0iOo01i.CREATOR;
/* 20 */            int i3 = i0loiIo0lI.I00000oIO;
/* 30 */            i10l0iOo01i i10l0ioo01iCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
/* 38 */            i0loiIo0lI.I00000oIO(parcel);
/* 41 */            i10i1O i10i1oNewTextRecognizerWithOptions = newTextRecognizerWithOptions(ioOlilli0olI00O0i0ii2, i10l0ioo01iCreateFromParcel);
/* 45 */            parcel2.writeNoException();
/* 48 */            if (i10i1oNewTextRecognizerWithOptions == null) {
/* 50 */                parcel2.writeStrongBinder(null);
/* 2 */                 return true;
                    }
/* 58 */            parcel2.writeStrongBinder(i10i1oNewTextRecognizerWithOptions.asBinder());
/* 2 */             return true;
                }
            }

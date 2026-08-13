            package p000;

            import android.graphics.drawable.Drawable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class Ii0OoO01Oo0 implements OoI1O1iOio00 {
                public IoiOl01IilO I00000oIO;
                public int I00000oOI;

                @Override
                public final void I00000oIO() {
/* 3 */             IoiOl01IilO ioiOl01IilO = this.I00000oIO;
/* 5 */             Drawable drawableI00000oIO = ioiOl01IilO.I00000oIO();
/* 13 */            OiO0llO0IO oiO0llO0IO = ioiOl01IilO.I00000oOI().I001i1O0Ol;
/* 15 */            int i = this.I00000oOI;
/* 30 */            boolean z = ((ioiOl01IilO instanceof OliOlO1o1) && ((OliOlO1o1) ioiOl01IilO).I000II) ? false : true;
/* 31 */            Ii0Oilo0 ii0Oilo0 = new Ii0Oilo0();
/* 34 */            ii0Oilo0.I00iOIl = oiO0llO0IO;
/* 36 */            ii0Oilo0.I00iiI = i;
/* 38 */            ii0Oilo0.I00iiO = z;
/* 45 */            ii0Oilo0.I00iio = new ArrayList();
/* 64 */            ii0Oilo0.I00ilI0I1 = ii0Oilo0.I00000oIO(null, drawableI00000oIO != null ? Integer.valueOf(drawableI00000oIO.getIntrinsicWidth()) : null);
/* 82 */            ii0Oilo0.I00ilO0 = ii0Oilo0.I00000oIO(null, drawableI00000oIO != null ? Integer.valueOf(drawableI00000oIO.getIntrinsicHeight()) : null);
/* 86 */            ii0Oilo0.I00ioIO = 255;
/* 88 */            ii0Oilo0.I00l0OO0IO = null;
/* 92 */            Drawable drawableMutate = drawableI00000oIO != null ? drawableI00000oIO.mutate() : null;
/* 96 */            ii0Oilo0.I00li1OI = drawableMutate;
/* 98 */            if (i <= 0) {
/* 121 */               I000II.I000iOII("durationMillis must be > 0.");
/* 245 */               return;
                    }
/* 100 */           Drawable drawable = ii0Oilo0.I00l0OO0IO;
/* 102 */           if (drawable != null) {
/* 105 */               drawable.setCallback(ii0Oilo0);
                    }
/* 108 */           if (drawableMutate != null) {
/* 114 */               drawableMutate.setCallback(ii0Oilo0);
                    }
/* 110 */           VarHandle.storeStoreFence();
                }
            }

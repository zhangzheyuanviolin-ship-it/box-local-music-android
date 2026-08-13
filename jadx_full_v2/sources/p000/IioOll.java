            package p000;

            import android.graphics.Color;
            import android.os.Build;
            import android.view.View;
            import android.view.ViewGroup;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class IioOll {
                public static final int I00000oIO = Color.argb(230, 255, 255, 255);
                public static final int I00000oOI = Color.argb(Barcode.FORMAT_ITF, 27, 27, 27);
                public static Iioi0OlliO I0000Il00O;

                public static void I00000oIO(IOiO1Ol iOiO1Ol) {
/* 5 */             OiioI1Io0o oiioI1Io0o = new OiioI1Io0o(19);
/* 10 */            OllO11I0Ooo ollO11I0Ooo = new OllO11I0Ooo();
/* 14 */            ollO11I0Ooo.I00000oIO = 0;
/* 16 */            ollO11I0Ooo.I00000oOI = 0;
/* 18 */            ollO11I0Ooo.I0000Il00O = oiioI1Io0o;
/* 20 */            VarHandle.storeStoreFence();
/* 25 */            OiioI1Io0o oiioI1Io0o2 = new OiioI1Io0o(19);
/* 30 */            OllO11I0Ooo ollO11I0Ooo2 = new OllO11I0Ooo();
/* 35 */            ollO11I0Ooo2.I00000oIO = I00000oIO;
/* 39 */            ollO11I0Ooo2.I00000oOI = I00000oOI;
/* 41 */            ollO11I0Ooo2.I0000Il00O = oiioI1Io0o2;
/* 43 */            VarHandle.storeStoreFence();
/* 50 */            View decorView = iOiO1Ol.getWindow().getDecorView();
/* 54 */            Iioi0OlliO iioi0ilo1oi0 = I0000Il00O;
/* 56 */            if (iioi0ilo1oi0 == null) {
/* 72 */                iioi0ilo1oi0 = Build.VERSION.SDK_INT >= 35 ? new Iioi0ilo1oi0() : new Iioi0OlliO();
/* 75 */                I0000Il00O = iioi0ilo1oi0;
                    }
/* 79 */            IioOIoool1 iioOIoool1 = new IioOIoool1(0);
/* 82 */            iioOIoool1.I00iiI = iioi0ilo1oi0;
/* 84 */            iioOIoool1.I00iiO = ollO11I0Ooo;
/* 86 */            iioOIoool1.I00iio = ollO11I0Ooo2;
/* 88 */            iioOIoool1.I00ilI0I1 = iOiO1Ol;
/* 90 */            iioOIoool1.I00ilO0 = decorView;
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            ViewGroup viewGroup = (ViewGroup) decorView;
/* 101 */           I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(8);
/* 104 */           i01I0Iioooo0.I00iiO = viewGroup;
/* 106 */           VarHandle.storeStoreFence();
                    while (true) {
/* 113 */               if (!i01I0Iioooo0.hasNext()) {
/* 136 */                   IioOO00O00 iioOO00O00 = new IioOO00O00(iioOIoool1, viewGroup.getContext());
/* 139 */                   iioOO00O00.setTag(iioi0ilo1oi0);
/* 142 */                   iioOO00O00.setVisibility(8);
/* 146 */                   iioOO00O00.setWillNotDraw(true);
/* 149 */                   viewGroup.addView(iioOO00O00);
                            break;
                        }
/* 127 */               if (((View) i01I0Iioooo0.next()).getTag() instanceof IioOoIooO) {
                            break;
                        }
                    }
/* 152 */           iioOIoool1.run();
/* 159 */           iioi0ilo1oi0.I00000oOI(iOiO1Ol.getWindow());
                }
            }

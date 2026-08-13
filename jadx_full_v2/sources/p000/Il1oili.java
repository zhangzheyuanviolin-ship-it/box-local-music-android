            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.WindowManager;
            import androidx.window.extensions.layout.FoldingFeature;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class Il1oili {
                public static Io1IIIi01 I00000oIO(i00lo01io i00lo01ioVar, FoldingFeature foldingFeature) {
                    I0OooiI1I i0OooiI1I;
                    IIlIi0lIii iIlIi0lIii;
/* 1 */             int type = foldingFeature.getType();
/* 7 */             if (type == 1) {
/* 16 */                i0OooiI1I = I0OooiI1I.I00ilO0;
                    } else {
/* 9 */                 if (type != 2) {
/* 122 */                   return null;
                        }
/* 13 */                i0OooiI1I = I0OooiI1I.I00io1l;
                    }
/* 18 */            int state = foldingFeature.getState();
/* 22 */            if (state == 1) {
/* 30 */                iIlIi0lIii = IIlIi0lIii.I00ilO0;
                    } else {
/* 24 */                if (state != 2) {
/* 122 */                   return null;
                        }
/* 27 */                iIlIi0lIii = IIlIi0lIii.I00io1l;
                    }
/* 38 */            II1i0o0 iI1i0o0 = new II1i0o0(foldingFeature.getBounds());
/* 43 */            Rect rectI0000Il00O = i00lo01ioVar.I00000oIO.I0000Il00O();
/* 51 */            if (iI1i0o0.I00000oIO() == 0 && iI1i0o0.I00000oOI() == 0) {
/* 122 */               return null;
                    }
/* 68 */            if (iI1i0o0.I00000oOI() != rectI0000Il00O.width() && iI1i0o0.I00000oIO() != rectI0000Il00O.height()) {
/* 122 */               return null;
                    }
/* 89 */            if (iI1i0o0.I00000oOI() < rectI0000Il00O.width() && iI1i0o0.I00000oIO() < rectI0000Il00O.height()) {
/* 122 */               return null;
                    }
/* 110 */           if (iI1i0o0.I00000oOI() == rectI0000Il00O.width() && iI1i0o0.I00000oIO() == rectI0000Il00O.height()) {
/* 122 */               return null;
                    }
/* 135 */           return new Io1IIIi01(new II1i0o0(foldingFeature.getBounds()), i0OooiI1I, iIlIi0lIii);
                }

                public static i00lliOilOo I00000oOI(i00lo01io i00lo01ioVar, WindowLayoutInfo windowLayoutInfo) {
/* 1 */             List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (FoldingFeature foldingFeature : displayFeatures) {
/* 39 */                Io1IIIi01 io1IIIi01I00000oIO = foldingFeature instanceof FoldingFeature ? I00000oIO(i00lo01ioVar, foldingFeature) : null;
/* 40 */                if (io1IIIi01I00000oIO != null) {
/* 42 */                    arrayList.add(io1IIIi01I00000oIO);
                        }
                    }
/* 48 */            return new i00lliOilOo(arrayList);
                }

                public static i00lliOilOo I0000Il00O(Context context, WindowLayoutInfo windowLayoutInfo) {
/* 50 */            IOOi1I.I00000oIO(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(Barcode.FORMAT_ITF));
/* 76 */            WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
/* 84 */            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
/* 92 */            float density = windowManager.getCurrentWindowMetrics().getDensity();
/* 98 */            II1i0o0 iI1i0o0 = new II1i0o0(bounds);
/* 101 */           i00lo01io i00lo01ioVar = new i00lo01io();
/* 104 */           i00lo01ioVar.I00000oIO = iI1i0o0;
/* 106 */           i00lo01ioVar.I00000oOI = density;
/* 108 */           VarHandle.storeStoreFence();
/* 111 */           return I00000oOI(i00lo01ioVar, windowLayoutInfo);
                }
            }

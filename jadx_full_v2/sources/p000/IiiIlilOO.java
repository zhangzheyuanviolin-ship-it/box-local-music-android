            package p000;

            import android.content.Context;
            import android.graphics.Point;
            import android.hardware.display.DisplayManager;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Size;
            import android.view.Display;
            import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Locale;
            
            public final class IiiIlilOO {
                public static final IIIOlol I000II = new IIIOlol(11);
                public static final Size I000O01llI0 = new Size(1920, 1080);
                public static final Size I000OOo1O = new Size(320, 240);
                public static final Size I000OiO = new Size(640, 480);
                public static volatile IiiIlilOO I000iOII;
                public final I0IIiO0iI I00000oIO;
                public final Oi0Oooi I00000oOI;
                public final Object I0000Il00O;
                public volatile Display[] I0000O;
                public final DisplayManager I0000oI00;
                public volatile Size I0001Ioi1lo;

                public IiiIlilOO(Context context) {
/* 12 */            ExtraCroppingQuirk extraCroppingQuirk = (ExtraCroppingQuirk) IiOoli.I00000oIO(ExtraCroppingQuirk.class);
/* 16 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(17);
/* 19 */            i0IIiO0iI.I00iiI = extraCroppingQuirk;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            this.I00000oIO = i0IIiO0iI;
/* 31 */            Oi0Oooi oi0Oooi = new Oi0Oooi(8, false);
/* 42 */            oi0Oooi.I00iiI = (SmallDisplaySizeQuirk) IiOoli.I00000oIO(SmallDisplaySizeQuirk.class);
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            this.I00000oOI = oi0Oooi;
/* 54 */            this.I0000Il00O = new Object();
/* 58 */            IiiIliIoO iiiIliIoO = new IiiIliIoO(0);
/* 61 */            iiiIliIoO.I00000oOI = this;
/* 63 */            VarHandle.storeStoreFence();
/* 72 */            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
/* 83 */            displayManager.registerDisplayListener(iiiIliIoO, new Handler(Looper.getMainLooper()));
/* 86 */            this.I0000oI00 = displayManager;
                }

                public final Size I00000oIO() {
                    Size sizeI00000oOI;
/* 3 */             Point point = new Point();
/* 11 */            I00000oOI(false).getRealSize(point);
/* 20 */            Size size = new Size(point.x, point.y);
/* 33 */            if (Ol0ilIo.I00000oIO(size) < Ol0ilIo.I00000oIO(I000OOo1O)) {
/* 60 */                Size size2 = ((SmallDisplaySizeQuirk) this.I00000oOI.I00iiI) != null ? (Size) SmallDisplaySizeQuirk.I00000oIO.get(Build.MODEL.toUpperCase(Locale.ROOT)) : null;
/* 61 */                if (size2 == null) {
/* 63 */                    size2 = I000OiO;
                        }
/* 65 */                size = size2;
                    }
/* 74 */            if (size.getHeight() > size.getWidth()) {
/* 86 */                size = new Size(size.getHeight(), size.getWidth());
                    }
/* 90 */            Size size3 = I000O01llI0;
/* 100 */           if (Ol0ilIo.I00000oIO(size3) < Ol0ilIo.I00000oIO(size)) {
/* 102 */               size = size3;
                    }
/* 109 */           if (((ExtraCroppingQuirk) this.I00000oIO.I00iiI) != null && (sizeI00000oOI = ExtraCroppingQuirk.I00000oOI(Olilol.I00iOIl)) != null) {
/* 139 */               if (sizeI00000oOI.getHeight() * sizeI00000oOI.getWidth() > size.getHeight() * size.getWidth()) {
/* 141 */                   return sizeI00000oOI;
                        }
                    }
/* 245 */           return size;
                }

                public final Display I00000oOI(boolean z) {
                    Display[] displays;
                    int i;
                    synchronized (this.I0000Il00O) {
/* 4 */                 displays = this.I0000O;
/* 6 */                 if (displays == null) {
/* 12 */                    displays = this.I0000oI00.getDisplays();
/* 16 */                    this.I0000O = displays;
                        }
                    }
/* 22 */            if (displays.length == 1) {
/* 24 */                return displays[0];
                    }
/* 28 */            int i2 = -1;
/* 30 */            int i3 = -1;
/* 31 */            Display display = null;
/* 32 */            Display display2 = null;
/* 33 */            for (Display display3 : displays) {
/* 39 */                Point point = new Point();
/* 42 */                display3.getRealSize(point);
/* 49 */                int i4 = point.x * point.y;
/* 50 */                if (i4 > i2) {
/* 52 */                    display = display3;
/* 53 */                    i2 = i4;
                        }
/* 58 */                if (display3.getState() != 1 && (i = point.x * point.y) > i3) {
/* 67 */                    display2 = display3;
/* 68 */                    i3 = i;
                        }
                    }
/* 72 */            if (z && display2 != null) {
/* 77 */                display = display2;
                    }
/* 78 */            if (display != null) {
/* 80 */                return display;
                    }
/* 89 */            IOOlIIilOl0.I000O01llI0("No displays found from ", 33, Arrays.toString(displays));
/* 29 */            return null;
                }

                public final Size I0000Il00O() {
                    synchronized (this.I0000Il00O) {
/* 6 */                 if (this.I0001Ioi1lo != null) {
/* 8 */                     return this.I0001Ioi1lo;
                        }
/* 18 */                this.I0001Ioi1lo = I00000oIO();
/* 20 */                return this.I0001Ioi1lo;
                    }
                }
            }

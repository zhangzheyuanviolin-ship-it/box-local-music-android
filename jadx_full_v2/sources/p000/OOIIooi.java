            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.hardware.display.DisplayManager;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Rational;
            import android.util.Size;
            import android.view.Display;
            import android.view.GestureDetector;
            import android.view.ViewConfiguration;
            import android.view.Window;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
            import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OOIIooi extends FrameLayout {
                public OOIIo1 I00iOIl;
                public OOIO1OOiI0 I00iiI;
                public final OiOOo110O I00iiO;
                public final OOIIloi0 I00iio;
                public boolean I00ilI0I1;
                public final OI0lOii0I I00ilO0;
                public final AtomicReference I00io1l;
                public final OOIOI1oI I00ioIO;
                public IIllOioOlolI I00l0I0l0lO1;
                public final IiiIliIoO I00l0OO0IO;
                public final OOIIo0OIoOll I00li1OI;
                public final iiOlilo0IIIl I00ll1;

                public OOIIooi(Context context) {
/* 4 */             super(context, null, 0, 0);
/* 9 */             this.I00iOIl = OOIIo1.PERFORMANCE;
/* 13 */            OOIIloi0 oOIIloi0 = new OOIIloi0();
/* 18 */            oOIIloi0.I000O01llI0 = OOIIoilo1l.FILL_CENTER;
/* 20 */            this.I00iio = oOIIloi0;
/* 23 */            this.I00ilI0I1 = true;
/* 32 */            this.I00ilO0 = new OI0lOii0I(OOIIollIo.I00iOIl);
/* 39 */            this.I00io1l = new AtomicReference();
/* 43 */            OOIOI1oI oOIOI1oI = new OOIOI1oI();
/* 47 */            oOIOI1oI.I00000oOI = null;
/* 49 */            oOIOI1oI.I00000oIO = oOIIloi0;
/* 51 */            VarHandle.storeStoreFence();
/* 54 */            this.I00ioIO = oOIOI1oI;
/* 58 */            IiiIliIoO iiiIliIoO = new IiiIliIoO(1);
/* 61 */            iiiIliIoO.I00000oOI = this;
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            this.I00l0OO0IO = iiiIliIoO;
/* 70 */            OOIIo0OIoOll oOIIo0OIoOll = new OOIIo0OIoOll();
/* 73 */            oOIIo0OIoOll.I00000oIO = this;
/* 75 */            VarHandle.storeStoreFence();
/* 78 */            this.I00li1OI = oOIIo0OIoOll;
/* 82 */            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 85 */            iiolilo0iiil.I00iOIl = this;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            this.I00ll1 = iiolilo0iiil;
/* 92 */            lOllIO.I00000oIO();
/* 95 */            Resources.Theme theme = context.getTheme();
/* 99 */            int[] iArr = OOil1Ooio0i.I00000oIO;
/* 101 */           TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
/* 105 */           WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 109 */           OooiO1oOi1.I00000oOI(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
                    try {
/* 116 */               int integer = typedArrayObtainStyledAttributes.getInteger(1, oOIIloi0.I000O01llI0.I00iOIl);
/* 127 */               for (OOIIoilo1l oOIIoilo1l : OOIIoilo1l.values()) {
/* 133 */                   if (oOIIoilo1l.I00iOIl == integer) {
/* 135 */                       setScaleType(oOIIoilo1l);
/* 138 */                       int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
/* 148 */                       for (OOIIo1 oOIIo1 : OOIIo1.values()) {
/* 154 */                           if (oOIIo1.I00iOIl == integer2) {
/* 156 */                               setImplementationMode(oOIIo1);
/* 159 */                               typedArrayObtainStyledAttributes.recycle();
/* 168 */                               ViewConfiguration.get(context).getScaledTouchSlop();
/* 183 */                               new GestureDetector(context, new i0I0l100(new Iioi0lilII(17)));
/* 186 */                               VarHandle.storeStoreFence();
/* 193 */                               if (getBackground() == null) {
/* 206 */                                   setBackgroundColor(getContext().getColor(R.color.black));
                                        }
/* 211 */                               OiOOo110O oiOOo110O = new OiOOo110O(context, null, 0, 0);
/* 215 */                               oiOOo110O.setBackgroundColor(-1);
/* 219 */                               oiOOo110O.setAlpha(0.0f);
/* 225 */                               oiOOo110O.setElevation(Float.MAX_VALUE);
/* 228 */                               this.I00iiO = oiOOo110O;
/* 235 */                               oiOOo110O.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
/* 238 */                               return;
                                    }
                                }
/* 264 */                       throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                            }
                        }
/* 288 */               throw new IllegalArgumentException("Unknown scale type id " + integer);
                    } catch (Throwable th) {
/* 289 */               typedArrayObtainStyledAttributes.recycle();
/* 437 */               throw th;
                    }
                }

                public static boolean I00000oOI(Oll0I0l1i1 oll0I0l1i1, OOIIo1 oOIIo1) {
/* 13 */            boolean zEquals = oll0I0l1i1.I0000O.I0010o().I000lI().equals("androidx.camera.camera2.legacy");
/* 42 */            boolean z = (IiOolI1.I00000oIO.I00000oOI(SurfaceViewStretchedQuirk.class) == null && IiOolI1.I00000oIO.I00000oOI(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
/* 43 */            if (!zEquals && !z) {
/* 48 */                int iOrdinal = oOIIo1.ordinal();
/* 52 */                if (iOrdinal == 0) {
/* 25 */                    return false;
                        }
/* 54 */                if (iOrdinal != 1) {
/* 59 */                    IioIoO10iOiI.I000OiO("Invalid implementation mode: ", oOIIo1);
/* 62 */                    return false;
                        }
                    }
/* 26 */            return true;
                }

                private DisplayManager getDisplayManager() {
/* 1 */             Context context = getContext();
/* 5 */             if (context == null) {
/* 7 */                 return null;
                    }
/* 15 */            return (DisplayManager) context.getSystemService("display");
                }

                private Ioi11lOIIO0O getScreenFlashInternal() {
/* 3 */             return this.I00iiO.getScreenFlash();
                }

                private int getViewPortScaleType() {
/* 5 */             int iOrdinal = getScaleType().ordinal();
/* 9 */             if (iOrdinal == 0) {
/* 39 */                return 0;
                    }
/* 11 */            int i = 1;
/* 12 */            if (iOrdinal != 1) {
/* 14 */                i = 2;
/* 15 */                if (iOrdinal != 2) {
/* 17 */                    i = 3;
/* 18 */                    if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
/* 33 */                        IoOOl0iOl1io.I0010I0i("Unexpected scale type: ", getScaleType());
/* 36 */                        return 0;
                            }
                        }
                    }
/* 38 */            return i;
                }

                private void setScreenFlashUiInfo(Ioi11lOIIO0O ioi11lOIIO0O) {
/* 4 */             l11I11lO.I0000O(3, "PreviewView");
                }

                public final void I00000oIO() {
                    Rect rect;
                    Display defaultDisplay;
                    IIllOioOlolI iIllOioOlolI;
/* 1 */             lOllIO.I00000oIO();
/* 6 */             if (this.I00iiI != null) {
/* 10 */                if (this.I00ilI0I1 && (defaultDisplay = getDefaultDisplay()) != null && (iIllOioOlolI = this.I00l0I0l0lO1) != null) {
/* 22 */                    OOIIloi0 oOIIloi0 = this.I00iio;
/* 28 */                    int iI000o00OoI0I = iIllOioOlolI.I000o00OoI0I(defaultDisplay.getRotation());
/* 32 */                    int rotation = defaultDisplay.getRotation();
/* 38 */                    if (oOIIloi0.I000II) {
/* 41 */                        oOIIloi0.I0000Il00O = iI000o00OoI0I;
/* 43 */                        oOIIloi0.I0000oI00 = rotation;
                            }
                        }
/* 47 */                this.I00iiI.I0001Ioi1lo();
                    }
/* 50 */            OOIOI1oI oOIOI1oI = this.I00ioIO;
/* 62 */            Size size = new Size(getWidth(), getHeight());
/* 65 */            int layoutDirection = getLayoutDirection();
/* 69 */            oOIOI1oI.getClass();
/* 72 */            lOllIO.I00000oIO();
                    synchronized (oOIOI1oI) {
                        try {
/* 80 */                    if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = oOIOI1oI.I00000oOI) != null) {
/* 95 */                        oOIOI1oI.I00000oIO.I00000oIO(size, layoutDirection, rect);
                            }
                        } finally {
                        }
                    }
                }

                public Bitmap getBitmap() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             OOIO1OOiI0 oOIO1OOiI0 = this.I00iiI;
/* 6 */             if (oOIO1OOiI0 == null) {
/* 17 */                return null;
                    }
/* 9 */             FrameLayout frameLayout = oOIO1OOiI0.I00000oOI;
/* 11 */            Bitmap bitmapI00000oOI = oOIO1OOiI0.I00000oOI();
/* 15 */            if (bitmapI00000oOI == null) {
/* 17 */                return null;
                    }
/* 19 */            OOIIloi0 oOIIloi0 = oOIO1OOiI0.I0000Il00O;
/* 31 */            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
/* 34 */            int layoutDirection = frameLayout.getLayoutDirection();
/* 42 */            if (!oOIIloi0.I0001Ioi1lo()) {
/* 44 */                return bitmapI00000oOI;
                    }
/* 45 */            Matrix matrixI0000O = oOIIloi0.I0000O();
/* 49 */            RectF rectFI0000oI00 = oOIIloi0.I0000oI00(layoutDirection, size);
/* 65 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapI00000oOI.getConfig());
/* 71 */            Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 76 */            Matrix matrix = new Matrix();
/* 79 */            matrix.postConcat(matrixI0000O);
/* 106 */           matrix.postScale(rectFI0000oI00.width() / oOIIloi0.I00000oIO.getWidth(), rectFI0000oI00.height() / oOIIloi0.I00000oIO.getHeight());
/* 113 */           matrix.postTranslate(rectFI0000oI00.left, rectFI0000oI00.top);
/* 122 */           canvas.drawBitmap(bitmapI00000oOI, matrix, new Paint(7));
/* 245 */           return bitmapCreateBitmap;
                }

                public IIlOIio1 getController() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             return null;
                }

                public Display getDefaultDisplay() {
/* 5 */             if (getDisplay() == null) {
/* 7 */                 return null;
                    }
/* 14 */            Display display = getDisplayManager().getDisplay(0);
                    return display != null ? display : getDisplay();
                }

                public OOIIo1 getImplementationMode() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             return this.I00iOIl;
                }

                public O1lioO0 getMeteringPointFactory() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             return this.I00ioIO;
                }

                public OIlIiI1ooO0I getOutputTransform() {
                    Matrix matrixI0000Il00O;
/* 1 */             OOIIloi0 oOIIloi0 = this.I00iio;
/* 3 */             lOllIO.I00000oIO();
                    try {
/* 24 */                matrixI0000Il00O = oOIIloi0.I0000Il00O(getLayoutDirection(), new Size(getWidth(), getHeight()));
                    } catch (IllegalStateException unused) {
/* 29 */                matrixI0000Il00O = null;
                    }
/* 30 */            Rect rect = oOIIloi0.I00000oOI;
/* 34 */            if (matrixI0000Il00O == null || rect == null) {
/* 110 */               l11I11lO.I0000O(3, "PreviewView");
/* 6 */                 return null;
                    }
/* 39 */            RectF rectF = OoI0lIiO.I00000oIO;
/* 43 */            RectF rectF2 = new RectF(rect);
/* 48 */            Matrix matrix = new Matrix();
/* 55 */            matrix.setRectToRect(OoI0lIiO.I00000oIO, rectF2, Matrix.ScaleToFit.FILL);
/* 58 */            matrixI0000Il00O.preConcat(matrix);
/* 65 */            if (this.I00iiI instanceof Oo0oI1oo) {
/* 71 */                matrixI0000Il00O.postConcat(getMatrix());
                    } else if (!getMatrix().isIdentity()) {
/* 87 */                l11I11lO.I0000oI00("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
                    }
/* 102 */           new Size(rect.width(), rect.height());
/* 105 */           return new OIlIiI1ooO0I();
                }

                public O110lI getPreviewStreamState() {
/* 1 */             return this.I00ilO0;
                }

                public OOIIoilo1l getScaleType() {
/* 1 */             lOllIO.I00000oIO();
/* 6 */             return this.I00iio.I000O01llI0;
                }

                public Ioi11lOIIO0O getScreenFlash() {
/* 1 */             return getScreenFlashInternal();
                }

                public Matrix getSensorToViewTransform() {
/* 1 */             lOllIO.I00000oIO();
/* 9 */             if (getWidth() == 0 || getHeight() == 0) {
/* 8 */                 return null;
                    }
/* 28 */            Size size = new Size(getWidth(), getHeight());
/* 31 */            int layoutDirection = getLayoutDirection();
/* 35 */            OOIIloi0 oOIIloi0 = this.I00iio;
/* 41 */            if (!oOIIloi0.I0001Ioi1lo()) {
/* 8 */                 return null;
                    }
/* 48 */            Matrix matrix = new Matrix(oOIIloi0.I0000O);
/* 55 */            matrix.postConcat(oOIIloi0.I0000Il00O(layoutDirection, size));
/* 110 */           return matrix;
                }

                public OOIIOiIoll0 getSurfaceProvider() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             return this.I00ll1;
                }

                public OoolOIII1O getViewPort() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             Display defaultDisplay = getDefaultDisplay();
/* 9 */             if (defaultDisplay == null) {
/* 8 */                 return null;
                    }
/* 12 */            defaultDisplay.getRotation();
/* 15 */            lOllIO.I00000oIO();
/* 22 */            if (getWidth() == 0 || getHeight() == 0) {
/* 8 */                 return null;
                    }
/* 41 */            new Rational(getWidth(), getHeight());
/* 44 */            getViewPortScaleType();
/* 47 */            getLayoutDirection();
/* 52 */            return new OoolOIII1O();
                }

                @Override
                public final void onAttachedToWindow() {
                    DisplayManager displayManager;
/* 1 */             super.onAttachedToWindow();
/* 8 */             if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
/* 28 */                displayManager.registerDisplayListener(this.I00l0OO0IO, new Handler(Looper.getMainLooper()));
                    }
/* 33 */            addOnLayoutChangeListener(this.I00li1OI);
/* 36 */            OOIO1OOiI0 oOIO1OOiI0 = this.I00iiI;
/* 38 */            if (oOIO1OOiI0 != null) {
/* 40 */                oOIO1OOiI0.I0000Il00O();
                    }
/* 43 */            lOllIO.I00000oIO();
/* 46 */            getViewPort();
                }

                @Override
                public final void onDetachedFromWindow() {
                    DisplayManager displayManager;
/* 1 */             super.onDetachedFromWindow();
/* 6 */             removeOnLayoutChangeListener(this.I00li1OI);
/* 9 */             OOIO1OOiI0 oOIO1OOiI0 = this.I00iiI;
/* 11 */            if (oOIO1OOiI0 != null) {
/* 13 */                oOIO1OOiI0.I0000O();
                    }
/* 20 */            if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
/* 55 */                return;
                    }
/* 31 */            displayManager.unregisterDisplayListener(this.I00l0OO0IO);
                }

                public void setController(IIlOIio1 iIlOIio1) {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             lOllIO.I00000oIO();
/* 7 */             getViewPort();
/* 14 */            setScreenFlashUiInfo(getScreenFlashInternal());
                }

                public void setImplementationMode(OOIIo1 oOIIo1) {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             this.I00iOIl = oOIIo1;
                }

                public void setScaleType(OOIIoilo1l oOIIoilo1l) {
/* 1 */             lOllIO.I00000oIO();
/* 6 */             this.I00iio.I000O01llI0 = oOIIoilo1l;
/* 8 */             I00000oIO();
/* 11 */            lOllIO.I00000oIO();
/* 14 */            getViewPort();
                }

                public void setScreenFlashOverlayColor(int i) {
/* 3 */             this.I00iiO.setBackgroundColor(i);
                }

                public void setScreenFlashWindow(Window window) {
/* 1 */             lOllIO.I00000oIO();
/* 6 */             this.I00iiO.setScreenFlashWindow(window);
/* 13 */            setScreenFlashUiInfo(getScreenFlashInternal());
                }
            }

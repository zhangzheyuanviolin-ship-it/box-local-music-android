            package p000;

            import android.R;
            import android.animation.Animator;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.BitmapShader;
            import android.graphics.Rect;
            import android.graphics.Shader;
            import android.graphics.SurfaceTexture;
            import android.graphics.drawable.AnimationDrawable;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.ClipDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.ShapeDrawable;
            import android.graphics.drawable.shapes.RoundRectShape;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.os.Bundle;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.Range;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.ViewGroup;
            import android.widget.AbsSeekBar;
            import com.google.ai.edge.litertlm.Engine;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.FileReader;
            import java.io.FileWriter;
            import java.io.IOException;
            import java.io.PrintWriter;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 34 */    public class I1I0i0Ilo1Oi implements i0I0OoIIOO01, I111ioIIo01, I11I1001I, Illo1O0O10l, IIoi0lIOo, IOIO1OOOO0, Oli1llO, OIOOO10lIo, OIiOolI1lio {
                public static final int[] I00iio = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I1I0i0Ilo1Oi(Map map) {
/* 3 */             this.I00iOIl = 20;
/* 8 */             this.I00iiI = map;
/* 14 */            O1I0OloI o1I0OloI = new O1I0OloI("Java nullability annotation states");
/* 21 */            I00iiI i00iiI = new I00iiI(26);
/* 24 */            i00iiI.I00iiI = this;
/* 26 */            VarHandle.storeStoreFence();
/* 33 */            this.I00iiO = o1I0OloI.I0000Il00O(i00iiI);
                }

                public static Il0oiioiOlI I00IioO0OiOi(IoiOl011o ioiOl011o, Throwable th) {
/* 5 */             if (th instanceof OIOIo0ioiIoi) {
/* 7 */                 ioiOl011o.getClass();
/* 10 */                IiI0llI1IoIi iiI0llI1IoIi = ioiOl011o.I001l0I00;
/* 12 */                iiI0llI1IoIi.getClass();
/* 15 */                IiI0llI1IoIi iiI0llI1IoIi2 = I0001Ioi1lo.I00000oIO;
/* 17 */                iiI0llI1IoIi.getClass();
                    } else {
/* 23 */                ioiOl011o.I001l0I00.getClass();
/* 26 */                IiI0llI1IoIi iiI0llI1IoIi3 = I0001Ioi1lo.I00000oIO;
                    }
/* 28 */            Il0oiioiOlI il0oiioiOlI = new Il0oiioiOlI();
/* 32 */            il0oiioiOlI.I00000oIO = null;
/* 34 */            il0oiioiOlI.I00000oOI = ioiOl011o;
/* 36 */            il0oiioiOlI.I0000Il00O = th;
/* 38 */            VarHandle.storeStoreFence();
/* 106 */           return il0oiioiOlI;
                }

                public static File I00IoiI() {
/* 3 */             String property = System.getProperty("pdfbox.fontcache");
/* 7 */             if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty("user.home")) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
/* 63 */                property = System.getProperty("java.io.tmpdir");
                    }
/* 71 */            return new File(property, ".pdfbox.cache");
                }

                public static I1I0i0Ilo1Oi I00Iooi00oi(O0oiOi o0oiOi) {
/* 6 */             Oool0l1iOIOl oool0l1iOIOlI000II = ((Oool1Ii0I) o0oiOi).I000II();
/* 12 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(18);
/* 15 */            i1I0i0Ilo1Oi.I00iiI = o0oiOi;
/* 32 */            i1I0i0Ilo1Oi.I00iiO = (O11ll1Ii0) new Oool0iOoooIo(oool0l1iOIOlI000II, O11ll1Ii0.I0000O).I00000oOI(O11ll1Ii0.class);
/* 34 */            VarHandle.storeStoreFence();
/* 77 */            return i1I0i0Ilo1Oi;
                }

                @Override
                public float I00000oIO() {
/* 11 */            return ((Number) ((Range) this.I00iiO).getUpper()).floatValue();
                }

                @Override
                public List I00000oOI(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol) {
/* 1 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(il01100l, 10));
/* 16 */            Iterator<E> it = il01100l.iterator();
/* 24 */            while (it.hasNext()) {
/* 44 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 106 */           return arrayList;
                }

                public void I0000Il00O(O0IOli0o0 o0IOli0o0, Function1 function1, Function1 function12, IOii1l iOii1l) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiI;
/* 9 */             if (linkedHashMap.containsKey(o0IOli0o0)) {
/* 39 */                IoOOl0iOl1io.I000O01llI0("An `entry` with the same `clazz` has already been added: ", 46, o0IOli0o0.I000oI1ioi());
/* 204 */               return;
                    }
/* 13 */            Il0lI0ool il0lI0ool = new Il0lI0ool();
/* 16 */            il0lI0ool.I00000oIO = o0IOli0o0;
/* 18 */            il0lI0ool.I00000oOI = function1;
/* 20 */            il0lI0ool.I0000Il00O = function12;
/* 22 */            il0lI0ool.I0000O = iOii1l;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            linkedHashMap.put(o0IOli0o0, il0lI0ool);
                }

                @Override
                public float I0000O() {
/* 11 */            return ((Number) ((Range) this.I00iiO).getLower()).floatValue();
                }

                @Override
                public List I0000oI00(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i) {
/* 3 */             if (!(i01Ilioliio instanceof OOOll1o0)) {
/* 8 */                 if (!(i01Ilioliio instanceof OOOo0i11Ol)) {
/* 113 */                   IOOlIIilOl0.I000lI("Unknown message: ", i01Ilioliio);
/* 116 */                   return null;
                        }
/* 10 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 15 */                if (iI001lIiIIo1O != 1 && iI001lIiIIo1O != 2 && iI001lIiIIo1O != 3) {
/* 62 */                    throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
                        }
                    }
/* 63 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 75 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(il01100l, 10));
/* 78 */            Iterator<E> it = il01100l.iterator();
/* 86 */            while (it.hasNext()) {
/* 106 */               arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 110 */           return arrayList;
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
                    switch (this.I00iOIl) {
                        case 6:
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 57 */                    lII1OI11o1I.I0000oI00(null, ((IIiOOI) this.I00iiI).I00000oOI(null));
                            break;
                        default:
/* 19 */                    lII1OI11o1I.I0000oI00("Unexpected result from SurfaceRequest. Surface was provided twice.", ((I1lIoo) obj).I00000oIO != 3);
/* 24 */                    l11I11lO.I0000O(3, "TextureViewImpl");
/* 31 */                    ((SurfaceTexture) this.I00iiI).release();
/* 38 */                    Oo0oI1oo oo0oI1oo = ((Oo0o1l) this.I00iiO).I00000oIO;
/* 42 */                    if (oo0oI1oo.I000OiO != null) {
/* 44 */                        oo0oI1oo.I000OiO = null;
                                break;
                            }
                            break;
                    }
                }

                @Override
                public Object I000II(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, O0iIl1 o0iIl1) {
/* 1 */             return null;
                }

                @Override
                public ArrayList I000O01llI0(OOi001oo1OOI oOi001oo1OOI, OI1IlOlol oI1IlOlol) {
/* 11 */            Iterable iterable = (List) oOi001oo1OOI.I000iOII(((IIIOIlo1oo0) this.I00iiI).I000iOII);
/* 13 */            if (iterable == null) {
/* 15 */                iterable = Il01100l.I00iOIl;
                    }
/* 17 */            Iterable iterable2 = iterable;
/* 27 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 30 */            Iterator it = iterable2.iterator();
/* 38 */            while (it.hasNext()) {
/* 54 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), oI1IlOlol));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public ArrayList I000OOo1O(OOi0O1i1lOi oOi0O1i1lOi, OI1IlOlol oI1IlOlol) {
/* 11 */            Iterable iterable = (List) oOi0O1i1lOi.I000iOII(((IIIOIlo1oo0) this.I00iiI).I000l1);
/* 13 */            if (iterable == null) {
/* 15 */                iterable = Il01100l.I00iOIl;
                    }
/* 17 */            Iterable iterable2 = iterable;
/* 27 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 30 */            Iterator it = iterable2.iterator();
/* 38 */            while (it.hasNext()) {
/* 54 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), oI1IlOlol));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public List I000OiO(O0OIoll1 o0OIoll1, OOOl0lIlIoil oOOl0lIlIoil) {
/* 11 */            Iterable iterable = (List) oOOl0lIlIoil.I000iOII(((IIIOIlo1oo0) this.I00iiI).I000O01llI0);
/* 13 */            if (iterable == null) {
/* 15 */                iterable = Il01100l.I00iOIl;
                    }
/* 17 */            Iterable iterable2 = iterable;
/* 27 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 30 */            Iterator it = iterable2.iterator();
/* 38 */            while (it.hasNext()) {
/* 58 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public Object I000iOII(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, O0iIl1 o0iIl1) {
/* 11 */            OOOOlIoIlOi oOOOlIoIlOi = (OOOOlIoIlOi) lIOIiol1IoI.I00000oIO(oOOo0i11Ol, ((IIIOIlo1oo0) this.I00iiI).I000OOo1O);
/* 13 */            if (oOOOlIoIlOi == null) {
/* 15 */                return null;
                    }
/* 25 */            return ((IIlio101Io) this.I00iiO).I0100i(o0iIl1, oOOOlIoIlOi, (OI1IlOlol) o0OIoll1.I00000oOI);
                }

                @Override
                public List I000l1(Integer num) {
/* 6 */             List listI000l1 = ((OIiOolI1lio) this.I00iiI).I000l1(null);
/* 12 */            Ol11il011o0 ol11il011o0 = (Ol11il011o0) this.I00iiO;
/* 14 */            int i = ol11il011o0.I001IO000;
                    return i < 0 ? listI000l1 : IOOi0Ool1i.I00O10llo(iilI1OO1.I00000oIO(ol11il011o0, num, i, Integer.valueOf(ol11il011o0.I00IO1(ol11il011o0.I00000oOI, i))), listI000l1);
                }

                @Override
                public Rect I000lI() {
/* 15 */            return (Rect) ((IIioli) ((IIloIoOOiO0l) this.I00iiI).I00000oOI).I0000O(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                }

                @Override
                public List I000o00OoI0I(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i, int i2, OOi0iiO0iOi oOi0iiO0iOi) {
/* 8 */             List listI00100o1O0lo = oOi0iiO0iOi != null ? I00100o1O0lo(o0OIoll1, i01Ilioliio, i, i2, oOi0iiO0iOi) : null;
                    return listI00100o1O0lo == null ? Il01100l.I00iOIl : listI00100o1O0lo;
                }

                @Override
                public boolean I000oI1ioi(IIoIil iIoIil) {
/* 1 */             O0il1o0oIi o0il1o0oIiI00O0o1oo = I00O0o1oo();
/* 11 */            OO0ii1lIiO oO0ii1lIiO = o0il1o0oIiI00O0o1oo != null ? o0il1o0oIiI00O0o1oo.I0001Ioi1lo : null;
/* 12 */            if (oO0ii1lIiO == null || oO0ii1lIiO.I0000Il00O()) {
/* 52 */                return true;
                    }
/* 20 */            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 26 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 30 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 34 */                return oO0ii1lIiO.I0000oI00(iIoIil);
                    } catch (Throwable th) {
                        try {
/* 43 */                    o0il1o0oIiI00O0o1oo.getClass();
/* 46 */                    throw th;
                        } finally {
/* 48 */                    iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
                        }
                    }
                }

                @Override
                public IiIOI1ol0o I00100l0(Ool1lo ool1lo) {
/* 7 */             ArrayList arrayListI000OiO = IOOi1I.I000OiO(CaptureRequest.CONTROL_ZOOM_RATIO);
/* 13 */            arrayListI000OiO.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
/* 16 */            Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 18 */            return ool1lo.I000OOo1O(arrayListI000OiO);
                }

                @Override
                public List I00100o1O0lo(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i, int i2, OOi0iiO0iOi oOi0iiO0iOi) {
/* 11 */            Iterable iterable = (List) oOi0iiO0iOi.I000iOII(((IIIOIlo1oo0) this.I00iiI).I000OiO);
/* 13 */            if (iterable == null) {
/* 15 */                iterable = Il01100l.I00iOIl;
                    }
/* 17 */            Iterable iterable2 = iterable;
/* 27 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 30 */            Iterator it = iterable2.iterator();
/* 38 */            while (it.hasNext()) {
/* 58 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 399 */           return arrayList;
                }

                @Override
                public IiIOI1ol0o I0010I0i(Ool1lo ool1lo) {
/* 1 */             float fI0000O = I0000O();
/* 13 */            if (1.0f > I00000oIO() || fI0000O > 1.0f) {
/* 84 */                I000II.I000iOII("Failed requirement.");
/* 87 */                return null;
                    }
/* 34 */            LinkedHashMap linkedHashMapI0000oI00 = O1Oii0O0loo.I0000oI00(new OIoi0IIoi(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f)));
/* 38 */            IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 44 */            IIlo0i0ll iIlo0i0ll = ((IIloIoOOiO0l) this.I00iiI).I00000oOI;
/* 46 */            iIlo0OOlI.getClass();
/* 57 */            int[] iArr = (int[]) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
/* 59 */            if (iArr != null && I1IoiO1l.I0000oI00(iArr, 1)) {
/* 74 */                linkedHashMapI0000oI00.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
                    }
/* 77 */            return Ool1lo.I0000O(ool1lo, linkedHashMapI0000oI00);
                }

                @Override
                public List I0010o(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol) {
/* 1 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(il01100l, 10));
/* 16 */            Iterator<E> it = il01100l.iterator();
/* 24 */            while (it.hasNext()) {
/* 44 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public boolean I00111O() {
/* 5 */             return ((OIiOolI1lio) this.I00iiI).I00111O();
                }

                @Override
                public boolean I001IIilI0O() {
                    OO0ii1lIiO oO0ii1lIiO;
/* 1 */             O0il1o0oIi o0il1o0oIiI00O0o1oo = I00O0o1oo();
/* 5 */             if (o0il1o0oIiI00O0o1oo == null || (oO0ii1lIiO = o0il1o0oIiI00O0o1oo.I0001Ioi1lo) == null) {
/* 16 */                return true;
                    }
/* 11 */            return oO0ii1lIiO.I0000Il00O();
                }

                @Override
                public ArrayList I001IO000(OOi1111IO0 oOi1111IO0) {
/* 13 */            Iterable iterable = (List) oOi1111IO0.I0000oI00.I000iOII(((IIIOIlo1oo0) this.I00iiI).I0000Il00O);
/* 15 */            if (iterable == null) {
/* 17 */                iterable = Il01100l.I00iOIl;
                    }
/* 19 */            Iterable iterable2 = iterable;
/* 29 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 32 */            Iterator it = iterable2.iterator();
/* 40 */            while (it.hasNext()) {
/* 60 */                arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) oOi1111IO0.I00000oOI));
                    }
/* 77 */            return arrayList;
                }

                @Override
                public List I001i1O0Ol(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i) {
                    List list;
/* 3 */             IIIOIlo1oo0 iIIOIlo1oo0 = (IIIOIlo1oo0) this.I00iiI;
/* 7 */             if (i01Ilioliio instanceof OOOiIOiii) {
/* 17 */                list = (List) ((OOOiIOiii) i01Ilioliio).I000iOII(iIIOIlo1oo0.I00000oOI);
                    } else if (i01Ilioliio instanceof OOOll1o0) {
/* 32 */                list = (List) ((OOOll1o0) i01Ilioliio).I000iOII(iIIOIlo1oo0.I0000O);
                    } else {
/* 38 */                if (!(i01Ilioliio instanceof OOOo0i11Ol)) {
/* 143 */                   IOOlIIilOl0.I000lI("Unknown message: ", i01Ilioliio);
/* 37 */                    return null;
                        }
/* 40 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 45 */                if (iI001lIiIIo1O == 1) {
/* 89 */                    list = (List) ((OOOo0i11Ol) i01Ilioliio).I000iOII(iIIOIlo1oo0.I0000oI00);
                        } else if (iI001lIiIIo1O == 2) {
/* 78 */                    list = (List) ((OOOo0i11Ol) i01Ilioliio).I000iOII(iIIOIlo1oo0.I0001Ioi1lo);
                        } else {
/* 51 */                    if (iI001lIiIIo1O != 3) {
/* 66 */                        I000II.I001IO000("Unsupported callable kind with property proto");
/* 37 */                        return null;
                            }
/* 61 */                    list = (List) ((OOOo0i11Ol) i01Ilioliio).I000iOII(iIIOIlo1oo0.I000II);
                        }
                    }
/* 91 */            if (list == null) {
/* 93 */                list = Il01100l.I00iOIl;
                    }
/* 95 */            List list2 = list;
/* 105 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 108 */           Iterator it = list2.iterator();
/* 116 */           while (it.hasNext()) {
/* 136 */               arrayList.add(((IIlio101Io) this.I00iiO).I00lli11((OOOi000ooO) it.next(), (OI1IlOlol) o0OIoll1.I00000oOI));
                    }
/* 140 */           return arrayList;
                }

                public void I001i1lo1io(File file) throws Throwable {
/* 1 */             OoIlOlI0oi ooIlOlI0oi = null;
                    try {
                        try {
/* 4 */                     OoIlOlI0oi ooIlOlI0oi2 = new OoIlOlI0oi(file);
/* 10 */                    for (int i = 0; i < ooIlOlI0oi2.I00iiI; i++) {
                                try {
/* 16 */                            I001l0I00(ooIlOlI0oi2.I00000oIO(i), file);
                                } catch (IOException e) {
/* 29 */                            e = e;
/* 30 */                            ooIlOlI0oi = ooIlOlI0oi2;
/* 54 */                            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
/* 57 */                            if (ooIlOlI0oi != null) {
/* 59 */                                ooIlOlI0oi.close();
/* 62 */                                return;
                                    }
/* 62 */                            return;
                                } catch (Throwable th) {
/* 26 */                            th = th;
/* 27 */                            ooIlOlI0oi = ooIlOlI0oi2;
/* 63 */                            if (ooIlOlI0oi != null) {
/* 65 */                                ooIlOlI0oi.close();
                                    }
/* 77 */                            throw th;
                                }
                            }
/* 22 */                    ooIlOlI0oi2.close();
                        } catch (IOException e2) {
/* 34 */                    e = e2;
                        }
                    } catch (Throwable th2) {
/* 32 */                th = th2;
                    }
                }

                public void I001iOo1i0O(File file) {
                    try {
/* 15 */                boolean z = true;
/* 16 */                boolean z2 = false;
/* 17 */                if (file.getPath().toLowerCase().endsWith(".otf")) {
/* 28 */                    I001l0I00(new OIOi0Oli(z2, z).I000O01llI0(file), file);
                        } else {
/* 43 */                    I001l0I00(new IlOoIo(z2, z).I0000O(file), file);
                        }
                    } catch (IOException e) {
/* 63 */                Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v17 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [int] */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                public void I001l0I00(OoIllIioi1l ooIllIioi1l, File file) throws IOException {
                    String str;
                    ?? r4;
                    byte[] bArr;
                    HashMap map;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    I00Ol00 i00Ol00;
                    I00Ol00 i00Ol002;
/* 3 */             File file2 = file;
/* 16 */            ArrayList arrayList = (ArrayList) this.I00iiI;
/* 18 */            String str2 = "Could not load font file: ";
                    try {
                        try {
/* 25 */                    String name = ooIllIioi1l.getName();
/* 29 */                    HashMap map2 = ooIllIioi1l.I00iiO;
/* 31 */                    if (name == null || !ooIllIioi1l.getName().contains("|")) {
                                try {
/* 97 */                            if (ooIllIioi1l.getName() == null) {
/* 18 */                                str = "Could not load font file: ";
/* 373 */                               str2 = 1;
/* 381 */                               arrayList.add(new IlIil0l0(file2, 1, "*skipnoname*"));
/* 396 */                               Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file2);
                                    } else {
/* 103 */                               if (ooIllIioi1l.I001i1lo1io() == null) {
/* 114 */                                   arrayList.add(new IlIil0l0(file2, 1, ooIllIioi1l.getName()));
/* 117 */                                   ooIllIioi1l.close();
/* 120 */                                   return;
                                        }
/* 125 */                               int i5 = ooIllIioi1l.I001i1lo1io().I000iOII;
/* 133 */                               OIOi01l oIOi01l = (OIOi01l) ooIllIioi1l.I00IOO("OS/2");
/* 135 */                               if (oIOi01l != null) {
                                            try {
/* 137 */                                       int i6 = oIOi01l.I000O01llI0;
/* 139 */                                       int i7 = oIOi01l.I000II;
/* 143 */                                       int i8 = (int) oIOi01l.I000OiO;
/* 147 */                                       int i9 = (int) oIOi01l.I000iOII;
/* 148 */                                       bArr = oIOi01l.I000OOo1O;
/* 152 */                                       map = map2;
/* 153 */                                       i = i7;
/* 155 */                                       i2 = i9;
/* 156 */                                       i3 = i6;
/* 157 */                                       i4 = i8;
                                            } catch (IOException e) {
/* 159 */                                       e = e;
/* 18 */                                        str = "Could not load font file: ";
/* 162 */                                       r4 = 1;
/* 410 */                                       arrayList.add(new IlIil0l0(file2, r4, "*skipexception*"));
/* 427 */                                       Log.w("PdfBox-Android", str + file2, e);
/* 430 */                                       ooIllIioi1l.close();
/* 433 */                                       return;
                                            }
                                        } else {
/* 167 */                                   map = map2;
/* 168 */                                   i = -1;
/* 169 */                                   i3 = -1;
/* 170 */                                   i4 = 0;
/* 171 */                                   i2 = 0;
/* 172 */                                   bArr = null;
                                        }
/* 175 */                               int i10 = 4;
                                        try {
/* 176 */                                   if (ooIllIioi1l instanceof OIi1OliIo0Ol) {
                                                try {
/* 187 */                                           if (((OIi1OliIo0Ol) ooIllIioi1l).I00iiO.containsKey("CFF ")) {
/* 190 */                                               OIi1OliIo0Ol oIi1OliIo0Ol = (OIi1OliIo0Ol) ooIllIioi1l;
/* 194 */                                               if (!oIi1OliIo0Ol.I00io1l) {
/* 273 */                                                   throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
                                                        }
/* 202 */                                               IIOOOIl1oI iIOOOIl1oI = ((IIOioOOi1) oIi1OliIo0Ol.I00IOO("CFF ")).I0001Ioi1lo;
/* 206 */                                               if (iIOOOIl1oI instanceof IIOO01IIlii) {
                                                            try {
/* 208 */                                                       IIOO01IIlii iIOO01IIlii = (IIOO01IIlii) iIOOOIl1oI;
/* 218 */                                                       i00Ol00 = new I00Ol00(iIOO01IIlii.I00ilO0, iIOO01IIlii.I00ioIO, i10, iIOO01IIlii.I00io1l);
                                                            } catch (IOException e2) {
/* 222 */                                                       e = e2;
/* 223 */                                                       file2 = file;
/* 18 */                                                        str = "Could not load font file: ";
/* 162 */                                                       r4 = 1;
/* 410 */                                                       arrayList.add(new IlIil0l0(file2, r4, "*skipexception*"));
/* 427 */                                                       Log.w("PdfBox-Android", str + file2, e);
/* 430 */                                                       ooIllIioi1l.close();
/* 433 */                                                       return;
                                                            }
                                                        } else {
/* 226 */                                                   i00Ol00 = null;
                                                        }
/* 244 */                                               arrayList.add(new IlIiiolo0OO(file, 2, ooIllIioi1l.getName(), i00Ol00, i, i3, i4, i2, i5, bArr, this));
                                                    }
                                                } catch (IOException e3) {
/* 256 */                                           e = e3;
/* 18 */                                            str = "Could not load font file: ";
/* 250 */                                           file2 = file;
/* 252 */                                           r4 = 1;
/* 410 */                                           arrayList.add(new IlIil0l0(file2, r4, "*skipexception*"));
/* 427 */                                           Log.w("PdfBox-Android", str + file2, e);
/* 430 */                                           ooIllIioi1l.close();
/* 433 */                                           return;
                                                }
                                            }
/* 18 */                                    str = "Could not load font file: ";
/* 282 */                                   if (map.containsKey("gcid")) {
/* 290 */                                       byte[] bArrI00IioO0OiOi = ooIllIioi1l.I00IioO0OiOi((OlliIl0) map.get("gcid"));
/* 296 */                                       Charset charset = IO1IIilll1I.I00000oIO;
/* 302 */                                       String str3 = new String(bArrI00IioO0OiOi, 10, 64, charset);
/* 310 */                                       String strSubstring = str3.substring(0, str3.indexOf(0));
/* 318 */                                       String str4 = new String(bArrI00IioO0OiOi, 76, 64, charset);
/* 345 */                                       i00Ol002 = new I00Ol00(strSubstring, bArrI00IioO0OiOi[141] & 255 & (bArrI00IioO0OiOi[140] << 8), 4, str4.substring(0, str4.indexOf(0)));
                                            } else {
/* 349 */                                       i00Ol002 = null;
                                            }
/* 358 */                                   file2 = file;
/* 360 */                                   str2 = 1;
/* 365 */                                   arrayList.add(new IlIiiolo0OO(file2, 1, ooIllIioi1l.getName(), i00Ol002, i, i3, i4, i2, i5, bArr, this));
                                        } catch (IOException e4) {
/* 249 */                                   e = e4;
                                        }
                                    }
                                } catch (IOException e5) {
/* 369 */                           e = e5;
                                    r4 = str2;
                                }
                            } else {
/* 52 */                        arrayList.add(new IlIil0l0(file2, 1, "*skippipeinname*"));
/* 79 */                        Log.w("PdfBox-Android", "Skipping font with '|' in name " + ooIllIioi1l.getName() + " in file " + file2);
                            }
/* 399 */                   ooIllIioi1l.close();
                        } catch (Throwable th) {
/* 434 */                   ooIllIioi1l.close();
/* 900 */                   throw th;
                        }
                    } catch (IOException e6) {
/* 87 */                e = e6;
/* 18 */                str = "Could not load font file: ";
/* 90 */                r4 = 1;
                    }
                }

                @Override
                public IOIO1OO1l10l I001lIiIIo1O(IOIOill iOIOill) {
/* 3 */             OOoOIoio1i oOoOIoio1i = (OOoOIoio1i) this.I00iiI;
/* 7 */             IiOlOOll iiOlOOll = (IiOlOOll) this.I00iiO;
/* 17 */            ((i1O01oOIoI0I) iiOlOOll.I0000Il00O().I0000Il00O).getClass();
/* 22 */            OOoOI1lIOi oOoOI1lIOiI00000oIO = l0ll0oli1l.I00000oIO(oOoOIoio1i, iOIOill, O1lili011o.I000II);
/* 26 */            if (oOoOI1lIOiI00000oIO == null) {
/* 28 */                return null;
                    }
/* 36 */            OOo1Io0I0.I00000oIO(oOoOI1lIOiI00000oIO.I00000oIO).equals(iOIOill);
/* 39 */            return iiOlOOll.I000II(oOoOI1lIOiI00000oIO);
                }

                public void I001lllioOl(File file) throws IOException {
/* 8 */             ArrayList arrayList = (ArrayList) this.I00iiI;
/* 20 */            FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 23 */                OoIoiiol0o ooIoiiol0oI0000O = OoIoiiol0o.I0000O(fileInputStream);
/* 27 */                String str = ooIoiiol0oI0000O.I00iOIl;
/* 30 */                if (str == null) {
/* 39 */                    arrayList.add(new IlIil0l0(file, 3, "*skipnoname*"));
/* 54 */                    Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file);
/* 60 */                    return;
                        }
/* 71 */                if (!str.contains("|")) {
/* 127 */                   arrayList.add(new IlIiiolo0OO(file, 3, ooIoiiol0oI0000O.I00iOIl, null, -1, -1, 0, 0, -1, null, this));
/* 133 */                   return;
                        }
/* 80 */                arrayList.add(new IlIil0l0(file, 3, "*skippipeinname*"));
/* 105 */               Log.w("PdfBox-Android", "Skipping font with '|' in name " + ooIoiiol0oI0000O.I00iOIl + " in file " + file);
                    } catch (IOException e) {
/* 146 */               Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                    } finally {
/* 153 */               fileInputStream.close();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Oo0OI01Il I001lloI(List list) throws IOException {
                    Iioi1O iioi1O;
                    try {
/* 5 */                 int size = list.size();
/* 9 */                 int i = 0;
/* 10 */                Oo0lI00l oo0lI00l = null;
/* 11 */                while (i < size) {
                            try {
/* 17 */                        iioi1O = (Iioi1O) list.get(i);
                            } catch (Exception e) {
/* 33 */                        e = e;
/* 34 */                        oo0lI00lI00000oIO = oo0lI00l;
                            }
                            try {
/* 23 */                        iioi1O.I00000oIO((Oo0olliOi1) this.I00iiO);
/* 26 */                        i++;
/* 28 */                        oo0lI00l = iioi1O;
                            } catch (Exception e2) {
/* 30 */                        e = e2;
/* 31 */                        oo0lI00lI00000oIO = iioi1O;
/* 123 */                       StringBuilder sb = new StringBuilder();
/* 134 */                       int iI000lI = ((I1I1OO00o1o) ((Oo0olliOi1) this.I00iiO).I0001Ioi1lo).I000lI();
/* 142 */                       Oo0lI00l oo0lI00lI0000Il00O = ((Oo0olliOi1) this.I00iiO).I0000Il00O();
/* 148 */                       Oo0olliOi1 oo0olliOi1 = (Oo0olliOi1) this.I00iiO;
/* 197 */                       sb.append("Error while applying EditCommand batch to buffer (length=" + iI000lI + ", composition=" + oo0lI00lI0000Il00O + ", selection=" + Oo0lI00l.I000OOo1O(lOliOi0Oi.I00000oIO(oo0olliOi1.I00000oOI, oo0olliOi1.I0000Il00O)) + "):");
/* 202 */                       sb.append('\n');
/* 211 */                       Iil1olo iil1olo = new Iil1olo(3);
/* 214 */                       iil1olo.I00iiI = oo0lI00lI00000oIO;
/* 216 */                       VarHandle.storeStoreFence();
/* 225 */                       IOOi0Ool1i.I00IioO0OiOi(list, sb, "\n", null, null, iil1olo, 60);
/* 437 */                       throw new RuntimeException(sb.toString(), e);
                            }
                        }
/* 38 */                Oo0olliOi1 oo0olliOi12 = (Oo0olliOi1) this.I00iiO;
/* 40 */                oo0olliOi12.getClass();
/* 53 */                I1111OO10i i1111OO10i = new I1111OO10i(((I1I1OO00o1o) oo0olliOi12.I0001Ioi1lo).toString());
/* 58 */                Oo0olliOi1 oo0olliOi13 = (Oo0olliOi1) this.I00iiO;
/* 64 */                long jI00000oIO = lOliOi0Oi.I00000oIO(oo0olliOi13.I00000oOI, oo0olliOi13.I0000Il00O);
/* 82 */                oo0lI00lI00000oIO = Oo0lI00l.I000O01llI0(((Oo0OI01Il) this.I00iiI).I00000oOI) ? null : Oo0lI00l.I00000oIO(jI00000oIO);
/* 112 */               Oo0OI01Il oo0OI01Il = new Oo0OI01Il(i1111OO10i, oo0lI00lI00000oIO != null ? oo0lI00lI00000oIO.I00000oIO : lOliOi0Oi.I00000oIO(Oo0lI00l.I0001Ioi1lo(jI00000oIO), Oo0lI00l.I000II(jI00000oIO)), ((Oo0olliOi1) this.I00iiO).I0000Il00O());
/* 115 */               this.I00iiI = oo0OI01Il;
/* 117 */               return oo0OI01Il;
                    } catch (Exception e3) {
/* 118 */               e = e3;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00II0Ol1O0l(Ii1olII1lO1 ii1olII1lO1, Throwable th, IOoilo iOoilo) throws Throwable {
                    IoOIiOl0O0 ioOIiOl0O0;
/* 3 */             if (iOoilo instanceof IoOIiOl0O0) {
/* 6 */                 ioOIiOl0O0 = (IoOIiOl0O0) iOoilo;
/* 8 */                 int i = ioOIiOl0O0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOIiOl0O0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOIiOl0O0 = new IoOIiOl0O0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ioOIiOl0O0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioOIiOl0O0.I00iiO;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            if (i2 != 0) {
/* 36 */                if (i2 == 1) {
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
/* 41 */                    return ooiIlOl1iI;
                        }
/* 44 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                return null;
                    }
/* 49 */            lIoii1l01l0i.I00000oOI(obj);
/* 60 */            O010loOOi0Oo o010loOOi0Oo = (O010loOOi0Oo) l01oO1iOo.I0000oI00(ii1olII1lO1.I00000oIO());
/* 62 */            if (th == null) {
/* 64 */                o010loOOi0Oo.I00O10llo(ooiIlOl1iI);
                    } else if (th instanceof CancellationException) {
/* 74 */                o010loOOi0Oo.I00111O((CancellationException) th);
                    } else {
/* 84 */                o010loOOi0Oo.I00111O(ilIiOIi0I.I00000oIO("Exception occurred during request execution", th));
                    }
/* 87 */            I1OoollI1Il1 i1OoollI1Il1 = IiioIIllI.I00000oIO;
/* 107 */           if (!ii1olII1lO1.I00iOIl().getAttributes().I0000Il00O().containsKey(IiioIIllI.I00000oOI)) {
                        try {
/* 113 */                   iOiOO1O1.I00000oIO(ii1olII1lO1.I0000Il00O());
                        } catch (Throwable unused) {
                        }
                    }
/* 116 */           ioOIiOl0O0.I00iiO = 1;
                    return o010loOOi0Oo.I001l0I00(ioOIiOl0O0) == ii0111o ? ii0111o : ooiIlOl1iI;
                }

                @Override
                public void I00II0oii1o(Throwable th) {
                    switch (this.I00iOIl) {
                        case 6:
/* 44 */                    lOllIO.I00000oIO();
/* 49 */                    OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) this.I00iiI;
/* 53 */                    I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiO;
/* 59 */                    if (oOIo1Iiiil == ((OOIo1Iiiil) i0Oi111ii.I00iiI)) {
/* 83 */                        l11I11lO.I0000oI00("CaptureNode", "request aborted, id=" + ((OOIo1Iiiil) i0Oi111ii.I00iiI).I00000oIO);
/* 88 */                        IoloOio0I ioloOio0I = (IoloOio0I) i0Oi111ii.I00io1l;
/* 90 */                        if (ioloOio0I != null) {
/* 92 */                            ioloOio0I.I00iiO = null;
                                }
/* 94 */                        i0Oi111ii.I00iiI = null;
/* 96 */                        return;
                            }
/* 96 */                    return;
                        case PoseLandmark.RIGHT_ANKLE:
/* 17 */                    if (th instanceof Oll01O) {
/* 28 */                        lII1OI11o1I.I0000oI00(null, ((IIiOiI0il) this.I00iiO).cancel(false));
/* 43 */                        return;
                            } else {
/* 40 */                        lII1OI11o1I.I0000oI00(null, ((IIiOOI) this.I00iiI).I00000oOI(null));
/* 43 */                        return;
                            }
                        default:
/* 14 */                    throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
                    }
                }

                public void I00IO1() {
/* 3 */             OllO00oiil ollO00oiil = (OllO00oiil) this.I00iiO;
/* 9 */             if (ollO00oiil.I00000oOI()) {
                        try {
/* 17 */                    ((Engine) ollO00oiil.getValue()).close();
                        } catch (Throwable th) {
/* 26 */                    Log.w("BoxRagLlmRunner", "Error closing RAG engine", th);
                        }
                    }
                }

                public Bundle I00IO1oi11O(String str) {
                    Bundle bundle;
/* 3 */             II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) this.I00iiI;
/* 8 */             if (!iI1oo0l11IOI.I00000oOI) {
/* 49 */                I000II.I001IO000("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
/* 7 */                 return null;
                    }
/* 12 */            Bundle bundle2 = (Bundle) iI1oo0l11IOI.I000O01llI0;
/* 14 */            if (bundle2 == null) {
/* 7 */                 return null;
                    }
/* 21 */            if (bundle2.containsKey(str)) {
/* 23 */                bundle = bundle2.getBundle(str);
/* 27 */                if (bundle == null) {
/* 30 */                    lO0iIII0.I00000oIO(str);
/* 33 */                    throw null;
                        }
                    } else {
/* 34 */                bundle = null;
                    }
/* 35 */            bundle2.remove(str);
/* 42 */            if (bundle2.isEmpty()) {
/* 44 */                iI1oo0l11IOI.I000O01llI0 = null;
                    }
/* 46 */            return bundle;
                }

                public void I00IOO(String str, PrintWriter printWriter) {
/* 3 */             O11ll1Ii0 o11ll1Ii0 = (O11ll1Ii0) this.I00iiO;
/* 11 */            if (o11ll1Ii0.I00000oOI.I0000O() > 0) {
/* 13 */                printWriter.print(str);
/* 18 */                printWriter.println("Loaders:");
/* 23 */                String strConcat = str.concat("    ");
/* 35 */                for (int i = 0; i < o11ll1Ii0.I00000oOI.I0000O(); i++) {
/* 43 */                    O11lIllO o11lIllO = (O11lIllO) o11ll1Ii0.I00000oOI.I0000oI00(i);
/* 45 */                    printWriter.print(str);
/* 50 */                    printWriter.print("  #");
/* 59 */                    printWriter.print(o11ll1Ii0.I00000oOI.I00000oOI(i));
/* 64 */                    printWriter.print(": ");
/* 71 */                    printWriter.println(o11lIllO.toString());
/* 74 */                    printWriter.print(strConcat);
/* 79 */                    printWriter.print("mId=");
/* 84 */                    printWriter.print(o11lIllO.I000l1);
/* 89 */                    printWriter.print(" mArgs=");
/* 93 */                    printWriter.println((Object) null);
/* 96 */                    printWriter.print(strConcat);
/* 101 */                   printWriter.print("mLoader=");
/* 106 */                   printWriter.println(o11lIllO.I000lI);
/* 109 */                   lO0Ol0 lo0ol0 = o11lIllO.I000lI;
/* 113 */                   String strConcat2 = strConcat.concat("  ");
/* 117 */                   lo0ol0.getClass();
/* 120 */                   printWriter.print(strConcat2);
/* 123 */                   printWriter.print("mId=");
/* 128 */                   printWriter.print(lo0ol0.I00000oIO);
/* 133 */                   printWriter.print(" mListener=");
/* 138 */                   printWriter.println(lo0ol0.I00000oOI);
/* 145 */                   if (lo0ol0.I0000O || lo0ol0.I000II) {
/* 152 */                       printWriter.print(strConcat2);
/* 155 */                       printWriter.print("mStarted=");
/* 160 */                       printWriter.print(lo0ol0.I0000O);
/* 165 */                       printWriter.print(" mContentChanged=");
/* 170 */                       printWriter.print(lo0ol0.I000II);
/* 175 */                       printWriter.print(" mProcessingChange=");
/* 178 */                       printWriter.println(false);
                            }
/* 183 */                   if (lo0ol0.I0000oI00 || lo0ol0.I0001Ioi1lo) {
/* 189 */                       printWriter.print(strConcat2);
/* 194 */                       printWriter.print("mAbandoned=");
/* 199 */                       printWriter.print(lo0ol0.I0000oI00);
/* 204 */                       printWriter.print(" mReset=");
/* 209 */                       printWriter.println(lo0ol0.I0001Ioi1lo);
                            }
/* 216 */                   if (lo0ol0.I000OOo1O != null) {
/* 218 */                       printWriter.print(strConcat2);
/* 223 */                       printWriter.print("mTask=");
/* 228 */                       printWriter.print(lo0ol0.I000OOo1O);
/* 231 */                       printWriter.print(" waiting=");
/* 236 */                       lo0ol0.I000OOo1O.getClass();
/* 239 */                       printWriter.println(false);
                            }
/* 244 */                   if (lo0ol0.I000OiO != null) {
/* 246 */                       printWriter.print(strConcat2);
/* 251 */                       printWriter.print("mCancellingTask=");
/* 256 */                       printWriter.print(lo0ol0.I000OiO);
/* 259 */                       printWriter.print(" waiting=");
/* 264 */                       lo0ol0.I000OiO.getClass();
/* 267 */                       printWriter.println(false);
                            }
/* 272 */                   if (o11lIllO.I000oI1ioi != null) {
/* 274 */                       printWriter.print(strConcat);
/* 279 */                       printWriter.print("mCallbacks=");
/* 284 */                       printWriter.println(o11lIllO.I000oI1ioi);
/* 287 */                       O11li1ooio o11li1ooio = o11lIllO.I000oI1ioi;
/* 289 */                       String strConcat3 = strConcat.concat("  ");
/* 293 */                       o11li1ooio.getClass();
/* 296 */                       printWriter.print(strConcat3);
/* 301 */                       printWriter.print("mDeliveredData=");
/* 306 */                       printWriter.println(o11li1ooio.I00iiI);
                            }
/* 309 */                   printWriter.print(strConcat);
/* 314 */                   printWriter.print("mData=");
/* 317 */                   lO0Ol0 lo0ol02 = o11lIllO.I000lI;
/* 319 */                   Object objI0000O = o11lIllO.I0000O();
/* 323 */                   lo0ol02.getClass();
/* 330 */                   StringBuilder sb = new StringBuilder(64);
/* 333 */                   il0OoI1liO.I00000oIO(objI0000O, sb);
/* 338 */                   sb.append("}");
/* 345 */                   printWriter.println(sb.toString());
/* 348 */                   printWriter.print(strConcat);
/* 351 */                   printWriter.print("mStarted=");
/* 361 */                   printWriter.println(o11lIllO.I0000Il00O > 0);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00IlilI0i0i(IOoilo iOoilo) throws Throwable {
                    IoOIlloIIO0 ioOIlloIIO0;
                    int i;
                    int i2;
                    IoIlIolo10o ioIlIolo10o;
                    int i3;
/* 3 */             if (iOoilo instanceof IoOIlloIIO0) {
/* 6 */                 ioOIlloIIO0 = (IoOIlloIIO0) iOoilo;
/* 8 */                 int i4 = ioOIlloIIO0.I00io1l;
/* 14 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOIlloIIO0.I00io1l = i4 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOIlloIIO0 = new IoOIlloIIO0(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = ioOIlloIIO0.I00ilI0I1;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i5 = ioOIlloIIO0.I00io1l;
                    try {
/* 35 */                if (i5 == 0) {
/* 73 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 78 */                    IoO10oI0o ioO10oI0o = new IoO10oI0o();
/* 83 */                    IoO10oI0o ioO10oI0o2 = (IoO10oI0o) this.I00iiI;
/* 87 */                    ioO10oI0o.I0000oI00 = ioO10oI0o2.I0000oI00;
/* 89 */                    ioO10oI0o.I00000oOI(ioO10oI0o2);
/* 94 */                    IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I00iiO;
/* 97 */                    ioOIlloIIO0.I00iOIl = 0;
/* 99 */                    ioOIlloIIO0.I00iiI = 0;
/* 101 */                   ioOIlloIIO0.I00io1l = 1;
/* 103 */                   objI0000Il00O = ioIlI1oli.I0000Il00O(ioO10oI0o, ioOIlloIIO0);
/* 107 */                   if (objI0000Il00O != obj) {
/* 110 */                       i = 0;
/* 111 */                       i2 = 0;
                            }
                        } else {
/* 37 */                    if (i5 != 1) {
/* 39 */                        if (i5 != 2) {
/* 41 */                            if (i5 != 3) {
/* 51 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                                return null;
                                    }
/* 43 */                            Ii1olII1lO1 ii1olII1lO1 = ioOIlloIIO0.I00iio;
/* 45 */                            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 48 */                            return ii1olII1lO1;
                                }
/* 55 */                        i = ioOIlloIIO0.I00iiI;
/* 57 */                        i3 = ioOIlloIIO0.I00iOIl;
/* 59 */                        ioIlIolo10o = ioOIlloIIO0.I00iiO;
/* 61 */                        lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 135 */                       Ii1olII1lO1 ii1olII1lO1I0000oI00 = ((IoIlIolo10o) objI0000Il00O).I0000oI00();
/* 139 */                       Ii1olII1lO1 ii1olII1lO1I0000oI002 = ioIlIolo10o.I0000oI00();
/* 143 */                       ioOIlloIIO0.I00iiO = null;
/* 145 */                       ioOIlloIIO0.I00iio = ii1olII1lO1I0000oI00;
/* 147 */                       ioOIlloIIO0.I00iOIl = i3;
/* 149 */                       ioOIlloIIO0.I00iiI = i;
/* 151 */                       ioOIlloIIO0.I00io1l = 3;
                                return I00II0Ol1O0l(ii1olII1lO1I0000oI002, null, ioOIlloIIO0) != obj ? obj : ii1olII1lO1I0000oI00;
                            }
/* 65 */                    i = ioOIlloIIO0.I00iiI;
/* 67 */                    i2 = ioOIlloIIO0.I00iOIl;
/* 69 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                        }
/* 112 */               IoIlIolo10o ioIlIolo10o2 = (IoIlIolo10o) objI0000Il00O;
/* 114 */               ioOIlloIIO0.I00iiO = ioIlIolo10o2;
/* 116 */               ioOIlloIIO0.I00iOIl = i2;
/* 118 */               ioOIlloIIO0.I00iiI = i;
/* 120 */               ioOIlloIIO0.I00io1l = 2;
/* 122 */               Object objI00000oIO = lO0OOOl.I00000oIO(ioIlIolo10o2, ioOIlloIIO0);
/* 126 */               if (objI00000oIO != obj) {
/* 129 */                   int i6 = i2;
/* 130 */                   ioIlIolo10o = ioIlIolo10o2;
/* 131 */                   objI0000Il00O = objI00000oIO;
/* 132 */                   i3 = i6;
/* 135 */                   Ii1olII1lO1 ii1olII1lO1I0000oI003 = ((IoIlIolo10o) objI0000Il00O).I0000oI00();
/* 139 */                   Ii1olII1lO1 ii1olII1lO1I0000oI0022 = ioIlIolo10o.I0000oI00();
/* 143 */                   ioOIlloIIO0.I00iiO = null;
/* 145 */                   ioOIlloIIO0.I00iio = ii1olII1lO1I0000oI003;
/* 147 */                   ioOIlloIIO0.I00iOIl = i3;
/* 149 */                   ioOIlloIIO0.I00iiI = i;
/* 151 */                   ioOIlloIIO0.I00io1l = 3;
                            if (I00II0Ol1O0l(ii1olII1lO1I0000oI0022, null, ioOIlloIIO0) != obj) {
                            }
                        }
                    } catch (CancellationException e) {
/* 168 */               throw ilIiI1O0.I00000oIO(e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00Io1lO(IOoilo iOoilo) throws Throwable {
                    IoOIo1 ioOIo1;
/* 3 */             if (iOoilo instanceof IoOIo1) {
/* 6 */                 ioOIo1 = (IoOIo1) iOoilo;
/* 8 */                 int i = ioOIo1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOIo1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOIo1 = new IoOIo1(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = ioOIo1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioOIo1.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 52 */                    IoO10oI0o ioO10oI0o = new IoO10oI0o();
/* 57 */                    IoO10oI0o ioO10oI0o2 = (IoO10oI0o) this.I00iiI;
/* 61 */                    ioO10oI0o.I0000oI00 = ioO10oI0o2.I0000oI00;
/* 63 */                    ioO10oI0o.I00000oOI(ioO10oI0o2);
/* 72 */                    ioO10oI0o.I0001Ioi1lo.I0000oI00(IiioIIllI.I00000oIO, OoiIlOl1iI.I00000oIO);
/* 77 */                    IoIlI1oli ioIlI1oli = (IoIlI1oli) this.I00iiO;
/* 79 */                    ioOIo1.I00iiO = 1;
/* 81 */                    objI0000Il00O = ioIlI1oli.I0000Il00O(ioO10oI0o, ioOIo1);
/* 85 */                    if (objI0000Il00O == ii0111o) {
/* 87 */                        return ii0111o;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 42 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                            }
/* 36 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
                        }
/* 90 */                return ((IoIlIolo10o) objI0000Il00O).I0000oI00();
                    } catch (CancellationException e) {
/* 168 */               throw ilIiI1O0.I00000oIO(e);
                    }
                }

                public void I00Io1o110i(String str, String str2, Function1 function1) {
/* 7 */             LinkedHashMap linkedHashMap = (LinkedHashMap) ((IIOOoll) this.I00iiO).I00iiI;
/* 11 */            Ol0IIO ol0IIO = new Ol0IIO();
/* 14 */            ol0IIO.I00000oIO = str2;
/* 18 */            ArrayList arrayList = new ArrayList();
/* 21 */            ol0IIO.I00000oOI = arrayList;
/* 31 */            ol0IIO.I0000Il00O = new OIoi0IIoi("V", null);
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            function1.invoke(ol0IIO);
/* 41 */            String str3 = (String) this.I00iiI;
/* 51 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 54 */            Iterator it = arrayList.iterator();
/* 62 */            while (it.hasNext()) {
/* 74 */                arrayList2.add((String) ((OIoi0IIoi) it.next()).I00iOIl);
                    }
/* 83 */            String strI000iOII = (String) ol0IIO.I0000Il00O.I00iOIl;
/* 87 */            StringBuilder sb = new StringBuilder(str);
/* 92 */            sb.append('(');
/* 107 */           sb.append(IOOi0Ool1i.I00IlilI0i0i(arrayList2, "", null, null, OOo1l011.I00oIiI10, 30));
/* 112 */           sb.append(')');
/* 120 */           if (strI000iOII.length() > 1) {
/* 126 */               strI000iOII = IIl001iO0Io.I000iOII(';', OlIo0Ooi1loI.I001IIilI0O, strI000iOII);
                    }
/* 130 */           sb.append(strI000iOII);
/* 139 */           String strI000oI1ioi = IIlIOloOOO.I000oI1ioi('.', str3, sb.toString());
/* 147 */           OoOIo1ioI0 ooOIo1ioI0 = (OoOIo1ioI0) ol0IIO.I0000Il00O.I00iiI;
/* 155 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 158 */           Iterator it2 = arrayList.iterator();
/* 166 */           while (it2.hasNext()) {
/* 178 */               arrayList3.add((OoOIo1ioI0) ((OIoi0IIoi) it2.next()).I00iiI);
                    }
/* 189 */           linkedHashMap.put(strI000oI1ioi, new OOI000iI1(ooOIo1ioI0, arrayList3, ol0IIO.I00000oIO));
                }

                public Object I00IoIO0lI(Class cls) {
/* 3 */             ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiO;
/* 5 */             Object obj = concurrentHashMap.get(cls);
/* 9 */             if (obj != null) {
/* 29 */                return obj;
                    }
/* 15 */            Object objInvoke = ((Function1) this.I00iiI).invoke(cls);
/* 19 */            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
                    return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
                }

                public File I00IoO0() {
/* 7 */             if (((File) this.I00iiI) == null) {
                        synchronized (this) {
                            try {
/* 14 */                        if (((File) this.I00iiI) == null) {
/* 37 */                            String str = "PersistedInstallation." + ((IlIoliIO) this.I00iiO).I0000Il00O() + ".json";
/* 45 */                            IlIoliIO ilIoliIO = (IlIoliIO) this.I00iiO;
/* 47 */                            ilIoliIO.I00000oIO();
/* 56 */                            File file = new File(ilIoliIO.I00000oIO.getNoBackupFilesDir(), str);
/* 59 */                            this.I00iiI = file;
/* 65 */                            if (file.exists()) {
/* 69 */                                return (File) this.I00iiI;
                                    }
/* 79 */                            IlIoliIO ilIoliIO2 = (IlIoliIO) this.I00iiO;
/* 81 */                            ilIoliIO2.I00000oIO();
/* 90 */                            File file2 = new File(ilIoliIO2.I00000oIO.getFilesDir(), str);
/* 97 */                            if (file2.exists() && !file2.renameTo((File) this.I00iiI)) {
/* 120 */                               Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
/* 124 */                               return file2;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
/* 131 */           return (File) this.I00iiI;
                }

                public O1iOIl0o10 I00O0i0ii() {
/* 9 */             return (O1iOIl0o10) ((OIooliIO0) this.I00iiO).getValue();
                }

                public O0il1o0oIi I00O0o1oo() {
/* 3 */             O0io0olo o0io0olo = (O0io0olo) this.I00iiI;
/* 13 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) o0io0olo.I00l0OO0IO.I000II(this.I00iiO);
/* 15 */            if (o0iiOioolIi != null) {
/* 23 */                return (O0il1o0oIi) o0io0olo.I00ilO0.I000II(o0iiOioolIi);
                    }
/* 26 */            return null;
                }

                public OiIoOil I00O10llo(String str) {
                    OiIoOil oiIoOil;
/* 3 */             II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) this.I00iiI;
                    synchronized (((lolOiIoiillI) iI1oo0l11IOI.I0001Ioi1lo)) {
/* 18 */                Iterator it = ((LinkedHashMap) iI1oo0l11IOI.I000II).entrySet().iterator();
/* 54 */                do {
/* 26 */                    oiIoOil = null;
/* 27 */                    if (!it.hasNext()) {
                                break;
                            }
/* 33 */                    Map.Entry entry = (Map.Entry) it.next();
/* 39 */                    String str2 = (String) entry.getKey();
/* 45 */                    OiIoOil oiIoOil2 = (OiIoOil) entry.getValue();
/* 51 */                    if (O0000Ioio00.I0000O(str2, str)) {
/* 53 */                        oiIoOil = oiIoOil2;
                            }
/* 54 */                } while (oiIoOil == null);
                    }
/* 60 */            return oiIoOil;
                }

                public void I00OI1(I1lI11 i1lI11) throws JSONException, IOException {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 10 */                jSONObject.put("Fid", i1lI11.I00000oIO);
/* 21 */                jSONObject.put("Status", IIlIOloOOO.I001lIiIIo1O(i1lI11.I00000oOI));
/* 28 */                jSONObject.put("AuthToken", i1lI11.I0000Il00O);
/* 35 */                jSONObject.put("RefreshToken", i1lI11.I0000O);
/* 42 */                jSONObject.put("TokenCreationEpochInSecs", i1lI11.I0001Ioi1lo);
/* 49 */                jSONObject.put("ExpiresInSecs", i1lI11.I0000oI00);
/* 56 */                jSONObject.put("FisError", i1lI11.I000II);
/* 65 */                IlIoliIO ilIoliIO = (IlIoliIO) this.I00iiO;
/* 67 */                ilIoliIO.I00000oIO();
/* 76 */                File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ilIoliIO.I00000oIO.getFilesDir());
/* 82 */                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
/* 95 */                fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
/* 98 */                fileOutputStream.close();
/* 109 */               if (fileCreateTempFile.renameTo(I00IoO0())) {
                        } else {
/* 119 */                   throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                        }
                    } catch (IOException | JSONException unused) {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x018a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r21v13 */
                /* JADX WARN: Type inference failed for: r21v2 */
                /* JADX WARN: Type inference failed for: r21v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r21v4 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ArrayList I00OIO1(ArrayList arrayList) throws Throwable {
                    File fileI00IoiI;
                    boolean zExists;
                    BufferedReader bufferedReader;
                    ?? r21;
                    BufferedReader bufferedReader2;
                    ArrayList arrayList2;
                    I00Ol00 i00Ol00;
                    byte[] bArr;
                    int i;
                    int i2;
                    byte[] bArr2;
/* 7 */             HashSet hashSet = new HashSet(arrayList.size());
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 30 */                hashSet.add(((File) it.next()).getAbsolutePath());
                    }
/* 36 */            ArrayList arrayList3 = new ArrayList();
/* 39 */            char c = 0;
                    try {
/* 40 */                fileI00IoiI = I00IoiI();
                        try {
/* 44 */                    zExists = fileI00IoiI.exists();
                        } catch (SecurityException unused) {
/* 50 */                    zExists = false;
/* 53 */                    if (zExists) {
                            }
/* 387 */                   if (!hashSet.isEmpty()) {
                            }
                        }
                    } catch (SecurityException unused2) {
/* 49 */                fileI00IoiI = null;
                    }
/* 53 */            if (zExists) {
/* 381 */               arrayList2 = null;
                    } else {
                        try {
/* 62 */                    bufferedReader2 = new BufferedReader(new FileReader(fileI00IoiI));
                            while (true) {
                                try {
                                    try {
/* 65 */                                String line = bufferedReader2.readLine();
/* 69 */                                if (line == null) {
                                            break;
                                        }
/* 75 */                                String[] strArrSplit = line.split("\\|", 10);
/* 80 */                                if (strArrSplit.length < 10) {
/* 104 */                                   Log.w("PdfBox-Android", "Incorrect line '" + line + "' in font disk cache is skipped");
                                        } else {
/* 117 */                                   String str = strArrSplit[c];
/* 122 */                                   int iI001i1O0Ol = IlIi0I0.I001i1O0Ol(strArrSplit[1]);
/* 133 */                                   int i3 = 4;
/* 134 */                                   if (strArrSplit[2].length() > 0) {
/* 140 */                                       String[] strArrSplit2 = strArrSplit[2].split("-");
/* 156 */                                       i00Ol00 = new I00Ol00(strArrSplit2[c], Integer.parseInt(strArrSplit2[2]), i3, strArrSplit2[1]);
                                            } else {
/* 161 */                                       i00Ol00 = null;
                                            }
/* 169 */                                   int i4 = -1;
/* 172 */                                   if (strArrSplit[3].length() > 0) {
/* 176 */                                       bArr = null;
/* 176 */                                       bArr = null;
                                                try {
/* 182 */                                           i = (int) Long.parseLong(strArrSplit[3], 16);
                                                } catch (IOException e) {
/* 185 */                                           e = e;
                                                    r21 = bArr;
/* 370 */                                           Log.w("PdfBox-Android", "Error loading font cache, will be re-built", e);
/* 373 */                                           io0iolo.I00000oOI(bufferedReader2);
/* 376 */                                           return r21;
                                                }
                                            } else {
/* 188 */                                       bArr = null;
/* 190 */                                       i = -1;
                                            }
/* 208 */                                   int i5 = strArrSplit[4].length() > 0 ? (int) Long.parseLong(strArrSplit[4], 16) : -1;
/* 216 */                                   int i6 = (int) Long.parseLong(strArrSplit[5], 16);
/* 224 */                                   int i7 = (int) Long.parseLong(strArrSplit[6], 16);
/* 232 */                                   if (strArrSplit[7].length() > 0) {
/* 236 */                                       i2 = iI001i1O0Ol;
/* 242 */                                       i4 = (int) Long.parseLong(strArrSplit[7], 16);
                                            } else {
/* 244 */                                       i2 = iI001i1O0Ol;
                                            }
/* 254 */                                   if (strArrSplit[8].length() > 0) {
/* 258 */                                       bArr2 = new byte[10];
/* 262 */                                       int i8 = 0;
/* 263 */                                       for (int i9 = 10; i8 < i9; i9 = 10) {
/* 267 */                                           int i10 = i8 * 2;
/* 286 */                                           bArr2[i8] = (byte) (Integer.parseInt(strArrSplit[8].substring(i10, i10 + 2), 16) & 255);
/* 288 */                                           i8++;
/* 291 */                                           i6 = i6;
                                                }
                                            } else {
/* 299 */                                       bArr2 = bArr;
                                            }
/* 296 */                                   int i11 = i6;
/* 308 */                                   File file = new File(strArrSplit[9]);
/* 315 */                                   if (file.exists()) {
/* 334 */                                       arrayList3.add(new IlIiiolo0OO(file, i2, str, i00Ol00, i, i5, i11, i7, i4, bArr2, this));
                                            } else {
/* 338 */                                       file.getAbsolutePath();
                                            }
/* 345 */                                   hashSet.remove(file.getAbsolutePath());
/* 348 */                                   c = 0;
                                        }
                                    } catch (IOException e2) {
/* 112 */                               e = e2;
/* 113 */                               r21 = 0;
                                    }
                                } catch (Throwable th) {
/* 108 */                           th = th;
/* 109 */                           bufferedReader = bufferedReader2;
/* 377 */                           io0iolo.I00000oOI(bufferedReader);
/* 380 */                           throw th;
                                }
                            }
/* 351 */                   arrayList2 = null;
/* 353 */                   io0iolo.I00000oOI(bufferedReader2);
                        } catch (IOException e3) {
/* 363 */                   e = e3;
/* 364 */                   r21 = 0;
/* 366 */                   bufferedReader2 = null;
                        } catch (Throwable th2) {
/* 357 */                   th = th2;
/* 360 */                   bufferedReader = null;
/* 377 */                   io0iolo.I00000oOI(bufferedReader);
/* 380 */                   throw th;
                        }
                    }
/* 387 */           if (!hashSet.isEmpty()) {
/* 437 */               return arrayList3;
                    }
/* 391 */           Log.w("PdfBox-Android", "New fonts found, font cache will be re-built");
/* 394 */           return arrayList2;
                }

                public void I00OIl(AttributeSet attributeSet, int i) {
/* 3 */             AbsSeekBar absSeekBar = (AbsSeekBar) this.I00iiI;
/* 11 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(absSeekBar.getContext(), attributeSet, I00iio, i);
/* 16 */            Drawable drawableI000l1 = olilOlOiII0010I0i.I000l1(0);
/* 21 */            if (drawableI000l1 != null) {
/* 25 */                if (drawableI000l1 instanceof AnimationDrawable) {
/* 27 */                    AnimationDrawable animationDrawable = (AnimationDrawable) drawableI000l1;
/* 29 */                    int numberOfFrames = animationDrawable.getNumberOfFrames();
/* 35 */                    AnimationDrawable animationDrawable2 = new AnimationDrawable();
/* 42 */                    animationDrawable2.setOneShot(animationDrawable.isOneShot());
/* 48 */                    for (int i2 = 0; i2 < numberOfFrames; i2++) {
/* 54 */                        Drawable drawableI00i01iIIliI = I00i01iIIliI(animationDrawable.getFrame(i2), true);
/* 58 */                        drawableI00i01iIIliI.setLevel(10000);
/* 65 */                        animationDrawable2.addFrame(drawableI00i01iIIliI, animationDrawable.getDuration(i2));
                            }
/* 71 */                    animationDrawable2.setLevel(10000);
/* 74 */                    drawableI000l1 = animationDrawable2;
                        }
/* 75 */                absSeekBar.setIndeterminateDrawable(drawableI000l1);
                    }
/* 78 */            Drawable drawableI000l12 = olilOlOiII0010I0i.I000l1(1);
/* 82 */            if (drawableI000l12 != null) {
/* 88 */                absSeekBar.setProgressDrawable(I00i01iIIliI(drawableI000l12, false));
                    }
/* 91 */            olilOlOiII0010I0i.I0010o();
                }

                public void I00OIo(I0I1liIO0ii i0I1liIO0ii) {
/* 3 */             o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiI;
/* 13 */            ((ActionMode.Callback) o01l1iooo0.I00iOIl).onDestroyActionMode(o01l1iooo0.I000OiO(i0I1liIO0ii));
/* 18 */            I11oi01ll i11oi01ll = (I11oi01ll) this.I00iiO;
/* 22 */            if (i11oi01ll.I00oII != null) {
/* 32 */                i11oi01ll.I00l0I0l0lO1.getDecorView().removeCallbacks(i11oi01ll.I00oIiI10);
                    }
/* 37 */            if (i11oi01ll.I00oI0i != null) {
/* 39 */                OoolOO ooolOO = i11oi01ll.I00oO101o;
/* 41 */                if (ooolOO != null) {
/* 43 */                    ooolOO.I00000oOI();
                        }
/* 48 */                OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(i11oi01ll.I00oI0i);
/* 53 */                ooolOOI00000oIO.I00000oIO(0.0f);
/* 56 */                i11oi01ll.I00oO101o = ooolOOI00000oIO;
/* 61 */                I11loI10l1IO i11loI10l1IO = new I11loI10l1IO(2);
/* 64 */                i11loI10l1IO.I00000oOI = this;
/* 66 */                VarHandle.storeStoreFence();
/* 69 */                ooolOOI00000oIO.I0000O(i11loI10l1IO);
                    }
/* 73 */            i11oi01ll.I00o101lO = null;
/* 75 */            ViewGroup viewGroup = i11oi01ll.I00olI;
/* 77 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 79 */            viewGroup.requestApplyInsets();
/* 82 */            i11oi01ll.I00IO1();
                }

                public boolean I00OOll1(I0I1liIO0ii i0I1liIO0ii, Menu menu) {
/* 5 */             ViewGroup viewGroup = ((I11oi01ll) this.I00iiO).I00olI;
/* 7 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 9 */             viewGroup.requestApplyInsets();
/* 14 */            o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiI;
/* 18 */            ActionMode.Callback callback = (ActionMode.Callback) o01l1iooo0.I00iOIl;
/* 20 */            OliilliIi oliilliIiI000OiO = o01l1iooo0.I000OiO(i0I1liIO0ii);
/* 26 */            Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) o01l1iooo0.I00iio;
/* 32 */            Menu o1l0oO1I0iO = (Menu) ol0Ii10o1.get(menu);
/* 34 */            if (o1l0oO1I0iO == null) {
/* 45 */                o1l0oO1I0iO = new O1l0oO1I0iO((Context) o01l1iooo0.I00iiI, (O1illlIiilIl) menu);
/* 48 */                ol0Ii10o1.put(menu, o1l0oO1I0iO);
                    }
/* 51 */            return callback.onPrepareActionMode(oliilliIiI000OiO, o1l0oO1I0iO);
                }

                public OIil0IlIIol I00OilO00Il(IoiOl011o ioiOl011o, Ol0i11lo1l1I ol0i11lo1l1I) {
                    Bitmap.Config config;
/* 7 */             if (ioiOl011o.I0001Ioi1lo.isEmpty() || I1IoiO1l.I0001Ioi1lo(I000O01llI0.I00000oIO, ioiOl011o.I0000O)) {
/* 19 */                Bitmap.Config config2 = ioiOl011o.I0000O;
/* 21 */                Bitmap.Config config3 = Bitmap.Config.HARDWARE;
/* 23 */                if (config2 == config3) {
/* 25 */                    if (config2 != config3 || ioiOl011o.I000iOII) {
/* 38 */                        ((l1I0oI) this.I00iiO).getClass();
                            }
/* 31 */                    config = Bitmap.Config.ARGB_8888;
                        }
/* 41 */                config = ioiOl011o.I0000O;
                    } else {
/* 31 */                config = Bitmap.Config.ARGB_8888;
                    }
/* 54 */            IIi11lllool1 iIi11lllool1 = ((OllO11Iooi) this.I00iiI).I00iio ? ioiOl011o.I00100l0 : IIi11lllool1.I00iio;
/* 56 */            il1OioiO il1oioio = ol0i11lo1l1I.I00000oIO;
/* 58 */            Iii10OOOI iii10OOOI = Iii10OOOI.I00000oIO;
/* 78 */            OiO0llO0IO oiO0llO0IO = (il1oioio.equals(iii10OOOI) || ol0i11lo1l1I.I00000oOI.equals(iii10OOOI)) ? OiO0llO0IO.I00iiI : ioiOl011o.I001i1O0Ol;
/* 98 */            boolean z = ioiOl011o.I000l1 && ioiOl011o.I0001Ioi1lo.isEmpty() && config != Bitmap.Config.ALPHA_8;
/* 101 */           Context context = ioiOl011o.I00000oIO;
/* 103 */           boolean zI00000oIO = I0001Ioi1lo.I00000oIO(ioiOl011o);
/* 107 */           boolean z2 = ioiOl011o.I000lI;
/* 109 */           Io1Io0OOi011 io1Io0OOi011 = ioiOl011o.I000O01llI0;
/* 111 */           Olo100 olo100 = ioiOl011o.I000OOo1O;
/* 113 */           OIol1l11o oIol1l11o = ioiOl011o.I001i1lo1io;
/* 115 */           IIi11lllool1 iIi11lllool12 = ioiOl011o.I000o00OoI0I;
/* 117 */           IIi11lllool1 iIi11lllool13 = ioiOl011o.I000oI1ioi;
/* 119 */           OIil0IlIIol oIil0IlIIol = new OIil0IlIIol();
/* 122 */           oIil0IlIIol.I00000oIO = context;
/* 124 */           oIil0IlIIol.I00000oOI = config;
/* 127 */           oIil0IlIIol.I0000Il00O = null;
/* 129 */           oIil0IlIIol.I0000O = ol0i11lo1l1I;
/* 131 */           oIil0IlIIol.I0000oI00 = oiO0llO0IO;
/* 133 */           oIil0IlIIol.I0001Ioi1lo = zI00000oIO;
/* 135 */           oIil0IlIIol.I000II = z;
/* 137 */           oIil0IlIIol.I000O01llI0 = z2;
/* 139 */           oIil0IlIIol.I000OOo1O = null;
/* 141 */           oIil0IlIIol.I000OiO = io1Io0OOi011;
/* 143 */           oIil0IlIIol.I000iOII = olo100;
/* 145 */           oIil0IlIIol.I000l1 = oIol1l11o;
/* 147 */           oIil0IlIIol.I000lI = iIi11lllool12;
/* 149 */           oIil0IlIIol.I000o00OoI0I = iIi11lllool13;
/* 151 */           oIil0IlIIol.I000oI1ioi = iIi11lllool1;
/* 153 */           VarHandle.storeStoreFence();
/* 332 */           return oIil0IlIIol;
                }

                public I1lI11 I00Oio() throws IOException {
                    JSONObject jSONObject;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */             byte[] bArr = new byte[16384];
                    try {
/* 17 */                FileInputStream fileInputStream = new FileInputStream(I00IoO0());
                        while (true) {
                            try {
/* 20 */                        int i = fileInputStream.read(bArr, 0, 16384);
/* 24 */                        if (i < 0) {
                                    break;
                                }
/* 41 */                        byteArrayOutputStream.write(bArr, 0, i);
                            } catch (Throwable th) {
                                try {
/* 45 */                            fileInputStream.close();
                                } catch (Throwable th2) {
/* 50 */                            th.addSuppressed(th2);
                                }
/* 53 */                        throw th;
                            }
                        }
/* 32 */                jSONObject = new JSONObject(byteArrayOutputStream.toString());
/* 35 */                fileInputStream.close();
                    } catch (IOException | JSONException unused) {
/* 56 */                jSONObject = new JSONObject();
                    }
/* 62 */            String strOptString = jSONObject.optString("Fid", null);
/* 68 */            int iOptInt = jSONObject.optInt("Status", 0);
/* 74 */            String strOptString2 = jSONObject.optString("AuthToken", null);
/* 80 */            String strOptString3 = jSONObject.optString("RefreshToken", null);
/* 88 */            long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
/* 94 */            long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
/* 100 */           String strOptString4 = jSONObject.optString("FisError", null);
/* 104 */           int i2 = I1lI11.I000O01llI0;
/* 108 */           I1lI0iIOiOl i1lI0iIOiOl = new I1lI0iIOiOl();
/* 111 */           i1lI0iIOiOl.I0001Ioi1lo = 0L;
/* 117 */           byte b = (byte) (i1lI0iIOiOl.I000O01llI0 | 2);
/* 119 */           i1lI0iIOiOl.I00000oOI = 1;
/* 121 */           i1lI0iIOiOl.I0000oI00 = 0L;
/* 126 */           i1lI0iIOiOl.I000O01llI0 = (byte) (b | 1);
/* 128 */           i1lI0iIOiOl.I00000oIO = strOptString;
/* 135 */           int i3 = IIlIOloOOO.I001lloI(5)[iOptInt];
/* 137 */           if (i3 == 0) {
/* 167 */               IOOlIIilOl0.I000II("Null registrationStatus");
/* 61 */                return null;
                    }
/* 139 */           i1lI0iIOiOl.I00000oOI = i3;
/* 141 */           i1lI0iIOiOl.I0000Il00O = strOptString2;
/* 143 */           i1lI0iIOiOl.I0000O = strOptString3;
/* 145 */           i1lI0iIOiOl.I0001Ioi1lo = jOptLong;
/* 151 */           byte b2 = (byte) (i1lI0iIOiOl.I000O01llI0 | 2);
/* 152 */           i1lI0iIOiOl.I0000oI00 = jOptLong2;
/* 156 */           i1lI0iIOiOl.I000O01llI0 = (byte) (b2 | 1);
/* 158 */           i1lI0iIOiOl.I000II = strOptString4;
/* 160 */           return i1lI0iIOiOl.I00000oIO();
                }

                public void I00Ol00(String str, OiIoOil oiIoOil) {
/* 3 */             II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) this.I00iiI;
                    synchronized (((lolOiIoiillI) iI1oo0l11IOI.I0001Ioi1lo)) {
/* 18 */                if (((LinkedHashMap) iI1oo0l11IOI.I000II).containsKey(str)) {
/* 38 */                    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                        }
/* 24 */                ((LinkedHashMap) iI1oo0l11IOI.I000II).put(str, oiIoOil);
                    }
                }

                public void I00Ol10() throws NoSuchMethodException, SecurityException {
/* 9 */             if (!((II1oo0l11IOI) this.I00iiI).I0000Il00O) {
/* 94 */                I000II.I001IO000("Can not perform this action after onSaveInstanceState");
/* 110 */               return;
                    }
/* 13 */            I11il0o0 i11il0o0 = (I11il0o0) this.I00iiO;
/* 15 */            if (i11il0o0 == null) {
/* 20 */                i11il0o0 = new I11il0o0(1);
/* 28 */                i11il0o0.I00000oOI = new LinkedHashSet();
/* 32 */                I00Ol00("androidx.savedstate.Restarter", i11il0o0);
/* 35 */                VarHandle.storeStoreFence();
                    }
/* 38 */            this.I00iiO = i11il0o0;
                    try {
/* 41 */                O0oIl0l0.class.getDeclaredConstructor(null);
/* 46 */                I11il0o0 i11il0o02 = (I11il0o0) this.I00iiO;
/* 48 */                if (i11il0o02 != null) {
/* 58 */                    ((LinkedHashSet) i11il0o02.I00000oOI).add(O0oIl0l0.class.getName());
                        }
                    } catch (NoSuchMethodException e) {
/* 91 */                throw new IllegalArgumentException("Class " + O0oIl0l0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                    }
                }

                public void I00Ol1ll1() throws Throwable {
                    BufferedWriter bufferedWriter;
                    String str;
/* 5 */             BufferedWriter bufferedWriter2 = null;
                    try {
                        try {
/* 17 */                    bufferedWriter = new BufferedWriter(new FileWriter(I00IoiI()));
                        } catch (Throwable th) {
/* 257 */                   th = th;
                        }
                        try {
/* 24 */                    Iterator it = ((ArrayList) this.I00iiI).iterator();
/* 32 */                    while (it.hasNext()) {
/* 38 */                        IlIiiolo0OO ilIiiolo0OO = (IlIiiolo0OO) it.next();
/* 40 */                        String str2 = ilIiiolo0OO.I00000oIO;
/* 42 */                        I00Ol00 i00Ol00 = ilIiiolo0OO.I0000Il00O;
/* 48 */                        bufferedWriter.write(str2.trim());
/* 51 */                        bufferedWriter.write("|");
/* 54 */                        int i = ilIiiolo0OO.I00000oOI;
/* 57 */                        if (i == 1) {
/* 72 */                            str = "TTF";
                                } else if (i == 2) {
/* 69 */                            str = "OTF";
                                } else {
/* 63 */                            if (i != 3) {
/* 68 */                                throw null;
                                    }
/* 65 */                            str = "PFB";
                                }
/* 74 */                        bufferedWriter.write(str);
/* 77 */                        bufferedWriter.write("|");
/* 80 */                        if (i00Ol00 != null) {
/* 118 */                           bufferedWriter.write(((String) i00Ol00.I0000Il00O) + '-' + ((String) i00Ol00.I0000O) + '-' + i00Ol00.I00000oOI);
                                }
/* 130 */                       bufferedWriter.write("|");
/* 133 */                       int i2 = ilIiiolo0OO.I0000O;
/* 136 */                       if (i2 > -1) {
/* 142 */                           bufferedWriter.write(Integer.toHexString(i2));
                                }
/* 145 */                       bufferedWriter.write("|");
/* 148 */                       int i3 = ilIiiolo0OO.I0000oI00;
/* 150 */                       if (i3 > -1) {
/* 156 */                           bufferedWriter.write(Integer.toHexString(i3));
                                }
/* 159 */                       bufferedWriter.write("|");
/* 168 */                       bufferedWriter.write(Integer.toHexString(ilIiiolo0OO.I0001Ioi1lo));
/* 171 */                       bufferedWriter.write("|");
/* 180 */                       bufferedWriter.write(Integer.toHexString(ilIiiolo0OO.I000II));
/* 183 */                       bufferedWriter.write("|");
/* 186 */                       int i4 = ilIiiolo0OO.I000O01llI0;
/* 188 */                       if (i4 > -1) {
/* 194 */                           bufferedWriter.write(Integer.toHexString(i4));
                                }
/* 197 */                       bufferedWriter.write("|");
/* 200 */                       IIloOI iIloOI = ilIiiolo0OO.I000OOo1O;
/* 202 */                       if (iIloOI != null) {
/* 206 */                           byte[] bArr = (byte[]) iIloOI.I00iiI;
/* 211 */                           for (int i5 = 0; i5 < 10; i5++) {
/* 215 */                               String hexString = Integer.toHexString(bArr[i5]);
/* 223 */                               if (hexString.length() == 1) {
/* 227 */                                   bufferedWriter.write(48);
                                        }
/* 230 */                               bufferedWriter.write(hexString);
                                    }
                                }
/* 236 */                       bufferedWriter.write("|");
/* 245 */                       bufferedWriter.write(ilIiiolo0OO.I000OiO.getAbsolutePath());
/* 248 */                       bufferedWriter.newLine();
                            }
/* 253 */                   io0iolo.I00000oOI(bufferedWriter);
                        } catch (IOException e) {
/* 126 */                   e = e;
/* 127 */                   bufferedWriter2 = bufferedWriter;
/* 262 */                   Log.w("PdfBox-Android", "Could not write to font cache", e);
/* 267 */                   Log.w("PdfBox-Android", "Installed fonts information will have to be reloaded for each start");
/* 272 */                   Log.w("PdfBox-Android", "You can assign a directory to the 'pdfbox.fontcache' property");
/* 275 */                   io0iolo.I00000oOI(bufferedWriter2);
                        } catch (Throwable th2) {
/* 122 */                   th = th2;
/* 123 */                   bufferedWriter2 = bufferedWriter;
/* 279 */                   io0iolo.I00000oOI(bufferedWriter2);
/* 282 */                   throw th;
                        }
                    } catch (IOException e2) {
/* 259 */               e = e2;
                    } catch (SecurityException unused) {
                    }
                }

                public void I00OloOo(ArrayList arrayList) throws Throwable {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                File file = (File) it.next();
                        try {
/* 21 */                    String lowerCase = file.getPath().toLowerCase();
/* 31 */                    if (lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf")) {
/* 77 */                        I001iOo1i0O(file);
                            } else if (lowerCase.endsWith(".ttc") || lowerCase.endsWith(".otc")) {
/* 73 */                        I001i1lo1io(file);
                            } else if (lowerCase.endsWith(".pfb")) {
/* 67 */                        I001lllioOl(file);
                            }
                        } catch (IOException e) {
/* 101 */                   Log.w("PdfBox-Android", "Error parsing font " + file.getPath(), e);
                        }
                    }
                }

                public Drawable I00i01iIIliI(Drawable drawable, boolean z) {
/* 4 */             if (!(drawable instanceof LayerDrawable)) {
/* 132 */               if (!(drawable instanceof BitmapDrawable)) {
/* 207 */                   return drawable;
                        }
/* 134 */               BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
/* 136 */               Bitmap bitmap = bitmapDrawable.getBitmap();
/* 144 */               if (((Bitmap) this.I00iiO) == null) {
/* 146 */                   this.I00iiO = bitmap;
                        }
/* 163 */               ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
/* 179 */               shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
/* 194 */               shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                        return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
                    }
/* 6 */             LayerDrawable layerDrawable = (LayerDrawable) drawable;
/* 8 */             int numberOfLayers = layerDrawable.getNumberOfLayers();
/* 12 */            Drawable[] drawableArr = new Drawable[numberOfLayers];
/* 16 */            for (int i = 0; i < numberOfLayers; i++) {
/* 18 */                int id = layerDrawable.getId(i);
/* 44 */                drawableArr[i] = I00i01iIIliI(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                    }
/* 51 */            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
/* 54 */            for (int i2 = 0; i2 < numberOfLayers; i2++) {
/* 60 */                layerDrawable2.setId(i2, layerDrawable.getId(i2));
/* 67 */                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
/* 74 */                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
/* 81 */                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
/* 88 */                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
/* 95 */                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
/* 102 */               layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
/* 109 */               layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
/* 116 */               layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
/* 123 */               layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                    }
/* 129 */           return layerDrawable2;
                }

                @Override
                public Oli1o0 apply() {
/* 3 */             O0io0olo o0io0olo = (O0io0olo) this.I00iiI;
/* 5 */             O0il1o0oIi o0il1o0oIiI00O0o1oo = I00O0o1oo();
/* 9 */             if (o0il1o0oIiI00O0o1oo != null) {
/* 12 */                o0io0olo.I00000oIO(o0il1o0oIiI00O0o1oo, false);
                    }
/* 17 */            return o0io0olo.I0000oI00(this.I00iiO);
                }

                @Override
                public void cancel() {
/* 1 */             O0il1o0oIi o0il1o0oIiI00O0o1oo = I00O0o1oo();
/* 11 */            if ((o0il1o0oIiI00O0o1oo != null ? o0il1o0oIiI00O0o1oo.I0001Ioi1lo : null) != null) {
/* 19 */                ((O0io0olo) this.I00iiI).I000II(this.I00iiO);
                    }
                }

                @Override
                public void onCancel() {
/* 5 */             ((Animator) this.I00iiI).end();
/* 13 */            if (Ill1OlOOl.I00IOO(2)) {
/* 19 */                Objects.toString((OlIIlIO1O) this.I00iiO);
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 13:
/* 90 */                    return IlIi0I0.I000lI("LangSysRecord[langSysTag=", (String) this.I00iiI, "]");
                        case 14:
/* 77 */                    return "HttpStatement[" + ((IoO10oI0o) this.I00iiI).I00000oIO + ']';
                        case PoseLandmark.RIGHT_PINKY:
/* 15 */                    StringBuilder sb = new StringBuilder(Barcode.FORMAT_ITF);
/* 20 */                    sb.append("LoaderManager{");
/* 31 */                    sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 36 */                    sb.append(" in ");
/* 43 */                    il0OoI1liO.I00000oIO((O0oiOi) this.I00iiI, sb);
/* 48 */                    sb.append("}}");
/* 51 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 35 */        public I1I0i0Ilo1Oi(OI0010oo1o oI0010oo1o, o01l1ioOo0 o01l1iooo0, IIIOIlo1oo0 iIIOIlo1oo0) {
                    this.I00iOIl = 2;
/* 37 */            this.I00iiI = iIIOIlo1oo0;
/* 38 */            this.I00iiO = new IIlio101Io(3, oI0010oo1o, o01l1iooo0);
                }

/* 38 */        public I1I0i0Ilo1Oi(IoO10oI0o ioO10oI0o, IoIlI1oli ioIlI1oli) {
                    this.I00iOIl = 14;
/* 40 */            this.I00iiI = ioO10oI0o;
/* 41 */            this.I00iiO = ioIlI1oli;
                }

/* 41 */        public I1I0i0Ilo1Oi(AbsSeekBar absSeekBar) {
                    this.I00iOIl = 0;
/* 43 */            this.I00iiI = absSeekBar;
                }

/* 43 */        public I1I0i0Ilo1Oi(int i) {
/* 44 */            this.I00iOIl = i;
                }

/* 44 */        public I1I0i0Ilo1Oi(IIOOoll iIOOoll, String str) {
                    this.I00iOIl = 26;
                    this.I00iiO = iIOOoll;
                    this.I00iiI = str;
                }
            }

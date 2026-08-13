            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.Color;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.BitmapDrawable;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.HandlerThread;
            import android.os.Looper;
            import android.os.Parcel;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Rational;
            import android.util.Size;
            import android.view.Window;
            import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.MissingFormatArgumentException;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONArray;
            import org.json.JSONException;
            
/* 19 */    public final class iiOlilo0IIIl implements O1l0OiO10IoI, I1oIloOoiO, OoIoiillo, I1Olli1oIi, Ii100OlIo10, O0Iioo1lO0o, OOIIOiIoll0, OIOolOo, I11101ii1, i0Ii0I1ll, OOooilOIIl0I {
                public static volatile iiOlilo0IIIl I00iiI;
                public static iiOlilo0IIIl I00iio;
                public Object I00iOIl;
                public static final Object I00iiO = new Object();
                public static final ilO11o0Ol I00ilI0I1 = new ilO11o0Ol(1);

                public iiOlilo0IIIl(Bundle bundle) {
/* 4 */             if (bundle != null) {
/* 11 */                this.I00iOIl = new Bundle(bundle);
                    } else {
/* 16 */                IOOlIIilOl0.I000II("data");
/* 29 */                throw null;
                    }
                }

                public static iiOlilo0IIIl I001IO000() {
                    iiOlilo0IIIl iiolilo0iiil;
                    synchronized (I00iiO) {
                        try {
/* 4 */                     iiolilo0iiil = I00iio;
/* 6 */                     if (iiolilo0iiil == null) {
/* 14 */                        HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
/* 17 */                        handlerThread.start();
/* 20 */                        Looper looper = handlerThread.getLooper();
/* 26 */                        iiOlilo0IIIl iiolilo0iiil2 = new iiOlilo0IIIl();
/* 33 */                        O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(looper, 2, false);
/* 36 */                        Looper.getMainLooper();
/* 39 */                        iiolilo0iiil2.I00iOIl = o1oo1il01OoO;
/* 41 */                        VarHandle.storeStoreFence();
/* 44 */                        I00iio = iiolilo0iiil2;
/* 46 */                        iiolilo0iiil = iiolilo0iiil2;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 51 */            return iiolilo0iiil;
                }

                public static boolean I00IO1(Bundle bundle) {
                    return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
                }

                public static OliOlO1o1 I00IOO(OOlli1l1lOlI oOlli1l1lOlI, IoiOl011o ioiOl011o, O1il00oooo o1il00oooo, O1il0O00 o1il0O00) {
/* 14 */            BitmapDrawable bitmapDrawable = new BitmapDrawable(ioiOl011o.I00000oIO.getResources(), o1il0O00.I00000oIO);
/* 17 */            Ii1I1OOilolI ii1I1OOilolI = Ii1I1OOilolI.I00iOIl;
/* 19 */            Map map = o1il0O00.I00000oOI;
/* 23 */            Object obj = map.get("coil#disk_cache_key");
/* 35 */            String str = obj instanceof String ? (String) obj : null;
/* 38 */            Object obj2 = map.get("coil#is_sampled");
/* 47 */            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
/* 49 */            boolean z = false;
/* 58 */            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 59 */            Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 61 */            if (oOlli1l1lOlI != null && oOlli1l1lOlI.I00iiI) {
/* 67 */                z = true;
                    }
/* 72 */            return new OliOlO1o1(bitmapDrawable, ioiOl011o, ii1I1OOilolI, o1il00oooo, str, zBooleanValue, z);
                }

                public static I1l1oO0OI1 I00Io1lO(I1l0iIlI10 i1l0iIlI10) throws Ioi1lIO {
/* 1 */             I1l1oO0OI1 i1l1oO0OI1 = i1l0iIlI10.I00000oIO;
/* 5 */             IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) i1l1oO0OI1.I00000oIO;
/* 7 */             Rect rect = i1l1oO0OI1.I0000oI00;
                    try {
/* 13 */                byte[] bArrI0000Il00O = ioOiOIli1i.I0000Il00O(ioiO1IO1I1i, rect, i1l0iIlI10.I00000oOI, i1l1oO0OI1.I0001Ioi1lo);
                        try {
/* 27 */                    Il1Ilio1Ol1 il1Ilio1Ol1 = new Il1Ilio1Ol1(new ByteArrayInputStream(bArrI0000Il00O));
/* 30 */                    Il1I0ll il1I0ll = new Il1I0ll();
/* 33 */                    il1I0ll.I00000oIO = il1Ilio1Ol1;
/* 35 */                    VarHandle.storeStoreFence();
/* 48 */                    Size size = new Size(rect.width(), rect.height());
/* 61 */                    Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
/* 64 */                    int i = i1l1oO0OI1.I0001Ioi1lo;
/* 66 */                    Matrix matrix = i1l1oO0OI1.I000II;
/* 68 */                    RectF rectF = OoI0lIiO.I00000oIO;
/* 72 */                    Matrix matrix2 = new Matrix(matrix);
/* 83 */                    matrix2.postTranslate(-rect.left, -rect.top);
/* 92 */                    return new I1l1oO0OI1(bArrI0000Il00O, il1I0ll, Barcode.FORMAT_QR_CODE, size, rect2, i, matrix2, i1l1oO0OI1.I000O01llI0);
                        } catch (IOException e) {
/* 104 */                   throw new Ioi1lIO("Failed to extract Exif from YUV-generated JPEG", e, 0);
                        }
                    } catch (IoiOo0 e2) {
/* 168 */               throw new Ioi1lIO("Failed to encode the image to JPEG.", e2, 1);
                    }
                }

                public static o0IiOl I00Io1o110i(Callable callable) {
/* 3 */             OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 9 */             l0001OI0 l0001oi0 = new l0001OI0(6);
/* 12 */            l0001oi0.I00iiI = callable;
/* 14 */            l0001oi0.I00iiO = oloIlI0ll;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            io1OllI.I00000oIO(1, l0001oi0);
/* 23 */            return oloIlI0ll.I00000oIO;
                }

                public static String I00IoO0(String str) {
                    return str.startsWith("gcm.n.") ? str.substring(6) : str;
                }

                @Override
                public void I00000oIO(Throwable th, IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00ilI0I1;
/* 7 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(19);
/* 10 */            iiioilIl1Il.I00iiI = illOOo00lI;
/* 12 */            iiioilIl1Il.I00iiO = th;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I000o00OoI0I(o0oO1Ii0, iiioilIl1Il);
                }

                @Override
                public void I00000oOI(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iiI;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(4);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I000o00OoI0I(o0oO1Ii0, i11i0ol0l0);
                }

                @Override
                public Object I0000Il00O() {
/* 11 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iOIl));
/* 16 */            i0Iol0l1lIl i0iol0l1lil = new i0Iol0l1lIl();
/* 19 */            i0iol0l1lil.I00000oIO = i0ioo0i0;
/* 21 */            VarHandle.storeStoreFence();
/* 55 */            return i0iol0l1lil;
                }

                @Override
                public void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
                    I11oO10o1i i11oO10o1i;
/* 3 */             I11oi01ll i11oi01ll = (I11oi01ll) this.I00iOIl;
/* 5 */             O1illlIiilIl o1illlIiilIlI000iOII = o1illlIiilIl.I000iOII();
/* 9 */             int i = 0;
/* 15 */            boolean z2 = o1illlIiilIlI000iOII != o1illlIiilIl;
/* 16 */            if (z2) {
/* 18 */                o1illlIiilIl = o1illlIiilIlI000iOII;
                    }
/* 19 */            I11oO10o1i[] i11oO10o1iArr = i11oi01ll.I010II;
/* 25 */            int length = i11oO10o1iArr != null ? i11oO10o1iArr.length : 0;
                    while (true) {
/* 26 */                if (i < length) {
/* 28 */                    i11oO10o1i = i11oO10o1iArr[i];
/* 30 */                    if (i11oO10o1i != null && i11oO10o1i.I000O01llI0 == o1illlIiilIl) {
                                break;
                            } else {
/* 37 */                        i++;
                            }
                        } else {
/* 40 */                    i11oO10o1i = null;
                            break;
                        }
                    }
/* 41 */            if (i11oO10o1i != null) {
/* 43 */                if (!z2) {
/* 54 */                    i11oi01ll.I00100l0(i11oO10o1i, z);
                        } else {
/* 47 */                    i11oi01ll.I000o00OoI0I(i11oO10o1i.I00000oIO, i11oO10o1i, o1illlIiilIlI000iOII);
/* 50 */                    i11oi01ll.I00100l0(i11oO10o1i, true);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I0000oI00(Oll0I0l1i1 oll0I0l1i1) {
                    Oll0OO0O oll0OO0O;
/* 5 */             if (!lOllIO.I00000oOI()) {
/* 15 */                Executor mainExecutor = ((OOIIooi) this.I00iOIl).getContext().getMainExecutor();
/* 23 */                Io11iII11ll io11iII11ll = new Io11iII11ll(11);
/* 26 */                io11iII11ll.I00iiI = this;
/* 28 */                io11iII11ll.I00iiO = oll0I0l1i1;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                mainExecutor.execute(io11iII11ll);
/* 36 */                return;
                    }
/* 40 */            l11I11lO.I0000O(3, "PreviewView");
/* 43 */            IIllOo0 iIllOo0 = oll0I0l1i1.I0000O;
/* 53 */            ((OOIIooi) this.I00iOIl).I00l0I0l0lO1 = iIllOo0.I0010o();
/* 59 */            OOIOI1oI oOIOI1oI = ((OOIIooi) this.I00iOIl).I00ioIO;
/* 65 */            Rect rectI000OOo1O = iIllOo0.I0010o().I000OOo1O();
/* 69 */            oOIOI1oI.getClass();
/* 82 */            new Rational(rectI000OOo1O.width(), rectI000OOo1O.height());
                    synchronized (oOIOI1oI) {
/* 86 */                oOIOI1oI.I00000oOI = rectI000OOo1O;
                    }
/* 97 */            Executor mainExecutor2 = ((OOIIooi) this.I00iOIl).getContext().getMainExecutor();
/* 104 */           IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(4);
/* 107 */           iiI0oIlol0.I00iiI = this;
/* 109 */           iiI0oIlol0.I00iiO = iIllOo0;
/* 111 */           iiI0oIlol0.I00iio = oll0I0l1i1;
/* 113 */           VarHandle.storeStoreFence();
/* 116 */           oll0I0l1i1.I00000oOI(mainExecutor2, iiI0oIlol0);
/* 121 */           OOIIooi oOIIooi = (OOIIooi) this.I00iOIl;
/* 123 */           OOIO1OOiI0 oOIO1OOiI0 = oOIIooi.I00iiI;
/* 125 */           OOIIo1 oOIIo1 = oOIIooi.I00iOIl;
/* 130 */           if (!(oOIO1OOiI0 instanceof Oll0OO0O) || OOIIooi.I00000oOI(oll0I0l1i1, oOIIo1)) {
/* 141 */               OOIIooi oOIIooi2 = (OOIIooi) this.I00iOIl;
/* 145 */               boolean zI00000oOI = OOIIooi.I00000oOI(oll0I0l1i1, oOIIooi2.I00iOIl);
/* 151 */               OOIIooi oOIIooi3 = (OOIIooi) this.I00iOIl;
/* 153 */               OOIIloi0 oOIIloi0 = oOIIooi3.I00iio;
/* 155 */               if (zI00000oOI) {
/* 159 */                   Oo0oI1oo oo0oI1oo = new Oo0oI1oo(oOIIooi3, oOIIloi0);
/* 162 */                   oo0oI1oo.I000OOo1O = false;
/* 169 */                   oo0oI1oo.I000iOII = new AtomicReference();
                            oll0OO0O = oo0oI1oo;
                        } else {
/* 174 */                   Oll0OO0O oll0OO0O2 = new Oll0OO0O(oOIIooi3, oOIIloi0);
/* 179 */                   Oll0IoIOoi1 oll0IoIOoi1 = new Oll0IoIOoi1();
/* 182 */                   oll0IoIOoi1.I000O01llI0 = oll0OO0O2;
/* 184 */                   oll0IoIOoi1.I0001Ioi1lo = false;
/* 186 */                   oll0IoIOoi1.I000II = false;
/* 188 */                   VarHandle.storeStoreFence();
/* 191 */                   oll0OO0O2.I0001Ioi1lo = oll0IoIOoi1;
/* 193 */                   VarHandle.storeStoreFence();
                            oll0OO0O = oll0OO0O2;
                        }
/* 196 */               oOIIooi2.I00iiI = oll0OO0O;
                    }
/* 200 */           IIllOioOlolI iIllOioOlolII0010o = iIllOo0.I0010o();
/* 206 */           OOIIooi oOIIooi4 = (OOIIooi) this.I00iOIl;
/* 208 */           OI0lOii0I oI0lOii0I = oOIIooi4.I00ilO0;
/* 210 */           OOIO1OOiI0 oOIO1OOiI02 = oOIIooi4.I00iiI;
/* 212 */           OOIIlOOo oOIIlOOo = new OOIIlOOo();
/* 215 */           oOIIlOOo.I0001Ioi1lo = false;
/* 217 */           oOIIlOOo.I00000oIO = iIllOioOlolII0010o;
/* 219 */           oOIIlOOo.I00000oOI = oI0lOii0I;
/* 221 */           oOIIlOOo.I0000O = oOIO1OOiI02;
                    synchronized (oOIIlOOo) {
/* 230 */               oOIIlOOo.I0000Il00O = (OOIIollIo) oI0lOii0I.I0000O();
                    }
/* 233 */           VarHandle.storeStoreFence();
/* 242 */           ((OOIIooi) this.I00iOIl).I00io1l.set(oOIIlOOo);
/* 261 */           iIllOo0.I0000O().I00000oOI(((OOIIooi) this.I00iOIl).getContext().getMainExecutor(), oOIIlOOo);
/* 268 */           OOIO1OOiI0 oOIO1OOiI03 = ((OOIIooi) this.I00iOIl).I00iiI;
/* 273 */           IiI0oIlol0 iiI0oIlol02 = new IiI0oIlol0(5);
/* 276 */           iiI0oIlol02.I00iiI = this;
/* 278 */           iiI0oIlol02.I00iiO = oOIIlOOo;
/* 280 */           iiI0oIlol02.I00iio = iIllOo0;
/* 282 */           VarHandle.storeStoreFence();
/* 285 */           oOIO1OOiI03.I0000oI00(oll0I0l1i1, iiI0oIlol02);
/* 290 */           OOIIooi oOIIooi5 = (OOIIooi) this.I00iOIl;
/* 299 */           if (oOIIooi5.indexOfChild(oOIIooi5.I00iiO) == -1) {
/* 303 */               OOIIooi oOIIooi6 = (OOIIooi) this.I00iOIl;
/* 307 */               oOIIooi6.addView(oOIIooi6.I00iiO);
                    }
                }

                @Override
                public Iterable I0001Ioi1lo(Object obj) {
/* 3 */             O0I0iO0I1iI o0I0iO0I1iI = (O0I0iO0I1iI) this.I00iOIl;
/* 11 */            Collection collectionI0000oI00 = ((OI000ilOol) obj).I000OOo1O().I0000oI00();
/* 19 */            ArrayList arrayList = new ArrayList();
/* 22 */            Iterator it = collectionI0000oI00.iterator();
/* 30 */            while (it.hasNext()) {
/* 42 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((O0iIl1) it.next()).I00iOIl().I00100o1O0lo();
/* 46 */                O0l1i0l o0l1i0lI00000oIO = null;
/* 54 */                IOIiO1lIl0l iOIiO1lIl0lI00000oIO = iOIiO1lIl0lI00100o1O0lo != null ? iOIiO1lIl0lI00100o1O0lo.I010i10l() : null;
/* 62 */                OI000ilOol oI000ilOol = iOIiO1lIl0lI00000oIO instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00000oIO : null;
/* 63 */                if (oI000ilOol != null && (o0l1i0lI00000oIO = o0I0iO0I1iI.I00000oIO(oI000ilOol)) == null) {
/* 73 */                    o0l1i0lI00000oIO = oI000ilOol;
                        }
/* 74 */                if (o0l1i0lI00000oIO != null) {
/* 76 */                    arrayList.add(o0l1i0lI00000oIO);
                        }
                    }
/* 168 */           return arrayList;
                }

                @Override
                public void I000II(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iiO;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(2);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I000o00OoI0I(o0oO1Ii0, i11i0ol0l0);
                }

                @Override
                public void I000O01llI0(IOlo10lO1iOl iOlo10lO1iOl) {
/* 7 */             boolean z = iOlo10lO1iOl.I00iiI == 0;
/* 10 */            I1oIol10O i1oIol10O = (I1oIol10O) this.I00iOIl;
/* 12 */            if (z) {
/* 19 */                i1oIol10O.I000OiO(null, i1oIol10O.I000iOII());
/* 22 */                return;
                    }
/* 23 */            I1oIlOi11 i1oIlOi11 = i1oIol10O.I00100l0;
/* 25 */            if (i1oIlOi11 != null) {
/* 27 */                i1oIlOi11.I00000oOI(iOlo10lO1iOl);
                    }
                }

                @Override
                public void I000OOo1O(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00ilI0I1;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(5);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I000o00OoI0I(o0oO1Ii0, i11i0ol0l0);
                }

                @Override
                public void I000OiO(IllOOo00lI illOOo00lI) {
/* 1 */             O0oO1Ii0 o0oO1Ii0 = O0oO1Ii0.I00iio;
/* 6 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(3);
/* 9 */             i11i0ol0l0.I00iiI = illOOo00lI;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I000o00OoI0I(o0oO1Ii0, i11i0ol0l0);
                }

                public void I000iOII(O0IOli0o0 o0IOli0o0, Function1 function1) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iOIl;
/* 9 */             if (linkedHashMap.containsKey(o0IOli0o0)) {
/* 39 */                I000II.I0010I0i(IlIi0I0.I000lI("A `initializer` with the same `clazz` has already been added: ", o0IOli0o0.I000O01llI0(), "."));
/* 106 */               return;
                    }
/* 13 */            Oooioli00Io oooioli00Io = new Oooioli00Io();
/* 16 */            oooioli00Io.I00000oIO = o0IOli0o0;
/* 18 */            oooioli00Io.I00000oOI = function1;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            linkedHashMap.put(o0IOli0o0, oooioli00Io);
                }

                @Override
                public OoIoiillI1 I000l1(String str) {
/* 6 */             return ((IIOO01IIlii) this.I00iOIl).I0000oI00(0);
                }

                @Override
                public boolean I000lI(O1illlIiilIl o1illlIiilIl) {
                    Window.Callback callback;
/* 3 */             I11oi01ll i11oi01ll = (I11oi01ll) this.I00iOIl;
/* 9 */             if (o1illlIiilIl != o1illlIiilIl.I000iOII() || !i11oi01ll.I00ooiO1I || (callback = i11oi01ll.I00l0I0l0lO1.getCallback()) == null || i11oi01ll.I010l10O) {
/* 32 */                return true;
                    }
/* 29 */            callback.onMenuOpened(108, o1illlIiilIl);
/* 32 */            return true;
                }

                public void I000o00OoI0I(O0oO1Ii0 o0oO1Ii0, Function1 function1) {
                    boolean zI00100o1O0lo;
/* 3 */             O1I1OOiol o1I1OOiol = (O1I1OOiol) this.I00iOIl;
/* 5 */             int iOrdinal = o0oO1Ii0.ordinal();
/* 15 */            if (iOrdinal == 0) {
/* 53 */                zI00100o1O0lo = o1I1OOiol.I00100o1O0lo(null);
                    } else if (iOrdinal == 1) {
/* 48 */                zI00100o1O0lo = o1I1OOiol.I000lI(null);
                    } else if (iOrdinal == 2) {
/* 43 */                zI00100o1O0lo = o1I1OOiol.I0010o(null);
                    } else if (iOrdinal == 3) {
/* 38 */                zI00100o1O0lo = o1I1OOiol.I000OOo1O(null);
                    } else if (iOrdinal == 4) {
/* 33 */                zI00100o1O0lo = o1I1OOiol.I0001Ioi1lo(null);
                    } else {
/* 25 */                if (iOrdinal != 5) {
/* 29 */                    I000II.I00000oIO();
/* 32 */                    return;
                        }
/* 27 */                zI00100o1O0lo = false;
                    }
/* 57 */            if (zI00100o1O0lo) {
/* 61 */                O0Il0I1001 o0Il0I1001 = new O0Il0I1001();
/* 64 */                function1.invoke(o0Il0I1001);
/* 67 */                String str = o0Il0I1001.I00000oIO;
/* 69 */                Throwable th = o0Il0I1001.I00000oOI;
/* 71 */                int iOrdinal2 = o0oO1Ii0.ordinal();
/* 75 */                if (iOrdinal2 == 0) {
/* 108 */                   o1I1OOiol.I0000Il00O(null, str, th);
/* 332 */                   return;
                        }
/* 77 */                if (iOrdinal2 == 1) {
/* 104 */                   o1I1OOiol.I000O01llI0(null, str, th);
/* 107 */                   return;
                        }
/* 79 */                if (iOrdinal2 == 2) {
/* 100 */                   o1I1OOiol.I000OiO(null, str, th);
/* 103 */                   return;
                        }
/* 81 */                if (iOrdinal2 == 3) {
/* 96 */                    o1I1OOiol.I000oI1ioi(null, str, th);
                        } else if (iOrdinal2 == 4) {
/* 92 */                    o1I1OOiol.I0010I0i(null, str, th);
                        } else {
/* 85 */                    if (iOrdinal2 == 5) {
/* 332 */                       return;
                            }
/* 88 */                    I000II.I00000oIO();
                        }
                    }
                }

                public I0IOoio1iool I000oI1ioi() {
/* 18 */            Oooioli00Io[] oooioli00IoArr = (Oooioli00Io[]) ((LinkedHashMap) this.I00iOIl).values().toArray(new Oooioli00Io[0]);
/* 25 */            Oooioli00Io[] oooioli00IoArr2 = (Oooioli00Io[]) Arrays.copyOf(oooioli00IoArr, oooioli00IoArr.length);
/* 28 */            I0IOoio1iool i0IOoio1iool = new I0IOoio1iool(2);
/* 31 */            i0IOoio1iool.I00000oOI = oooioli00IoArr2;
/* 33 */            VarHandle.storeStoreFence();
/* 55 */            return i0IOoio1iool;
                }

                public Ii1111Olil I00100l0() {
/* 3 */             Context context = (Context) this.I00iOIl;
/* 5 */             if (context == null) {
/* 245 */               throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
                    }
/* 9 */             Ii1111Olil ii1111Olil = new Ii1111Olil();
/* 18 */            ii1111Olil.I00iOIl = Iiio0i0ili1.I00000oIO(iIO0ool0O0.I00000oIO);
/* 22 */            int i = 1;
/* 23 */            Ii0O1OIO1i ii0O1OIO1i = new Ii0O1OIO1i(i);
/* 26 */            ii0O1OIO1i.I00000oOI = context;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            ii1111Olil.I00iiI = ii0O1OIO1i;
/* 35 */            int i2 = 0;
/* 36 */            Ii0O1OIO1i ii0O1OIO1i2 = new Ii0O1OIO1i(i2);
/* 39 */            ii0O1OIO1i2.I00000oOI = ii0O1OIO1i;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            O1lOoiIliOOi o1lOoiIliOOi = new O1lOoiIliOOi(i2);
/* 49 */            o1lOoiIliOOi.I00000oOI = ii0O1OIO1i;
/* 51 */            o1lOoiIliOOi.I0000Il00O = ii0O1OIO1i2;
/* 53 */            VarHandle.storeStoreFence();
/* 60 */            ii1111Olil.I00iiO = Iiio0i0ili1.I00000oIO(o1lOoiIliOOi);
/* 62 */            Ii0O1OIO1i ii0O1OIO1i3 = ii1111Olil.I00iiI;
/* 66 */            Il1110o1oIl il1110o1oIl = new Il1110o1oIl(i);
/* 69 */            il1110o1oIl.I00000oOI = ii0O1OIO1i3;
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            ii1111Olil.I00iio = il1110o1oIl;
/* 78 */            Il1110o1oIl il1110o1oIl2 = new Il1110o1oIl(i2);
/* 81 */            il1110o1oIl2.I00000oOI = ii0O1OIO1i3;
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            OOiO01IO oOiO01IOI00000oIO = Iiio0i0ili1.I00000oIO(il1110o1oIl2);
/* 90 */            Il1110o1oIl il1110o1oIl3 = ii1111Olil.I00iio;
/* 94 */            O1lOoiIliOOi o1lOoiIliOOi2 = new O1lOoiIliOOi(i);
/* 97 */            o1lOoiIliOOi2.I00000oOI = il1110o1oIl3;
/* 99 */            o1lOoiIliOOi2.I0000Il00O = oOiO01IOI00000oIO;
/* 101 */           VarHandle.storeStoreFence();
/* 104 */           OOiO01IO oOiO01IOI00000oIO2 = Iiio0i0ili1.I00000oIO(o1lOoiIliOOi2);
/* 108 */           ii1111Olil.I00ilI0I1 = oOiO01IOI00000oIO2;
/* 112 */           Il11lOl il11lOl = new Il11lOl(i);
/* 115 */           VarHandle.storeStoreFence();
/* 118 */           Ii0O1OIO1i ii0O1OIO1i4 = ii1111Olil.I00iiI;
/* 122 */           OiOIi0O01 oiOIi0O01 = new OiOIi0O01(i2);
/* 125 */           oiOIi0O01.I00000oOI = ii0O1OIO1i4;
/* 127 */           oiOIi0O01.I0000Il00O = oOiO01IOI00000oIO2;
/* 129 */           oiOIi0O01.I0000O = il11lOl;
/* 131 */           VarHandle.storeStoreFence();
/* 134 */           OOiO01IO oOiO01IO = ii1111Olil.I00iOIl;
/* 136 */           OOiO01IO oOiO01IO2 = ii1111Olil.I00iiO;
/* 140 */           IiI10I1IlO iiI10I1IlO = new IiI10I1IlO();
/* 143 */           iiI10I1IlO.I00000oIO = oOiO01IO;
/* 145 */           iiI10I1IlO.I00000oOI = oOiO01IO2;
/* 147 */           iiI10I1IlO.I0000Il00O = oiOIi0O01;
/* 149 */           iiI10I1IlO.I0000O = oOiO01IOI00000oIO2;
/* 151 */           iiI10I1IlO.I0000oI00 = oOiO01IOI00000oIO2;
/* 153 */           VarHandle.storeStoreFence();
/* 158 */           Ool0Ilo1OO ool0Ilo1OO = new Ool0Ilo1OO();
/* 161 */           ool0Ilo1OO.I00000oIO = ii0O1OIO1i4;
/* 163 */           ool0Ilo1OO.I00000oOI = oOiO01IO2;
/* 165 */           ool0Ilo1OO.I0000Il00O = oOiO01IOI00000oIO2;
/* 167 */           ool0Ilo1OO.I0000O = oiOIi0O01;
/* 169 */           ool0Ilo1OO.I0000oI00 = oOiO01IO;
/* 171 */           ool0Ilo1OO.I0001Ioi1lo = oOiO01IOI00000oIO2;
/* 173 */           ool0Ilo1OO.I000II = oOiO01IOI00000oIO2;
/* 175 */           VarHandle.storeStoreFence();
/* 180 */           i01IiIoioll i01iiioioll = new i01IiIoioll();
/* 183 */           i01iiioioll.I00000oIO = oOiO01IO;
/* 185 */           i01iiioioll.I00000oOI = oOiO01IOI00000oIO2;
/* 187 */           i01iiioioll.I0000Il00O = oiOIi0O01;
/* 189 */           i01iiioioll.I0000O = oOiO01IOI00000oIO2;
/* 191 */           VarHandle.storeStoreFence();
/* 196 */           OiOIi0O01 oiOIi0O012 = new OiOIi0O01(i);
/* 199 */           oiOIi0O012.I00000oOI = iiI10I1IlO;
/* 201 */           oiOIi0O012.I0000Il00O = ool0Ilo1OO;
/* 203 */           oiOIi0O012.I0000O = i01iiioioll;
/* 205 */           VarHandle.storeStoreFence();
/* 212 */           ii1111Olil.I00ilO0 = Iiio0i0ili1.I00000oIO(oiOIi0O012);
/* 214 */           return ii1111Olil;
                }

                public void I00100o1O0lo(byte b) {
/* 5 */             ((Parcel) this.I00iOIl).writeByte(b);
                }

                public void I0010I0i(float f) {
/* 5 */             ((Parcel) this.I00iOIl).writeFloat(f);
                }

                public void I0010o(long j) {
/* 1 */             long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j);
/* 11 */            byte b = 0;
/* 12 */            if (!Oo0o1iioOiO.I00000oOI(jI0000Il00O, 0L)) {
/* 24 */                if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 26 */                    b = 1;
                        } else if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 39 */                    b = 2;
                        }
                    }
/* 40 */            I00100o1O0lo(b);
/* 51 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 0L)) {
/* 77 */                return;
                    }
/* 57 */            I0010I0i(Oo0o1OiIo.I0000O(j));
                }

                public boolean I00111O(String str) {
/* 1 */             String strI00II0Ol1O0l = I00II0Ol1O0l(str);
                    return "1".equals(strI00II0Ol1O0l) || Boolean.parseBoolean(strI00II0Ol1O0l);
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x014e A[PHI: r16
                  0x014e: PHI (r16v3 O1il0O00) = (r16v1 O1il0O00), (r16v1 O1il0O00), (r16v5 O1il0O00) binds: [B:100:0x014c, B:96:0x0145, B:55:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0153 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0140 A[PHI: r16 r18
                  0x0140: PHI (r16v1 O1il0O00) = (r16v0 O1il0O00), (r16v0 O1il0O00), (r16v2 O1il0O00) binds: [B:91:0x013d, B:86:0x0131, B:79:0x011e] A[DONT_GENERATE, DONT_INLINE]
                  0x0140: PHI (r18v2 double) = (r18v1 double), (r18v1 double), (r18v3 double) binds: [B:91:0x013d, B:86:0x0131, B:79:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public O1il0O00 I001IIilI0O(IoiOl011o ioiOl011o, O1il00oooo o1il00oooo, Ol0i11lo1l1I ol0i11lo1l1I, OiO0llO0IO oiO0llO0IO) {
                    O1il0O00 o1il0O00I000OOo1O;
                    double d;
                    O1il0O00 o1il0O00;
                    boolean zEquals;
                    O1il0O00 o1il0O002;
/* 11 */            if (ioiOl011o.I000o00OoI0I.I00iOIl) {
/* 29 */                OOlliOiioo oOlliOiioo = (OOlliOiioo) ((OOllOII) this.I00iOIl).I00000oOI.getValue();
/* 31 */                if (oOlliOiioo == null) {
/* 117 */                   o1il0O00I000OOo1O = null;
/* 118 */                   if (o1il0O00I000OOo1O != null) {
/* 120 */                       Bitmap bitmap = o1il0O00I000OOo1O.I00000oIO;
/* 122 */                       Bitmap.Config config = bitmap.getConfig();
/* 126 */                       if (config == null) {
/* 128 */                           config = Bitmap.Config.ARGB_8888;
                                }
/* 132 */                       if (config != Bitmap.Config.HARDWARE || ioiOl011o.I000iOII) {
/* 147 */                           Object obj = o1il0O00I000OOo1O.I00000oOI.get("coil#is_sampled");
/* 158 */                           Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
/* 166 */                           boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 174 */                           if (O0000Ioio00.I0000O(ol0i11lo1l1I, Ol0i11lo1l1I.I0000Il00O)) {
/* 176 */                               o1il0O00 = null;
/* 337 */                               zEquals = !zBooleanValue;
                                    } else {
/* 190 */                               String str = (String) o1il00oooo.I00iiI.get("coil#transformation_size");
/* 192 */                               if (str != null) {
/* 198 */                                   zEquals = str.equals(ol0i11lo1l1I.toString());
                                        } else {
/* 203 */                                   int width = bitmap.getWidth();
/* 207 */                                   int height = bitmap.getHeight();
/* 211 */                                   il1OioiO il1oioio = ol0i11lo1l1I.I00000oIO;
/* 225 */                                   int i = il1oioio instanceof Iii10I11ll0 ? ((Iii10I11ll0) il1oioio).I00000oIO : Integer.MAX_VALUE;
/* 226 */                                   il1OioiO il1oioio2 = ol0i11lo1l1I.I00000oOI;
/* 239 */                                   int i2 = il1oioio2 instanceof Iii10I11ll0 ? ((Iii10I11ll0) il1oioio2).I00000oIO : Integer.MAX_VALUE;
/* 241 */                                   double dI00000oIO = il0iIill1I.I00000oIO(width, height, i, i2, oiO0llO0IO);
/* 245 */                                   boolean zI00000oIO = I0001Ioi1lo.I00000oIO(ioiOl011o);
/* 251 */                                   if (zI00000oIO) {
/* 261 */                                       double d2 = dI00000oIO > 1.0d ? 1.0d : dI00000oIO;
/* 258 */                                       o1il0O00 = null;
/* 264 */                                       d = 1.0d;
/* 275 */                                       if (Math.abs(i - (width * d2)) > 1.0d && Math.abs(i2 - (d2 * height)) > 1.0d) {
/* 323 */                                           if ((dI00000oIO != d && !zI00000oIO) || (dI00000oIO > d && zBooleanValue)) {
                                                    }
                                                }
                                            } else {
/* 290 */                                       d = 1.0d;
/* 292 */                                       o1il0O00 = null;
/* 296 */                                       if ((i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && Math.abs(i - width) > 1) || (i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && Math.abs(i2 - height) > 1)) {
                                                }
                                            }
                                        }
                                    }
                                    return !zEquals ? o1il0O00I000OOo1O : o1il0O00;
                                }
/* 138 */                       zEquals = false;
/* 139 */                       o1il0O00 = null;
                                if (!zEquals) {
                                }
                            }
                        } else {
/* 35 */                    o1il0O00I000OOo1O = oOlliOiioo.I00000oIO.I000OOo1O(o1il00oooo);
/* 39 */                    if (o1il0O00I000OOo1O == null) {
/* 41 */                        O1I1OO o1i1oo = oOlliOiioo.I00000oOI;
                                synchronized (o1i1oo) {
                                    try {
/* 52 */                                ArrayList arrayList = (ArrayList) ((LinkedHashMap) o1i1oo.I00iiO).get(o1il00oooo);
/* 54 */                                if (arrayList == null) {
/* 117 */                                   o1il0O00I000OOo1O = null;
                                        } else {
/* 58 */                                    int size = arrayList.size();
/* 62 */                                    int i3 = 0;
                                            while (true) {
/* 63 */                                        if (i3 >= size) {
/* 98 */                                            o1il0O002 = null;
                                                    break;
                                                }
/* 69 */                                        OOllo0OO0O oOllo0OO0O = (OOllo0OO0O) arrayList.get(i3);
/* 77 */                                        Bitmap bitmap2 = (Bitmap) oOllo0OO0O.I00000oOI.get();
/* 91 */                                        o1il0O002 = bitmap2 != null ? new O1il0O00(bitmap2, oOllo0OO0O.I0000Il00O) : null;
/* 92 */                                        if (o1il0O002 != null) {
                                                    break;
                                                }
/* 95 */                                        i3++;
                                            }
/* 99 */                                    int i4 = o1i1oo.I00iiI;
/* 103 */                                   o1i1oo.I00iiI = i4 + 1;
/* 107 */                                   if (i4 >= 10) {
/* 109 */                                       o1i1oo.I00000oOI();
                                            }
/* 113 */                                   o1il0O00I000OOo1O = o1il0O002;
                                        }
                                    } catch (Throwable th) {
/* 116 */                               throw th;
                                    }
                                }
                            }
/* 118 */                   if (o1il0O00I000OOo1O != null) {
                            }
                        }
                    }
/* 13 */            return null;
                }

                public Integer I001i1O0Ol(String str) {
/* 1 */             String strI00II0Ol1O0l = I00II0Ol1O0l(str);
/* 9 */             if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 56 */                return null;
                    }
                    try {
/* 15 */                return Integer.valueOf(Integer.parseInt(strI00II0Ol1O0l));
                    } catch (NumberFormatException unused) {
/* 53 */                Log.w("NotificationParams", "Couldn't parse value of " + I00IoO0(str) + "(" + strI00II0Ol1O0l + ") into an int");
/* 56 */                return null;
                    }
                }

                public JSONArray I001i1lo1io(String str) {
/* 1 */             String strI00II0Ol1O0l = I00II0Ol1O0l(str);
/* 9 */             if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 53 */                return null;
                    }
                    try {
/* 13 */                return new JSONArray(strI00II0Ol1O0l);
                    } catch (JSONException unused) {
/* 50 */                Log.w("NotificationParams", "Malformed JSON for key " + I00IoO0(str) + ": " + strI00II0Ol1O0l + ", falling back to default");
/* 53 */                return null;
                    }
                }

                public int[] I001iOo1i0O() throws JSONException {
/* 9 */             JSONArray jSONArrayI001i1lo1io = I001i1lo1io("gcm.n.light_settings");
/* 14 */            if (jSONArrayI001i1lo1io == null) {
/* 13 */                return null;
                    }
/* 18 */            int[] iArr = new int[3];
                    try {
/* 24 */                if (jSONArrayI001i1lo1io.length() != 3) {
/* 73 */                    throw new JSONException("lightSettings don't have all three fields");
                        }
/* 31 */                int color = Color.parseColor(jSONArrayI001i1lo1io.optString(0));
/* 37 */                if (color == -16777216) {
/* 65 */                    throw new IllegalArgumentException("Transparent color is invalid");
                        }
/* 39 */                iArr[0] = color;
/* 46 */                iArr[1] = jSONArrayI001i1lo1io.optInt(1);
/* 53 */                iArr[2] = jSONArrayI001i1lo1io.optInt(2);
/* 55 */                return iArr;
                    } catch (IllegalArgumentException e) {
/* 101 */               Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayI001i1lo1io + ". " + e.getMessage() + ". Skipping setting LightSettings");
/* 13 */                return null;
                    } catch (JSONException unused) {
/* 120 */               Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayI001i1lo1io + ". Skipping setting LightSettings");
/* 13 */                return null;
                    }
                }

                public Object[] I001l0I00(String str) {
/* 7 */             JSONArray jSONArrayI001i1lo1io = I001i1lo1io(str.concat("_loc_args"));
/* 11 */            if (jSONArrayI001i1lo1io == null) {
/* 13 */                return null;
                    }
/* 15 */            int length = jSONArrayI001i1lo1io.length();
/* 19 */            String[] strArr = new String[length];
/* 22 */            for (int i = 0; i < length; i++) {
/* 28 */                strArr[i] = jSONArrayI001i1lo1io.optString(i);
                    }
/* 77 */            return strArr;
                }

                public String I001lIiIIo1O(String str) {
/* 7 */             return I00II0Ol1O0l(str.concat("_loc_key"));
                }

                public Long I001lllioOl() {
/* 3 */             String strI00II0Ol1O0l = I00II0Ol1O0l("gcm.n.event_time");
/* 11 */            if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 58 */                return null;
                    }
                    try {
/* 17 */                return Long.valueOf(Long.parseLong(strI00II0Ol1O0l));
                    } catch (NumberFormatException unused) {
/* 55 */                Log.w("NotificationParams", "Couldn't parse value of " + I00IoO0("gcm.n.event_time") + "(" + strI00II0Ol1O0l + ") into a long");
/* 58 */                return null;
                    }
                }

                public String I001lloI(Resources resources, String str, String str2) {
/* 1 */             String strI00II0Ol1O0l = I00II0Ol1O0l(str2);
/* 9 */             if (!TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 11 */                return strI00II0Ol1O0l;
                    }
/* 12 */            String strI001lIiIIo1O = I001lIiIIo1O(str2);
/* 21 */            if (TextUtils.isEmpty(strI001lIiIIo1O)) {
/* 20 */                return null;
                    }
/* 26 */            int identifier = resources.getIdentifier(strI001lIiIIo1O, "string", str);
/* 34 */            if (identifier == 0) {
/* 66 */                Log.w("NotificationParams", I00IoO0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
/* 20 */                return null;
                    }
/* 70 */            Object[] objArrI001l0I00 = I001l0I00(str2);
/* 74 */            if (objArrI001l0I00 == null) {
/* 76 */                return resources.getString(identifier);
                    }
                    try {
/* 81 */                return resources.getString(identifier, objArrI001l0I00);
                    } catch (MissingFormatArgumentException e) {
/* 120 */               Log.w("NotificationParams", "Missing format argument for " + I00IoO0(str2) + ": " + Arrays.toString(objArrI001l0I00) + " Default value will be used.", e);
/* 20 */                return null;
                    }
                }

                public String I00II0Ol1O0l(String str) {
/* 3 */             Bundle bundle = (Bundle) this.I00iOIl;
/* 9 */             if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
/* 29 */                String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
/* 37 */                if (bundle.containsKey(strReplace)) {
/* 39 */                    str = strReplace;
                        }
                    }
/* 40 */            return bundle.getString(str);
                }

                public long[] I00II0oii1o() throws JSONException {
/* 3 */             JSONArray jSONArrayI001i1lo1io = I001i1lo1io("gcm.n.vibrate_timings");
/* 8 */             if (jSONArrayI001i1lo1io == null) {
/* 7 */                 return null;
                    }
                    try {
/* 16 */                if (jSONArrayI001i1lo1io.length() <= 1) {
/* 44 */                    throw new JSONException("vibrateTimings have invalid length");
                        }
/* 18 */                int length = jSONArrayI001i1lo1io.length();
/* 22 */                long[] jArr = new long[length];
/* 25 */                for (int i = 0; i < length; i++) {
/* 31 */                    jArr[i] = jSONArrayI001i1lo1io.optLong(i);
                        }
/* 36 */                return jArr;
                    } catch (NumberFormatException | JSONException unused) {
/* 66 */                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayI001i1lo1io + ". Skipping setting vibrateTimings.");
/* 7 */                 return null;
                    }
                }

                public O1il00oooo I00IO1oi11O(IoiOl011o ioiOl011o, Object obj, OIil0IlIIol oIil0IlIIol, Il10il1 il10il1) {
                    String string;
                    Map linkedHashMap;
/* 1 */             ioiOl011o.getClass();
/* 4 */             List list = ioiOl011o.I0001Ioi1lo;
/* 12 */            List list2 = ((OOllOII) this.I00iOIl).I000O01llI0.I0000Il00O;
/* 14 */            int size = list2.size();
/* 19 */            int i = 0;
                    while (true) {
/* 21 */                if (i < size) {
/* 27 */                    OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) list2.get(i);
/* 31 */                    IlIOo1ol0lo ilIOo1ol0lo = (IlIOo1ol0lo) oIoi0IIoi.I00iOIl;
/* 45 */                    if (((Class) oIoi0IIoi.I00iiI).isAssignableFrom(obj.getClass())) {
                                switch (ilIOo1ol0lo.I00000oIO) {
                                    case 0:
/* 110 */                               File file = (File) obj;
/* 136 */                               string = file.getPath() + ':' + file.lastModified();
                                        break;
                                    default:
/* 53 */                                Uri uri = (Uri) obj;
/* 65 */                                if (!O0000Ioio00.I0000O(uri.getScheme(), "android.resource")) {
/* 104 */                                   string = uri.toString();
                                            break;
                                        } else {
/* 69 */                                    StringBuilder sb = new StringBuilder();
/* 72 */                                    sb.append(uri);
/* 77 */                                    sb.append('-');
/* 86 */                                    Configuration configuration = oIil0IlIIol.I00000oIO.getResources().getConfiguration();
/* 90 */                                    Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 96 */                                    sb.append(configuration.uiMode & 48);
/* 99 */                                    string = sb.toString();
                                            break;
                                        }
                                }
/* 140 */                       if (string != null) {
                                }
                            }
/* 143 */                   i++;
                        } else {
/* 146 */                   string = null;
                        }
                    }
/* 147 */           if (string == null) {
/* 20 */                return null;
                    }
/* 152 */           Map map = ioiOl011o.I001i1lo1io.I00iOIl;
/* 154 */           boolean zIsEmpty = map.isEmpty();
/* 158 */           Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 160 */           if (zIsEmpty) {
/* 162 */               linkedHashMap = il011I1OiO0I;
                    } else {
/* 166 */               linkedHashMap = new LinkedHashMap();
/* 173 */               Iterator it = map.entrySet().iterator();
/* 181 */               if (it.hasNext()) {
/* 260 */                   ((Map.Entry) it.next()).getValue().getClass();
/* 263 */                   OIiilo1Ool0o.I00000oIO();
/* 20 */                    return null;
                        }
                    }
/* 187 */           if (list.isEmpty() && linkedHashMap.isEmpty()) {
/* 197 */               return new O1il00oooo(string, il011I1OiO0I);
                    }
/* 203 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
/* 213 */           if (!list.isEmpty()) {
/* 219 */               if (list.size() > 0) {
/* 237 */                   list.get(0).getClass();
/* 240 */                   OIiilo1Ool0o.I00000oIO();
/* 20 */                    return null;
                        }
/* 229 */               linkedHashMap2.put("coil#transformation_size", oIil0IlIIol.I0000O.toString());
                    }
/* 246 */           return new O1il00oooo(string, linkedHashMap2);
                }

                public Bundle I00IioO0OiOi() {
/* 5 */             Bundle bundle = (Bundle) this.I00iOIl;
/* 7 */             Bundle bundle2 = new Bundle(bundle);
/* 22 */            for (String str : bundle.keySet()) {
/* 36 */                if (!str.startsWith("google.c.a.") && !str.equals("from")) {
/* 47 */                    bundle2.remove(str);
                        }
                    }
/* 55 */            return bundle2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
                
                    if (r1 != (-1)) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
                
                    r0 = java.util.Arrays.copyOfRange(r2, r1, r10.limit());
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I1l1oO0OI1 I00IlilI0i0i(I1l0iIlI10 i1l0iIlI10, int i) {
                    byte[] bArr;
                    byte[] bArrCopyOfRange;
                    byte b;
/* 1 */             I1l1oO0OI1 i1l1oO0OI1 = i1l0iIlI10.I00000oIO;
/* 5 */             Oi00IilOloo0 oi00IilOloo0 = (Oi00IilOloo0) this.I00iOIl;
/* 9 */             IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) i1l1oO0OI1.I00000oIO;
/* 15 */            int i2 = 0;
/* 16 */            if (((IncorrectJpegMetadataQuirk) oi00IilOloo0.I00iOIl) != null) {
/* 48 */                ByteBuffer byteBufferI0000oI00 = ioiO1IO1I1i.I00111O()[0].I0000oI00();
/* 52 */                int iCapacity = byteBufferI0000oI00.capacity();
/* 56 */                bArr = new byte[iCapacity];
/* 58 */                byteBufferI0000oI00.rewind();
/* 61 */                byteBufferI0000oI00.get(bArr);
/* 64 */                int i3 = 2;
/* 69 */                for (int i4 = 2; i4 + 4 <= iCapacity && (b = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
/* 76 */                    if (b == -1 && bArr[i4 + 1] == -38) {
                                break;
                            }
                        }
                        while (true) {
/* 105 */                   int i5 = i3 + 1;
/* 107 */                   if (i5 > iCapacity) {
/* 109 */                       i2 = -1;
                                break;
                            }
/* 113 */                   if (bArr[i3] == -1 && bArr[i5] == -40) {
/* 121 */                       i2 = i3;
                                break;
                            }
/* 156 */                   i3 = i5;
/* 157 */                   i = i;
                        }
                    } else {
/* 24 */                ByteBuffer byteBufferI0000oI002 = ioiO1IO1I1i.I00111O()[0].I0000oI00();
/* 32 */                bArrCopyOfRange = new byte[byteBufferI0000oI002.capacity()];
/* 34 */                byteBufferI0000oI002.rewind();
/* 37 */                byteBufferI0000oI002.get(bArrCopyOfRange);
                    }
/* 40 */            bArr = bArrCopyOfRange;
/* 133 */           Il1I0ll il1I0ll = i1l1oO0OI1.I00000oOI;
/* 135 */           Objects.requireNonNull(il1I0ll);
/* 151 */           return new I1l1oO0OI1(bArr, il1I0ll, i, i1l1oO0OI1.I0000O, i1l1oO0OI1.I0000oI00, i1l1oO0OI1.I0001Ioi1lo, i1l1oO0OI1.I000II, i1l1oO0OI1.I000O01llI0);
                }

                public ArrayList I00IoIO0lI(int i) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            O0l101IIlOI0 o0l101IIlOI0 = (O0l101IIlOI0) this.I00iOIl;
/* 12 */            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 23 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 24 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 43 */                O0l0i1O o0l0i1O = o0l101IIlOI0.I00000oOI ? o0l101IIlOI0.I0000Il00O : (O0l0i1O) o0l101IIlOI0.I0000oI00.getValue();
/* 45 */                if (o0l0i1O != null) {
/* 49 */                    OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 53 */                    oOo0ll111.I00iOIl = 1;
/* 65 */                    List list = (List) o0l0i1O.I000iOII.invoke(Integer.valueOf(i));
/* 70 */                    int size = list.size();
/* 75 */                    for (int i2 = 0; i2 < size; i2++) {
/* 81 */                        OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) list.get(i2);
/* 83 */                        O0llioI1 o0llioI1 = o0l101IIlOI0.I000oI1ioi;
/* 89 */                        int iIntValue = ((Number) oIoi0IIoi.I00iOIl).intValue();
/* 97 */                        long j = ((IOo0oO11ll1O) oIoi0IIoi.I00iiI).I00000oIO;
/* 99 */                        IoloOio0I ioloOio0I = O0l101IIlOI0.I001i1O0Ol;
/* 105 */                       I0O1IO i0o1io = new I0O1IO(12);
/* 109 */                       i0o1io.I00iiI = null;
/* 111 */                       i0o1io.I00iiO = oOo0ll111;
/* 113 */                       i0o1io.I00iio = list;
/* 115 */                       i0o1io.I00ilI0I1 = o0l0i1O;
/* 117 */                       VarHandle.storeStoreFence();
/* 128 */                       arrayList.add(o0llioI1.I00000oIO(iIntValue, j, false, i0o1io));
                            }
                        }
/* 134 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 137 */               return arrayList;
                    } catch (Throwable th) {
/* 138 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 168 */               throw th;
                    }
                }

                public void I00IoiI(int i, IIOI1Ii1I iIOI1Ii1I) {
/* 3 */             IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) this.I00iOIl;
/* 6 */             iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 13 */            iOOOi1I1I1.I0010I0i(iIOI1Ii1I.size());
/* 16 */            IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 28 */            iOOOi1I1I1.I000lI(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size());
                }

                public void I00Iooi00oi(int i, Object obj, OiOIiIO0 oiOIiIO0) {
/* 3 */             IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) this.I00iOIl;
/* 8 */             iOOOi1I1I1.I00100o1O0lo(i, 3);
/* 13 */            oiOIiIO0.I0001Ioi1lo((I01Iio10lo) obj, iOOOi1I1I1.I00000oIO);
/* 17 */            iOOOi1I1I1.I00100o1O0lo(i, 4);
                }

                public void I00O0i0ii(int i, Object obj, OiOIiIO0 oiOIiIO0) {
/* 3 */             IOOOi1I1I1 iOOOi1I1I1 = (IOOOi1I1I1) this.I00iOIl;
/* 5 */             I01Iio10lo i01Iio10lo = (I01Iio10lo) obj;
/* 8 */             iOOOi1I1I1.I00100o1O0lo(i, 2);
/* 15 */            iOOOi1I1I1.I0010I0i(i01Iio10lo.I00000oOI(oiOIiIO0));
/* 20 */            oiOIiIO0.I0001Ioi1lo(i01Iio10lo, iOOOi1I1I1.I00000oIO);
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 1 */             OloIlI0ll oloIlI0ll = (OloIlI0ll) obj2;
/* 9 */             i0Ool1ooIlII i0ool1ooilii = (i0Ool1ooIlII) ((i0OiooiiolO) obj).I000l1();
/* 13 */            i0Oioli i0oioli = (i0Oioli) this.I00iOIl;
/* 15 */            Parcel parcelI0000oI00 = i0ool1ooilii.I0000oI00();
/* 19 */            i0OlOO.I00000oOI(parcelI0000oI00, i0oioli);
                    try {
/* 26 */                i0ool1ooilii.I000O01llI0.transact(1, parcelI0000oI00, null, 1);
/* 29 */                parcelI0000oI00.recycle();
/* 32 */                oloIlI0ll.I00000oOI(null);
                    } catch (Throwable th) {
/* 37 */                parcelI0000oI00.recycle();
/* 106 */               throw th;
                    }
                }

                @Override
                public ListenableFuture apply(Object obj) {
/* 9 */             return iIllIoiiIO.I0000O(((Illill0o) this.I00iOIl).apply(obj));
                }

                @Override
                public IlOO1o00IOi get(int i) {
/* 5 */             return ((IlOOoI0ooOO[]) this.I00iOIl)[i];
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 1 */             Exception excI0001Ioi1lo = oloIIoII1oo.I0001Ioi1lo();
/* 5 */             if (excI0001Ioi1lo != null) {
/* 39 */                ((IIoOoIol0Io0) this.I00iOIl).resumeWith(lIoii1l01l0i.I00000oIO(excI0001Ioi1lo));
/* 77 */                return;
                    }
/* 10 */            boolean z = ((o0IiOl) oloIIoII1oo).I0000O;
/* 14 */            IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iOIl;
/* 16 */            if (z) {
/* 19 */                iIoOoIol0Io0.I0000O(null);
                    } else {
/* 27 */                iIoOoIol0Io0.resumeWith(oloIIoII1oo.I000II());
                    }
                }

/* 20 */        public iiOlilo0IIIl() {
/* 22 */            this.I00iOIl = new LinkedHashMap();
                }

/* 22 */        public iiOlilo0IIIl(i00IOoliil0i i00iooliil0i) {
                    this.I00iOIl = i00iooliil0i;
                }
            }

            package p000;

            import android.content.Context;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Size;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentSkipListMap;
            import java.util.stream.Collector;
            import java.util.stream.Stream;
            import kotlin.jvm.functions.Function1;
            import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
            
/* 18 */    public final class i1O01oOIoI0I implements Il0lOIl1, OliI0OiOi1O, IOIoiiol, IOllol1io, IOoOOI1ii, OIIO0loiI, Ii0OIl1OO, IOoillilli, OoI0o0oiol0l, iiIi1oo0Io, ii01iI1oI1l, lIi1Illloi, lo11I0lO {
                public static i1O01oOIoI0I I00iiI;
                public static final II0O01li0 I00iiO = new II0O01li0(-1.0f, -1.0f);
                public static final II0O01li0 I00iio = new II0O01li0(0.0f, -1.0f);
                public static final II0O01li0 I00ilI0I1 = new II0O01li0(1.0f, -1.0f);
                public static final II0O01li0 I00ilO0 = new II0O01li0(-1.0f, 0.0f);
                public static final II0O01li0 I00io1l = new II0O01li0(0.0f, 0.0f);
                public static final II0O01li0 I00ioIO = new II0O01li0(1.0f, 0.0f);
                public static final II0O01li0 I00l0I0l0lO1 = new II0O01li0(-1.0f, 1.0f);
                public static final II0O01li0 I00l0OO0IO = new II0O01li0(0.0f, 1.0f);
                public static final II0O01li0 I00li1OI = new II0O01li0(1.0f, 1.0f);
                public static final II0O000iIl I00ll1 = new II0O000iIl(-1.0f);
                public static final II0O000iIl I00lli11 = new II0O000iIl(0.0f);
                public static final II0O000iIl I00lll10 = new II0O000iIl(1.0f);
                public static final II0IlloOiO0i I00o0iI0io1 = new II0IlloOiO0i(-1.0f);
                public static final II0IlloOiO0i I00o0l1o1o0 = new II0IlloOiO0i(0.0f);
                public static final II0IlloOiO0i I00o101lO = new II0IlloOiO0i(1.0f);
                public static final i1O01oOIoI0I I00oI0i = new i1O01oOIoI0I(2);
                public static final i1O01oOIoI0I I00oII = new i1O01oOIoI0I(3);
                public static final i1O01oOIoI0I I00oIiI10 = new i1O01oOIoI0I(4);
                public static final i1O01oOIoI0I I00oO101o = new i1O01oOIoI0I(5);
                public static final i1O01oOIoI0I I00oOio10iI1 = new i1O01oOIoI0I(6);
                public static final i1O01oOIoI0I I00ol1 = new i1O01oOIoI0I(7);
                public static final i1O01oOIoI0I I00olI = new i1O01oOIoI0I(8);
                public static final i1O01oOIoI0I I00oli = new i1O01oOIoI0I(20);
                public static final i1O01oOIoI0I I00oliIiO01i = new i1O01oOIoI0I(21);
                public static final i1O01oOIoI0I I00oo1iO0ll = new i1O01oOIoI0I(22);
                public static final i1O01oOIoI0I I00ooIo0 = new i1O01oOIoI0I(24);
                public static final i1O01oOIoI0I I00ooiO1I = new i1O01oOIoI0I(25);
                public static final i1O01oOIoI0I I00oooO = new i1O01oOIoI0I(27);
                public final int I00iOIl;

                public i1O01oOIoI0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static BoxChatDatabase I0000oI00(Context context) {
                    byte[] bArrI00000oOI;
/* 3 */             System.loadLibrary("sqlcipher");
/* 6 */             OlO0OIIl1 olO0OIIl1 = II0Oi0iIol0i.I00000oIO;
/* 21 */            if (context.getSharedPreferences("box_db_enc", 0).getBoolean("enabled", false)) {
/* 23 */                OlO0OIIl1 olO0OIIl12 = OO01IO.I00000oIO;
/* 25 */                bArrI00000oOI = OO01IO.I0000Il00O;
/* 27 */                if (bArrI00000oOI == null) {
/* 32 */                    I000II.I001IO000("Database locked: biometric authentication required");
/* 35 */                    return null;
                        }
                    } else {
/* 37 */                bArrI00000oOI = lO11O1Oio.I00000oOI(context);
                    }
/* 43 */            SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(bArrI00000oOI);
/* 54 */            Oi1o1i0 oi1o1i0I00000oIO = lIolIIiIOOIl.I00000oIO(context.getApplicationContext(), BoxChatDatabase.class, "box_chat.db");
/* 58 */            oi1o1i0I00000oIO.I000O01llI0 = supportOpenHelperFactory;
/* 82 */            oi1o1i0I00000oIO.I00000oIO(BoxChatDatabase.I000lI, BoxChatDatabase.I000o00OoI0I, BoxChatDatabase.I000oI1ioi, BoxChatDatabase.I00100l0);
/* 85 */            oi1o1i0I00000oIO.I00100l0 = false;
/* 87 */            oi1o1i0I00000oIO.I00100o1O0lo = true;
/* 89 */            oi1o1i0I00000oIO.I0010I0i = true;
/* 95 */            return (BoxChatDatabase) oi1o1i0I00000oIO.I00000oOI();
                }

                public static OiOOi1 I000II(I00lll10 i00lll10, O1I0OloI o1I0OloI, Function1 function1) {
/* 3 */             OiOOi1 oiOOi1 = new OiOOi1();
/* 6 */             oiOOi1.I00000oIO = i00lll10;
/* 8 */             oiOOi1.I00000oOI = function1;
/* 13 */            O0l1iloO o0l1iloO = new O0l1iloO(5);
/* 16 */            o0l1iloO.I00iiI = oiOOi1;
/* 18 */            VarHandle.storeStoreFence();
/* 26 */            oiOOi1.I0000Il00O = new O1I0II11i(o1I0OloI, o0l1iloO);
/* 28 */            VarHandle.storeStoreFence();
/* 98 */            return oiOOi1;
                }

                public static synchronized void I000l1() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new i1O01oOIoI0I(0);
                    }
                }

                @Override
                public void I00000oIO(Oli1ooI0oi oli1ooI0oi) {
/* 1 */             oli1ooI0oi.clear();
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
/* 35 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
/* 50 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
/* 51 */            int i = OiO101lO.I00000oIO;
/* 106 */           return jFloatToRawIntBits;
                }

                @Override
                public boolean I0000Il00O() {
/* 1 */             return true;
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) {
/* 5 */             i0Ilo11Ii i0ilo11ii = (i0Ilo11Ii) oloIIoII1oo.I000II();
/* 13 */            Stream stream = i0ilo11ii.I00000oOI.entrySet().stream();
/* 20 */            i0OIIoiOl1I i0oiioiol1i = new i0OIIoiOl1I(0);
/* 26 */            i0OIIoiOl1I i0oiioiol1i2 = new i0OIIoiOl1I(1);
/* 29 */            int i = i0OiO1il.I00000oIO;
/* 33 */            int i2 = 3;
/* 34 */            i0OO1lIo i0oo1lio = new i0OO1lIo(i2);
/* 39 */            i0Oi0O01oioi i0oi0o01oioi = new i0Oi0O01oioi();
/* 42 */            i0oi0o01oioi.I00000oIO = i0oiioiol1i;
/* 44 */            i0oi0o01oioi.I00000oOI = i0oiioiol1i2;
/* 46 */            VarHandle.storeStoreFence();
/* 70 */            i0IlI0lloio i0ili0lloio = (i0IlI0lloio) stream.collect(Collector.of(i0oo1lio, i0oi0o01oioi, new i0OO1oOlO0Ol(i2), new i0OIIoiOl1I(5), new Collector.Characteristics[0]));
/* 72 */            long j = i0ilo11ii.I00000oIO;
/* 76 */            i0OOllI111 i0oolli111 = new i0OOllI111();
/* 79 */            i0oolli111.I00000oIO = j;
/* 81 */            if (i0ili0lloio == null) {
/* 91 */                IOOlIIilOl0.I000II("Null packStates");
/* 94 */                return null;
                    }
/* 83 */            i0oolli111.I00000oOI = i0ili0lloio;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            return i0oolli111;
                }

                @Override
                public Boolean I0001Ioi1lo() {
/* 1 */             return Boolean.TRUE;
                }

                public OoOiiO01illo I000O01llI0(OoOIOoO1I ooOIOoO1I, List list) {
/* 1 */             List listI000II = ooOIOoO1I.I000II();
/* 9 */             OoOOiO ooOOiO = (OoOOiO) IOOi0Ool1i.I00IoIO0lI(listI000II);
/* 11 */            if (ooOOiO != null) {
/* 17 */                int i = 1;
/* 18 */                if (ooOOiO.I00Oio()) {
/* 20 */                    List listI000II2 = ooOIOoO1I.I000II();
/* 34 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II2, 10));
/* 37 */                    Iterator it = listI000II2.iterator();
/* 45 */                    while (it.hasNext()) {
/* 57 */                        arrayList.add(((OoOOiO) it.next()).I000OOo1O());
                            }
/* 67 */                    Map mapI000OiO = O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList, list));
/* 73 */                    OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(i);
/* 76 */                    olIo1o0I0iIo.I0000O = mapI000OiO;
/* 78 */                    VarHandle.storeStoreFence();
/* 81 */                    return olIo1o0I0iIo;
                        }
                    }
/* 105 */           return new Iol0l0Oo0i((OoOOiO[]) listI000II.toArray(new OoOOiO[0]), (OoOi1Ol[]) list.toArray(new OoOi1Ol[0]), false);
                }

                @Override
                public boolean I000OOo1O(Object obj, Object obj2) {
/* 1 */             return false;
                }

                public BoxChatDatabase I000OiO(Context context) {
                    BoxChatDatabase boxChatDatabaseI0000oI00;
/* 1 */             BoxChatDatabase boxChatDatabase = BoxChatDatabase.I00100o1O0lo;
/* 3 */             if (boxChatDatabase != null) {
/* 29 */                return boxChatDatabase;
                    }
                    synchronized (this) {
/* 6 */                 boxChatDatabaseI0000oI00 = BoxChatDatabase.I00100o1O0lo;
/* 8 */                 if (boxChatDatabaseI0000oI00 == null) {
/* 10 */                    boxChatDatabaseI0000oI00 = I0000oI00(context);
/* 14 */                    BoxChatDatabase.I00100o1O0lo = boxChatDatabaseI0000oI00;
                        }
                    }
/* 20 */            return boxChatDatabaseI0000oI00;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 14 */            ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000iOII, new IiIIl0OOio0O((IlliOIilI) oll0io, (IOoil1iiIilo) null, 3));
                }

                @Override
                public Object apply(Object obj) throws Ioi1lIO {
                    Il1I0ll il1I0ll;
                    switch (this.I00iOIl) {
                        case 14:
/* 12 */                    I1lIII10oIl i1lIII10oIl = (I1lIII10oIl) obj;
/* 14 */                    IoiO1IO1I1i ioiO1IO1I1i = i1lIII10oIl.I00000oOI;
/* 16 */                    OOIo1Iiiil oOIo1Iiiil = i1lIII10oIl.I00000oIO;
/* 27 */                    if (ioOiOIli1i.I00000oOI(ioiO1IO1I1i.getFormat())) {
                                try {
/* 29 */                            I0OiiiO i0OiiiO = Il1I0ll.I00000oOI;
/* 37 */                            ByteBuffer byteBufferI0000oI00 = ioiO1IO1I1i.I00111O()[0].I0000oI00();
/* 41 */                            byteBufferI0000oI00.rewind();
/* 48 */                            byte[] bArr = new byte[byteBufferI0000oI00.capacity()];
/* 50 */                            byteBufferI0000oI00.get(bArr);
/* 62 */                            Il1Ilio1Ol1 il1Ilio1Ol1 = new Il1Ilio1Ol1(new ByteArrayInputStream(bArr));
/* 65 */                            il1I0ll = new Il1I0ll();
/* 68 */                            il1I0ll.I00000oIO = il1Ilio1Ol1;
/* 70 */                            VarHandle.storeStoreFence();
/* 83 */                            ioiO1IO1I1i.I00111O()[0].I0000oI00().rewind();
                                } catch (IOException e) {
/* 97 */                            throw new Ioi1lIO("Failed to extract EXIF data.", e, 1);
                                }
                            } else {
/* 98 */                        il1I0ll = null;
                            }
/* 109 */                   int i = 9;
/* 111 */                   if (((ImageCaptureRotationOptionQuirk) IiOol00iooil.I00000oIO.I00000oOI(ImageCaptureRotationOptionQuirk.class)) != null) {
/* 113 */                       I1ioiI i1ioiI = IIoo00iOol0.I0001Ioi1lo;
                            } else if (ioOiOIli1i.I00000oOI(ioiO1IO1I1i.getFormat())) {
/* 129 */                       lII1OI11o1I.I0000O("JPEG image must have exif.", il1I0ll);
/* 142 */                       Size size = new Size(ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O());
/* 151 */                       int iI00000oIO = oOIo1Iiiil.I0000O - il1I0ll.I00000oIO();
/* 176 */                       Size size2 = OoI0lIiO.I0000Il00O(OoI0lIiO.I000OOo1O(iI00000oIO)) ? new Size(size.getHeight(), size.getWidth()) : size;
/* 208 */                       Matrix matrixI00000oIO = OoI0lIiO.I00000oIO(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iI00000oIO, false);
/* 216 */                       RectF rectF = new RectF(oOIo1Iiiil.I0000Il00O);
/* 219 */                       matrixI00000oIO.mapRect(rectF);
/* 222 */                       rectF.sort();
/* 226 */                       Size size3 = size2;
/* 229 */                       Rect rect = new Rect();
/* 232 */                       rectF.round(rect);
/* 235 */                       int iI00000oIO2 = il1I0ll.I00000oIO();
/* 243 */                       Matrix matrix = new Matrix(oOIo1Iiiil.I0001Ioi1lo);
/* 246 */                       matrix.postConcat(matrixI00000oIO);
/* 269 */                       IIlI0I1li loioiio1o1 = ioiO1IO1I1i.I00i0oil() instanceof IIlI0lO ? ((IIlI0lO) ioiO1IO1I1i.I00i0oil()).I00000oIO : new loIOiIO1O1(i);
/* 273 */                       ioiO1IO1I1i.getFormat();
/* 282 */                       return new I1l1oO0OI1(ioiO1IO1I1i, il1I0ll, ioiO1IO1I1i.getFormat(), size3, rect, iI00000oIO2, matrix, loioiio1o1);
                            }
/* 286 */                   Rect rect2 = oOIo1Iiiil.I0000Il00O;
/* 288 */                   int i2 = oOIo1Iiiil.I0000O;
/* 290 */                   Matrix matrix2 = oOIo1Iiiil.I0001Ioi1lo;
/* 312 */                   IIlI0I1li loioiio1o12 = ioiO1IO1I1i.I00i0oil() instanceof IIlI0lO ? ((IIlI0lO) ioiO1IO1I1i.I00i0oil()).I00000oIO : new loIOiIO1O1(i);
/* 326 */                   Size size4 = new Size(ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O());
/* 337 */                   if (ioOiOIli1i.I00000oOI(ioiO1IO1I1i.getFormat())) {
/* 341 */                       lII1OI11o1I.I0000O("JPEG image must have Exif.", il1I0ll);
                            }
/* 350 */                   return new I1l1oO0OI1(ioiO1IO1I1i, il1I0ll, ioiO1IO1I1i.getFormat(), size4, rect2, i2, matrix2, loioiio1o12);
                        case PoseLandmark.LEFT_INDEX:
/* 9 */                     return (byte[]) obj;
                        default:
/* 6 */                     return (byte[]) obj;
                    }
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
                    switch (this.I00iOIl) {
                        case 7:
/* 1565 */                  il0IIIOll.registerEncoder(iOO010illOlI.class, iIo01oOIOIlo.I00000oIO);
/* 1572 */                  il0IIIOll.registerEncoder(iOl1111iO.class, iO1OIo.I00000oIO);
/* 1579 */                  il0IIIOll.registerEncoder(iOO0I0.class, iIo0OlIl.I00000oIO);
/* 1586 */                  il0IIIOll.registerEncoder(iOO0oOI1Ol.class, iIo0oIOi00i.I00000oIO);
/* 1593 */                  il0IIIOll.registerEncoder(iOO0O10.class, iIo0o10olI.I00000oIO);
/* 1600 */                  il0IIIOll.registerEncoder(iOO0iii0O0i1.class, iIo10O1IlI.I00000oIO);
/* 1607 */                  il0IIIOll.registerEncoder(iOI1I00I10.class, iIl0iOll.I00000oIO);
/* 1614 */                  il0IIIOll.registerEncoder(iOI10i0I11.class, iIl0OIoII.I00000oIO);
/* 1621 */                  il0IIIOll.registerEncoder(iOIiooI10I.class, iIliiIIIo.I00000oIO);
/* 1628 */                  il0IIIOll.registerEncoder(iOiolloo.class, iO11iiol.I00000oIO);
/* 1635 */                  il0IIIOll.registerEncoder(iOI0ooii0oIo.class, iIl0II.I00000oIO);
/* 1642 */                  il0IIIOll.registerEncoder(iOI0o10O0o1I.class, iIl01o0i11oI.I00000oIO);
/* 1649 */                  il0IIIOll.registerEncoder(iOOooloI.class, iO01Iil0.I00000oIO);
/* 1656 */                  il0IIIOll.registerEncoder(iOlO1Ol0li.class, iIlOl00l1.I00000oIO);
/* 1663 */                  il0IIIOll.registerEncoder(iOIii1ooOi0I.class, iIlOoOI0110O.I00000oIO);
/* 1670 */                  il0IIIOll.registerEncoder(iOIiI1OOol.class, iIlOiilii.I00000oIO);
/* 1677 */                  il0IIIOll.registerEncoder(iOi000il10l.class, iO01OIIiIiOO.I00000oIO);
/* 1684 */                  il0IIIOll.registerEncoder(iOilloOO.class, iO10lIIiil.I00000oIO);
/* 1691 */                  il0IIIOll.registerEncoder(iOiloi0oOI1.class, iO11Iii.I00000oIO);
/* 1698 */                  il0IIIOll.registerEncoder(iOillilIolO.class, iO10Ol010OlI.I00000oIO);
/* 1705 */                  il0IIIOll.registerEncoder(iOO1OO01O.class, iIoI1lO0.I00000oIO);
/* 1712 */                  il0IIIOll.registerEncoder(iOlO01oOOll.class, iIiioOo11i.I00000oIO);
/* 1719 */                  il0IIIOll.registerEncoder(iOO1il1Ii1oo.class, iIoIi1l.I00000oIO);
/* 1726 */                  il0IIIOll.registerEncoder(iOi11O10Io.class, iO0O0I0OO.I00000oIO);
/* 1733 */                  il0IIIOll.registerEncoder(iOi1iIoO.class, iO0O1il1o1lo.I00000oIO);
/* 1740 */                  il0IIIOll.registerEncoder(iOi1OOi.class, iO0O1IO.I00000oIO);
/* 1747 */                  il0IIIOll.registerEncoder(iOi1IOoIO0l.class, iO0O0ili1O1o.I00000oIO);
/* 1754 */                  il0IIIOll.registerEncoder(iOiOlIoI.class, iO0l0Il.I00000oIO);
/* 1761 */                  il0IIIOll.registerEncoder(iOiOoIiiI.class, iO0l1i.I00000oIO);
/* 1768 */                  il0IIIOll.registerEncoder(iOiiIOilI1.class, iO0llloil1.I00000oIO);
/* 1775 */                  il0IIIOll.registerEncoder(iOii0lOiO1.class, iO0lIoI0.I00000oIO);
/* 1782 */                  il0IIIOll.registerEncoder(iOO1IIO0.class, iIo1llOi0OIo.I00000oIO);
/* 1789 */                  il0IIIOll.registerEncoder(iOiiIoO.class, iO0lool1i.I00000oIO);
/* 1796 */                  il0IIIOll.registerEncoder(iOiiO0.class, iO0o0ii.I00000oIO);
/* 1803 */                  il0IIIOll.registerEncoder(iOiiOO0iI1IO.class, iO0o1ooo.I00000oIO);
/* 1810 */                  il0IIIOll.registerEncoder(iOiiOiOliIO.class, iO0oIOi.I00000oIO);
/* 1817 */                  il0IIIOll.registerEncoder(iOil1io0i00.class, iO0oiio.I00000oIO);
/* 1824 */                  il0IIIOll.registerEncoder(iOil0li.class, iO0oloi1I.I00000oIO);
/* 1831 */                  il0IIIOll.registerEncoder(iOiOl1i1oO.class, iO0iillI.I00000oIO);
/* 1838 */                  il0IIIOll.registerEncoder(iOIlI11IO.class, iIll1li.I00000oIO);
/* 1845 */                  il0IIIOll.registerEncoder(iOiOOIlI1o01.class, iO0l0001O.I00000oIO);
/* 1852 */                  il0IIIOll.registerEncoder(iOiOO1O1.class, iO0illiO0.I00000oIO);
/* 1859 */                  il0IIIOll.registerEncoder(iOiOl1OIi11l.class, iO0l0I0.I00000oIO);
/* 1866 */                  il0IIIOll.registerEncoder(iOiolO.class, iO11OOlo.I00000oIO);
/* 1873 */                  il0IIIOll.registerEncoder(iOl1OoiOoil.class, iO1i0OiiOOo1.I00000oIO);
/* 1880 */                  il0IIIOll.registerEncoder(iO1o1Io1.class, iIilili10.I00000oIO);
/* 1887 */                  il0IIIOll.registerEncoder(iO1lo1I1iI.class, iIil1i101ioi.I00000oIO);
/* 1894 */                  il0IIIOll.registerEncoder(iO1lOIlIOoo.class, iIil0i1o.I00000oIO);
/* 1901 */                  il0IIIOll.registerEncoder(iO1o01.class, iIilIIlO1i01.I00000oIO);
/* 1908 */                  il0IIIOll.registerEncoder(iO1oO1I0i.class, iIiloIO0.I00000oIO);
/* 1915 */                  il0IIIOll.registerEncoder(iO1oIOlI.class, iIill1I11l1I.I00000oIO);
/* 1922 */                  il0IIIOll.registerEncoder(iO1oOOoIOi1.class, iIiloioII.I00000oIO);
/* 1929 */                  il0IIIOll.registerEncoder(iO1oiilli.class, iIioI001oiIO.I00000oIO);
/* 1936 */                  il0IIIOll.registerEncoder(iO1oioO0olo.class, iIioIIl1iI.I00000oIO);
/* 1943 */                  il0IIIOll.registerEncoder(iO1olo1Ii.class, iIioOI1i.I00000oIO);
/* 1950 */                  il0IIIOll.registerEncoder(iOI011o.class, iIiolo0I.I00000oIO);
/* 1957 */                  il0IIIOll.registerEncoder(iIO1ioiI.class, iIiOl0.I00000oIO);
/* 1964 */                  il0IIIOll.registerEncoder(iIOIO0IO0l.class, iIiOoIlo.I00000oIO);
/* 1971 */                  il0IIIOll.registerEncoder(iIOI0101l.class, iIiOloiOll0.I00000oIO);
/* 1978 */                  il0IIIOll.registerEncoder(iOIl0OIOIi1.class, iIlioll0IlIl.I00000oIO);
/* 1985 */                  il0IIIOll.registerEncoder(iOI1OIOi1.class, iIl0lOlO.I00000oIO);
/* 1992 */                  il0IIIOll.registerEncoder(iI1llIlIi.class, iIOIlOioIi1.I00000oIO);
/* 1999 */                  il0IIIOll.registerEncoder(iI1llI0iI1.class, iIOIll1l.I00000oIO);
/* 2006 */                  il0IIIOll.registerEncoder(iOIi01l.class, iIlO1IOlIo1I.I00000oIO);
/* 2013 */                  il0IIIOll.registerEncoder(iI1oIIlOlo00.class, iIOO1Oi1l00.I00000oIO);
/* 2020 */                  il0IIIOll.registerEncoder(iI1llooOlIo.class, iIOOii00.I00000oIO);
/* 2027 */                  il0IIIOll.registerEncoder(iIIO1o00ioIO.class, iIOli0IO.I00000oIO);
/* 2034 */                  il0IIIOll.registerEncoder(iIIIo00lo0.class, iIi0I0.I00000oIO);
/* 2041 */                  il0IIIOll.registerEncoder(iII0ol.class, iIOOolIOIOio.I00000oIO);
/* 2048 */                  il0IIIOll.registerEncoder(iI1oIlO1llo.class, iIOi10O1.I00000oIO);
/* 2055 */                  il0IIIOll.registerEncoder(iIIi0Ilo.class, iIi1i00.I00000oIO);
/* 2062 */                  il0IIIOll.registerEncoder(iIIi00i0.class, iIi1ioI1oOl0.I00000oIO);
/* 2069 */                  il0IIIOll.registerEncoder(iIIl1o1Iiol.class, iIi1oI1O1I.I00000oIO);
/* 2076 */                  il0IIIOll.registerEncoder(iIIl1I0OIlO0.class, iIiI0o0IlI0.I00000oIO);
/* 2083 */                  il0IIIOll.registerEncoder(iIO0ool0O0.class, iIiOiIiiO.I00000oIO);
/* 2090 */                  il0IIIOll.registerEncoder(iIO0olo1li1O.class, iIiOiiOOoO.I00000oIO);
/* 2097 */                  il0IIIOll.registerEncoder(iIIllI.class, iIiI1io0.I00000oIO);
/* 2104 */                  il0IIIOll.registerEncoder(iIIlIiI001Il.class, iIiI1o1IOIOl.I00000oIO);
/* 2111 */                  il0IIIOll.registerEncoder(iIIloIilo.class, iIiIiI.I00000oIO);
/* 2118 */                  il0IIIOll.registerEncoder(iIIlllIIO.class, iIiIiollIi.I00000oIO);
/* 2125 */                  il0IIIOll.registerEncoder(iOlIo0iI.class, iO11o0i.I00000oIO);
/* 2132 */                  il0IIIOll.registerEncoder(iOl1iOi0I.class, iIl0o1l.I00000oIO);
/* 2139 */                  il0IIIOll.registerEncoder(iOlIOO1I.class, iIo1lill.I00000oIO);
/* 2146 */                  il0IIIOll.registerEncoder(iOlI1lIi0.class, iIo1iOoioIo.I00000oIO);
/* 2153 */                  il0IIIOll.registerEncoder(iOlI1iI1Ol.class, iIlOlIiI1.I00000oIO);
/* 2160 */                  il0IIIOll.registerEncoder(iOlIiI1l1ol.class, iO11loO100.I00000oIO);
/* 2167 */                  il0IIIOll.registerEncoder(iOlIi1i.class, iO11li.I00000oIO);
/* 2174 */                  il0IIIOll.registerEncoder(iOlIoI.class, iO1I010.I00000oIO);
/* 2181 */                  il0IIIOll.registerEncoder(OoIoii.class, iIliiO0OIO.I00000oIO);
/* 2188 */                  il0IIIOll.registerEncoder(iOlIollO.class, iO1iiiilooO.I00000oIO);
/* 2195 */                  il0IIIOll.registerEncoder(iOlIoli00010.class, iO1l00.I00000oIO);
/* 2202 */                  il0IIIOll.registerEncoder(iOlIoIO0oo1.class, iO1i10Ii.I00000oIO);
/* 2209 */                  il0IIIOll.registerEncoder(iOl001i1iO1i.class, iO1I10lI0.I00000oIO);
/* 2216 */                  il0IIIOll.registerEncoder(iOIl0I.class, iIlilIlI0Ooi.I00000oIO);
/* 2223 */                  il0IIIOll.registerEncoder(iOIlOlI0Ii.class, iIllIO01i.I00000oIO);
/* 2230 */                  il0IIIOll.registerEncoder(iO1lI0Oi.class, iIiioli0I.I00000oIO);
/* 2237 */                  il0IIIOll.registerEncoder(iOIil10l.class, iIli0oi.I00000oIO);
/* 2244 */                  il0IIIOll.registerEncoder(iOIl0o.class, iIll01oI10l0.I00000oIO);
/* 2251 */                  il0IIIOll.registerEncoder(iOIi0iO1OI1I.class, iIlOIoio0O0I.I00000oIO);
/* 2258 */                  il0IIIOll.registerEncoder(iOI1Oo01OOol.class, iIl111O.I00000oIO);
/* 2265 */                  il0IIIOll.registerEncoder(iOIO10i011o.class, iIl11ooIOi.I00000oIO);
/* 2272 */                  il0IIIOll.registerEncoder(iOI1OOiI00li.class, iIl101o00oOo.I00000oIO);
/* 2279 */                  il0IIIOll.registerEncoder(iOIOOiOiO0O.class, iIlIIio.I00000oIO);
/* 2286 */                  il0IIIOll.registerEncoder(iOO110oi1.class, iIo1Ilo1l.I00000oIO);
/* 2293 */                  il0IIIOll.registerEncoder(iOO0ooi1oO.class, iIo1IOllI.I00000oIO);
/* 2300 */                  il0IIIOll.registerEncoder(iI1li01iIO01.class, iIOIioiO11.I00000oIO);
/* 2307 */                  il0IIIOll.registerEncoder(iOl11OooolI0.class, iO1Oio1O1i.I00000oIO);
/* 2314 */                  il0IIIOll.registerEncoder(iOl1Oi.class, iO1OoIO0l.I00000oIO);
/* 2321 */                  il0IIIOll.registerEncoder(iOl1OO.class, iO1OlO0i.I00000oIO);
/* 2328 */                  il0IIIOll.registerEncoder(iO1l1II0O0.class, iIiillI.I00000oIO);
/* 2335 */                  il0IIIOll.registerEncoder(iOI0lO1ilo.class, iIl011o1IOOO.I00000oIO);
/* 2342 */                  il0IIIOll.registerEncoder(iOI0i11I0.class, iIl0000Ooi0.I00000oIO);
/* 2349 */                  il0IIIOll.registerEncoder(iOI0IO0iio0o.class, iIiooii0.I00000oIO);
/* 2356 */                  il0IIIOll.registerEncoder(iOOoOiiO.class, iO010I00.I00000oIO);
/* 2363 */                  il0IIIOll.registerEncoder(iOOol1l.class, iO01I0o.I00000oIO);
/* 2370 */                  il0IIIOll.registerEncoder(iOOoil.class, iO010li0OII.I00000oIO);
/* 2377 */                  il0IIIOll.registerEncoder(iIIIiI0lio.class, iIOl1llO1oo0.I00000oIO);
/* 2384 */                  il0IIIOll.registerEncoder(iIIIOo0iO.class, iIOlI1l1oOOi.I00000oIO);
/* 2391 */                  il0IIIOll.registerEncoder(iOi00OI.class, iO01li1O1oo.I00000oIO);
/* 2398 */                  il0IIIOll.registerEncoder(iOi0oO1iilo.class, iO0I10i0.I00000oIO);
/* 2405 */                  il0IIIOll.registerEncoder(iOi0OiI.class, iO0I00ooi0i.I00000oIO);
/* 2412 */                  il0IIIOll.registerEncoder(iOi0iO0iIOI0.class, iO0I0I00OO0i.I00000oIO);
/* 2419 */                  il0IIIOll.registerEncoder(iIIOi0lo.class, iIi0OIiO0.I00000oIO);
/* 2426 */                  il0IIIOll.registerEncoder(iIIOIi0O.class, iIi0iOO1iIoo.I00000oIO);
/* 2433 */                  il0IIIOll.registerEncoder(iOl0l0o0o.class, iO1IoIIlII0.I00000oIO);
/* 2440 */                  il0IIIOll.registerEncoder(iOl0ii00.class, iO1IOoiilIIo.I00000oIO);
/* 2447 */                  il0IIIOll.registerEncoder(iOl111l1l.class, iO1OiIo0.I00000oIO);
/* 2454 */                  il0IIIOll.registerEncoder(iOl11Ioo0O.class, iO1OiOIo.I00000oIO);
/* 2461 */                  il0IIIOll.registerEncoder(iOi1iol.class, iO0OI0l.I00000oIO);
/* 2468 */                  il0IIIOll.registerEncoder(iOiOIl1I.class, iO0iiO1.I00000oIO);
/* 2475 */                  il0IIIOll.registerEncoder(iOi1lii1O.class, iO0iIo1l.I00000oIO);
/* 2482 */                  il0IIIOll.registerEncoder(iOiO0o0oi.class, iO0iOoiIi.I00000oIO);
/* 2489 */                  il0IIIOll.registerEncoder(iOIill.class, iIliO0O0o0l.I00000oIO);
/* 2496 */                  il0IIIOll.registerEncoder(iIIiO0.class, iIi1lO1.I00000oIO);
/* 2503 */                  il0IIIOll.registerEncoder(iIIi0l1o1.class, iIi1o1o01O.I00000oIO);
/* 2510 */                  il0IIIOll.registerEncoder(iOIiliI10oi.class, iIliI1o1.I00000oIO);
/* 2517 */                  il0IIIOll.registerEncoder(iOIiO1OII1.class, iIlOll.I00000oIO);
/* 2524 */                  il0IIIOll.registerEncoder(iOi0oll.class, iO0IIlOO.I00000oIO);
/* 2531 */                  il0IIIOll.registerEncoder(iOi110.class, iO0Iolii0O.I00000oIO);
/* 2538 */                  il0IIIOll.registerEncoder(iOi100.class, iO0IiOIo1IO.I00000oIO);
/* 2545 */                  il0IIIOll.registerEncoder(iIIOo0oli.class, iIi10llOo1.I00000oIO);
/* 2552 */                  il0IIIOll.registerEncoder(iIIOioiO110.class, iIi1I10.I00000oIO);
/* 2559 */                  il0IIIOll.registerEncoder(iOOOol01O0.class, iIoiOIOOi1O.I00000oIO);
/* 2566 */                  il0IIIOll.registerEncoder(iOOiIIllIi.class, iIololoO10.I00000oIO);
/* 2573 */                  il0IIIOll.registerEncoder(iOOl1liI01io.class, iIoo0lIIOl.I00000oIO);
/* 2580 */                  il0IIIOll.registerEncoder(iII1l1Oloio.class, iIOii0Iooli.I00000oIO);
/* 2587 */                  il0IIIOll.registerEncoder(iII1IoIoi.class, iIOil10Iol.I00000oIO);
/* 2594 */                  il0IIIOll.registerEncoder(iOOOio1.class, iIoOoioII1i1.I00000oIO);
/* 2601 */                  il0IIIOll.registerEncoder(iOOOoIOlo.class, iIoi0ii1o.I00000oIO);
/* 2608 */                  il0IIIOll.registerEncoder(iOOOoOo0I.class, iIoi1illOi1l.I00000oIO);
/* 2615 */                  il0IIIOll.registerEncoder(iII1I0Io0oo.class, iIOi1ll1i.I00000oIO);
/* 2622 */                  il0IIIOll.registerEncoder(iII11Ii.class, iIOiO0.I00000oIO);
/* 2629 */                  il0IIIOll.registerEncoder(iOOlIloilOil.class, iIoo11oI.I00000oIO);
/* 2636 */                  il0IIIOll.registerEncoder(iOOloIo.class, iIooIl0.I00000oIO);
/* 2643 */                  il0IIIOll.registerEncoder(iOOo0lo.class, iIool00llloo.I00000oIO);
/* 2650 */                  il0IIIOll.registerEncoder(iOOo1000.class, iO000OOi.I00000oIO);
/* 2657 */                  il0IIIOll.registerEncoder(iIII0l01oI.class, iIOiolI0100.I00000oIO);
/* 2664 */                  il0IIIOll.registerEncoder(iII1oIoi.class, iIOl00l.I00000oIO);
/* 2671 */                  il0IIIOll.registerEncoder(iOl0OOll.class, iO1I1O.I00000oIO);
/* 2678 */                  il0IIIOll.registerEncoder(iOl011O00i.class, iO1IIOlllIO.I00000oIO);
/* 2685 */                  il0IIIOll.registerEncoder(iOIli10iO0I.class, iIllO10I1lo.I00000oIO);
/* 2692 */                  il0IIIOll.registerEncoder(iOIloO1l10o.class, iIlllOi1I.I00000oIO);
/* 2699 */                  il0IIIOll.registerEncoder(iOIliilOOIIo.class, iIllOoliOO11.I00000oIO);
/* 2706 */                  il0IIIOll.registerEncoder(iOIo0I10oO11.class, iIlloloO0I10.I00000oIO);
/* 2713 */                  il0IIIOll.registerEncoder(iOil1li.class, iO1000Oi0l0.I00000oIO);
/* 2720 */                  il0IIIOll.registerEncoder(iOilO1Ii.class, iO100oOO010.I00000oIO);
/* 2727 */                  il0IIIOll.registerEncoder(iIO0Oio.class, iIiO0IiI0OI.I00000oIO);
/* 2734 */                  il0IIIOll.registerEncoder(iIO01l11OlO.class, iIiO1Ol0O.I00000oIO);
/* 2741 */                  il0IIIOll.registerEncoder(iOl0ll0OI1II.class, iO1IoiO1OO.I00000oIO);
/* 2748 */                  il0IIIOll.registerEncoder(iOiiOoo.class, iO0oO0O.I00000oIO);
/* 2755 */                  il0IIIOll.registerEncoder(iOiiloIII0O.class, iO0oi1oIO.I00000oIO);
/* 2762 */                  il0IIIOll.registerEncoder(iIIoOiil.class, iIiIlIOIiOl.I00000oIO);
/* 2769 */                  il0IIIOll.registerEncoder(iIIo11.class, iIiIoi1.I00000oIO);
/* 2776 */                  il0IIIOll.registerEncoder(iOl0iOoIl.class, iO1IO1i10l.I00000oIO);
/* 2783 */                  il0IIIOll.registerEncoder(iOOOOliIOl0.class, iIoIoI1Ii.I00000oIO);
/* 2790 */                  il0IIIOll.registerEncoder(iOOOIOoiIlII.class, iIoOo01o0.I00000oIO);
/* 2797 */                  il0IIIOll.registerEncoder(iOOIlO0oo1i.class, iIoOOIO1O0.I00000oIO);
/* 2804 */                  il0IIIOll.registerEncoder(iOOIi1IOiI.class, iIoOIO0O1o0O.I00000oIO);
/* 2811 */                  il0IIIOll.registerEncoder(iOOIoOO1il1i.class, iIoOiI1lo1oO.I00000oIO);
/* 2818 */                  il0IIIOll.registerEncoder(iOOO0ooiIo.class, iIoOli1iIl.I00000oIO);
/* 2825 */                  il0IIIOll.registerEncoder(iOOIOl1i0OO.class, iIoOI0IoO.I00000oIO);
/* 2832 */                  il0IIIOll.registerEncoder(iOO1o0o1o.class, iIoIlOii1.I00000oIO);
/* 2839 */                  il0IIIOll.registerEncoder(iOOIIiiii00.class, iIoO11.I00000oIO);
/* 2846 */                  il0IIIOll.registerEncoder(iOOI0ol111Ol.class, iIoO0il1ii.I00000oIO);
/* 2853 */                  il0IIIOll.registerEncoder(iOOoI1iiIl.class, iO00i0o.I00000oIO);
/* 2860 */                  il0IIIOll.registerEncoder(iOIOlooOl.class, iIlIloIIOl0.I00000oIO);
/* 2867 */                  il0IIIOll.registerEncoder(iOOoI0OII.class, iO001l.I00000oIO);
/* 2874 */                  il0IIIOll.registerEncoder(iOOoIl0l0i.class, iO00oiIl0.I00000oIO);
/* 2881 */                  il0IIIOll.registerEncoder(iOIOlii1.class, iIlIilol.I00000oIO);
/* 2888 */                  il0IIIOll.registerEncoder(iOIOoI1.class, iIlIoI1.I00000oIO);
/* 2895 */                  il0IIIOll.registerEncoder(iOioo01l0.class, iO1I0O1oo.I00000oIO);
/* 2902 */                  il0IIIOll.registerEncoder(IIlOIi0oI1Io.class, iO10I0iO0O1I.I00000oIO);
/* 2909 */                  il0IIIOll.registerEncoder(iOl10Oi0oo0.class, iO1O1loOlIi.I00000oIO);
/* 2916 */                  il0IIIOll.registerEncoder(iOililO0i0.class, iO10OiIi.I00000oIO);
/* 2923 */                  il0IIIOll.registerEncoder(iOilOO1O1o.class, iO10IlOOil1.I00000oIO);
/* 2930 */                  il0IIIOll.registerEncoder(iOl0o00I.class, iO1Ioo1l0.I00000oIO);
/* 2937 */                  il0IIIOll.registerEncoder(iIO0o0oOo00.class, iIiOO0.I00000oIO);
/* 2944 */                  il0IIIOll.registerEncoder(iIO0iiOiOl0l.class, iIiOi0II01i1.I00000oIO);
/* 2951 */                  il0IIIOll.registerEncoder(iOl0oOOO1.class, iO1O0O1I1.I00000oIO);
/* 2958 */                  il0IIIOll.registerEncoder(iOIOlIoOloo1.class, iIlIiOl0I.I00000oIO);
                            break;
                        default:
/* 10 */                    il0IIIOll.registerEncoder(o01Io111.class, liO0II1l11lo.I00000oIO);
/* 17 */                    il0IIIOll.registerEncoder(o1I01i0iOo.class, loIlO10.I00000oIO);
/* 24 */                    il0IIIOll.registerEncoder(o01OIl.class, liO1Io.I00000oIO);
/* 31 */                    il0IIIOll.registerEncoder(o01l01.class, liOO1OO.I00000oIO);
/* 38 */                    il0IIIOll.registerEncoder(o01OlooO011o.class, liOI1ooloOi1.I00000oIO);
/* 45 */                    il0IIIOll.registerEncoder(o01iO1I1i00.class, liOi1i1o.I00000oIO);
/* 52 */                    il0IIIOll.registerEncoder(lolll1oioiI.class, lOl0Ili.I00000oIO);
/* 59 */                    il0IIIOll.registerEncoder(loll1IOlii.class, lOio1Iil.I00000oIO);
/* 66 */                    il0IIIOll.registerEncoder(o001loI.class, li1O1O.I00000oIO);
/* 73 */                    il0IIIOll.registerEncoder(o0ool1Iool.class, llo1ii.I00000oIO);
/* 80 */                    il0IIIOll.registerEncoder(loli01II0o.class, lOilO10O0lol.I00000oIO);
/* 87 */                    il0IIIOll.registerEncoder(lolOoI1liOo.class, lOiiiIiOO.I00000oIO);
/* 94 */                    il0IIIOll.registerEncoder(o0i0Iolo0lli.class, ll10i01.I00000oIO);
/* 101 */                   il0IIIOll.registerEncoder(i1OI0Io.class, li01il1oiO0o.I00000oIO);
/* 108 */                   il0IIIOll.registerEncoder(o0000oO0I.class, li0llI0o1olO.I00000oIO);
/* 115 */                   il0IIIOll.registerEncoder(loolOOol0oO.class, li00o1llI.I00000oIO);
/* 122 */                   il0IIIOll.registerEncoder(o0i0ooiilo.class, ll11oo1I0ooO.I00000oIO);
/* 129 */                   il0IIIOll.registerEncoder(o0olIl.class, llloOlOo0l0o.I00000oIO);
/* 136 */                   il0IIIOll.registerEncoder(o0ooI1O.class, llloliO1o.I00000oIO);
/* 143 */                   il0IIIOll.registerEncoder(o0ol00Oo1l0l.class, llllOl10.I00000oIO);
/* 150 */                   il0IIIOll.registerEncoder(o0I01O.class, liiOO01oI.I00000oIO);
/* 157 */                   il0IIIOll.registerEncoder(i1O1l1lIo.class, lOIIolI.I00000oIO);
/* 164 */                   il0IIIOll.registerEncoder(o0I0I1Ii1o.class, liilo1O0.I00000oIO);
/* 171 */                   il0IIIOll.registerEncoder(o0il01o.class, llI1Ooo1.I00000oIO);
/* 178 */                   il0IIIOll.registerEncoder(o0ioIllio.class, llIi10llOO00.I00000oIO);
/* 185 */                   il0IIIOll.registerEncoder(o0ilOiOOi1I.class, llIIoiOlII0O.I00000oIO);
/* 192 */                   il0IIIOll.registerEncoder(o0il0lO.class, llII010I0oI.I00000oIO);
/* 199 */                   il0IIIOll.registerEncoder(o0ll10i.class, llOi000.I00000oIO);
/* 206 */                   il0IIIOll.registerEncoder(o0lli0.class, llOl00.I00000oIO);
/* 213 */                   il0IIIOll.registerEncoder(o0loliOiIlOl.class, llOooIo1o.I00000oIO);
/* 220 */                   il0IIIOll.registerEncoder(o0lo0iiii.class, llOloIilliOi.I00000oIO);
/* 227 */                   il0IIIOll.registerEncoder(o01oOlloi.class, liiI1i0i.I00000oIO);
/* 234 */                   il0IIIOll.registerEncoder(o0o010oOO.class, lli1lO00ii1.I00000oIO);
/* 241 */                   il0IIIOll.registerEncoder(o0o0111.class, lliIlo1.I00000oIO);
/* 248 */                   il0IIIOll.registerEncoder(o0o0Iio1OIo.class, lliOOIol.I00000oIO);
/* 255 */                   il0IIIOll.registerEncoder(o0o0l0.class, lliiO1Oi0.I00000oIO);
/* 262 */                   il0IIIOll.registerEncoder(o0oO1OIO1O0.class, lliol0ll.I00000oIO);
/* 269 */                   il0IIIOll.registerEncoder(o0oIOO0l.class, lll0o0l.I00000oIO);
/* 276 */                   il0IIIOll.registerEncoder(o0liO1II0ioO.class, llO11IIOi.I00000oIO);
/* 283 */                   il0IIIOll.registerEncoder(o00lO0.class, liI0OiiO.I00000oIO);
/* 290 */                   il0IIIOll.registerEncoder(o0lO11IoOI.class, llOII11O0iol.I00000oIO);
/* 297 */                   il0IIIOll.registerEncoder(o0lIOi1.class, llO1l01OllI.I00000oIO);
/* 304 */                   il0IIIOll.registerEncoder(o0liO0Ooo.class, llOO0ili.I00000oIO);
/* 311 */                   il0IIIOll.registerEncoder(o0ooiOoI1i.class, llo0ioi0Ii1l.I00000oIO);
/* 318 */                   il0IIIOll.registerEncoder(i1IiiO0O1.class, loOioIII0o.I00000oIO);
/* 325 */                   il0IIIOll.registerEncoder(loiOiol.class, lOO0I1O1oi.I00000oIO);
/* 332 */                   il0IIIOll.registerEncoder(loiI0ol.class, lOIll1oi00I.I00000oIO);
/* 339 */                   il0IIIOll.registerEncoder(loi1OIli1Oio.class, lOIiollO1.I00000oIO);
/* 346 */                   il0IIIOll.registerEncoder(loiO1oOI.class, lOIo11l00l.I00000oIO);
/* 353 */                   il0IIIOll.registerEncoder(loiioo0o1ii.class, lOOIoiloil.I00000oIO);
/* 360 */                   il0IIIOll.registerEncoder(loiiO1ill.class, lOO10ii10l.I00000oIO);
/* 367 */                   il0IIIOll.registerEncoder(loilooIO0lo.class, lOOIoo0o0.I00000oIO);
/* 374 */                   il0IIIOll.registerEncoder(loioi1oiOoOI.class, lOOOll.I00000oIO);
/* 381 */                   il0IIIOll.registerEncoder(loioiloio.class, lOOiolIOOoo.I00000oIO);
/* 388 */                   il0IIIOll.registerEncoder(lol0I0o10.class, lOOloI0.I00000oIO);
/* 395 */                   il0IIIOll.registerEncoder(lol1Ii1iol.class, lOi0IO0.I00000oIO);
/* 402 */                   il0IIIOll.registerEncoder(lIIIO1Oo.class, lO1lloII1.I00000oIO);
/* 409 */                   il0IIIOll.registerEncoder(lIIiIil0.class, lOI0Oi1.I00000oIO);
/* 416 */                   il0IIIOll.registerEncoder(lIIOO11.class, lOI00o1.I00000oIO);
/* 423 */                   il0IIIOll.registerEncoder(o00OioOoi.class, li1li1OilO.I00000oIO);
/* 430 */                   il0IIIOll.registerEncoder(lolo01Oolii.class, lOl10OOOio.I00000oIO);
/* 437 */                   il0IIIOll.registerEncoder(l1Oo0iIiO1i.class, lIIllO11Oi0.I00000oIO);
/* 444 */                   il0IIIOll.registerEncoder(l1OilIOoo1.class, lIIoOiOOi.I00000oIO);
/* 451 */                   il0IIIOll.registerEncoder(looil0oo00I1.class, lOollOiIlOi0.I00000oIO);
/* 458 */                   il0IIIOll.registerEncoder(l1i01O1.class, lIO0oioll.I00000oIO);
/* 465 */                   il0IIIOll.registerEncoder(l1OoO11il1Ii.class, lIOII1i1lol.I00000oIO);
/* 472 */                   il0IIIOll.registerEncoder(l1liIOil0i1o.class, lIl0l1io.I00000oIO);
/* 479 */                   il0IIIOll.registerEncoder(l1lOlIIOi.class, lIl1Oill0i.I00000oIO);
/* 486 */                   il0IIIOll.registerEncoder(l1iI1lOO.class, lIOO1O1ii0.I00000oIO);
/* 493 */                   il0IIIOll.registerEncoder(l1i1II.class, lIOOoI.I00000oIO);
/* 500 */                   il0IIIOll.registerEncoder(l1oI100ii.class, lIlolO.I00000oIO);
/* 507 */                   il0IIIOll.registerEncoder(l1o1i1oliIi.class, lIo0Ooi0o.I00000oIO);
/* 514 */                   il0IIIOll.registerEncoder(lI00OlOOil.class, lIoOiii1IiO.I00000oIO);
/* 521 */                   il0IIIOll.registerEncoder(l1ooi0IOi.class, lIoilIliolOO.I00000oIO);
/* 528 */                   il0IIIOll.registerEncoder(lI1oIi0I.class, lO1IOOIOo1.I00000oIO);
/* 535 */                   il0IIIOll.registerEncoder(lI1lI10l.class, lO1O11o1Ol.I00000oIO);
/* 542 */                   il0IIIOll.registerEncoder(lI0IIIi0il.class, lIolIil10OIi.I00000oIO);
/* 549 */                   il0IIIOll.registerEncoder(lI010lI.class, lIoo000l1.I00000oIO);
/* 556 */                   il0IIIOll.registerEncoder(lI0iI01I1l.class, lO00010.I00000oIO);
/* 563 */                   il0IIIOll.registerEncoder(lI0OIIO.class, lO010l10.I00000oIO);
/* 570 */                   il0IIIOll.registerEncoder(i1O0Ill0.class, lloOII01.I00000oIO);
/* 577 */                   il0IIIOll.registerEncoder(i1IiolOOl.class, lOl1iO.I00000oIO);
/* 584 */                   il0IIIOll.registerEncoder(i1IolI.class, lii1100liIo.I00000oIO);
/* 591 */                   il0IIIOll.registerEncoder(i1Ioil1.class, liOolI1Il.I00000oIO);
/* 598 */                   il0IIIOll.registerEncoder(i1IlIoiI10OI.class, li0Ioo0lo.I00000oIO);
/* 605 */                   il0IIIOll.registerEncoder(i1O01I0iIiiI.class, lloIOIoo.I00000oIO);
/* 612 */                   il0IIIOll.registerEncoder(i1Iolo.class, llo1ool.I00000oIO);
/* 619 */                   il0IIIOll.registerEncoder(i1O0OlIOOOl1.class, lloi010.I00000oIO);
/* 626 */                   il0IIIOll.registerEncoder(i1IlOlo1.class, li1Ol0io1.I00000oIO);
/* 633 */                   il0IIIOll.registerEncoder(i1O1i1.class, loOoOIii000.I00000oIO);
/* 640 */                   il0IIIOll.registerEncoder(i1O11iOo0.class, loi000i.I00000oIO);
/* 647 */                   il0IIIOll.registerEncoder(i1O0l1I.class, loOl0o00iool.I00000oIO);
/* 654 */                   il0IIIOll.registerEncoder(o1010iiOiiO.class, lloli11.I00000oIO);
/* 661 */                   il0IIIOll.registerEncoder(o00IiIi0OOl.class, li1iOo0I0.I00000oIO);
/* 668 */                   il0IIIOll.registerEncoder(o00oO1l.class, liI1OO0.I00000oIO);
/* 675 */                   il0IIIOll.registerEncoder(loi11l1lIl1.class, lOIOlo0iIoiO.I00000oIO);
/* 682 */                   il0IIIOll.registerEncoder(o000OIo1.class, li0o0o00Ol.I00000oIO);
/* 689 */                   il0IIIOll.registerEncoder(o00iooIo.class, li1loi1llo.I00000oIO);
/* 696 */                   il0IIIOll.registerEncoder(lool1il0il1.class, lOooioI0o.I00000oIO);
/* 703 */                   il0IIIOll.registerEncoder(loo00iiI01il.class, lOlO1Il1001I.I00000oIO);
/* 710 */                   il0IIIOll.registerEncoder(loo0I1oOoiO.class, lOlOllIo.I00000oIO);
/* 717 */                   il0IIIOll.registerEncoder(lolol0.class, lOlIIoll111.I00000oIO);
/* 724 */                   il0IIIOll.registerEncoder(loo0ilIIIl.class, lOliOoIl0o.I00000oIO);
/* 731 */                   il0IIIOll.registerEncoder(o0Oi1ii1IIl.class, ll01ii1OIOO.I00000oIO);
/* 738 */                   il0IIIOll.registerEncoder(lII1OI11o1I.class, lO1iiIoo1i.I00000oIO);
/* 745 */                   il0IIIOll.registerEncoder(lII0IlO.class, lO1OoIOIO0.I00000oIO);
/* 752 */                   il0IIIOll.registerEncoder(o01o000o.class, liOo01O10.I00000oIO);
/* 759 */                   il0IIIOll.registerEncoder(o01lol0.class, liOiiIo1io.I00000oIO);
/* 766 */                   il0IIIOll.registerEncoder(l1OOloO.class, lIIill.I00000oIO);
/* 773 */                   il0IIIOll.registerEncoder(i1IOll0l.class, loOIO1il.I00000oIO);
/* 780 */                   il0IIIOll.registerEncoder(i1Iii1O.class, loOi1loi.I00000oIO);
/* 787 */                   il0IIIOll.registerEncoder(i1Ii10Oi0OO.class, loOIooi.I00000oIO);
/* 794 */                   il0IIIOll.registerEncoder(loi0o0.class, lOI1lil10o1.I00000oIO);
/* 801 */                   il0IIIOll.registerEncoder(lolIo10I.class, lOii0I1I.I00000oIO);
/* 808 */                   il0IIIOll.registerEncoder(lolIIlOlOl0.class, lOiO011O.I00000oIO);
/* 815 */                   il0IIIOll.registerEncoder(lolI1010oo11.class, lOi11lOlO.I00000oIO);
/* 822 */                   il0IIIOll.registerEncoder(o0OliO1i.class, ll0l0Olo.I00000oIO);
/* 829 */                   il0IIIOll.registerEncoder(o0OoIl.class, ll1000oo.I00000oIO);
/* 836 */                   il0IIIOll.registerEncoder(o0Oo1llO.class, ll0lioli.I00000oIO);
/* 843 */                   il0IIIOll.registerEncoder(l1lIlIOOOl0o.class, lIilII1IO1.I00000oIO);
/* 850 */                   il0IIIOll.registerEncoder(l1l1l1.class, lIio0l.I00000oIO);
/* 857 */                   il0IIIOll.registerEncoder(o0i100l00.class, ll1Ii0.I00000oIO);
/* 864 */                   il0IIIOll.registerEncoder(o0iIlioiI0i.class, ll1lOoOIooO1.I00000oIO);
/* 871 */                   il0IIIOll.registerEncoder(o0i1iI0O11.class, ll1OiiO10i.I00000oIO);
/* 878 */                   il0IIIOll.registerEncoder(o0iI00olii.class, ll1iOl.I00000oIO);
/* 885 */                   il0IIIOll.registerEncoder(l1lo1O.class, lIlI1II01l.I00000oIO);
/* 892 */                   il0IIIOll.registerEncoder(l1llOi0iO.class, lIlOoOoO.I00000oIO);
/* 899 */                   il0IIIOll.registerEncoder(o11iioo.class, loI0o1iO.I00000oIO);
/* 906 */                   il0IIIOll.registerEncoder(o11iI1looiO.class, loI00iIIoo.I00000oIO);
/* 913 */                   il0IIIOll.registerEncoder(o1I01i1oiO1.class, loO00IoI11.I00000oIO);
/* 920 */                   il0IIIOll.registerEncoder(o1I0OO0o.class, loO11OO.I00000oIO);
/* 927 */                   il0IIIOll.registerEncoder(o0l01lOliOo.class, llIlIiiIOIO1.I00000oIO);
/* 934 */                   il0IIIOll.registerEncoder(o0lI110.class, llO0I0iIo.I00000oIO);
/* 941 */                   il0IIIOll.registerEncoder(o0l11O.class, llIloI.I00000oIO);
/* 948 */                   il0IIIOll.registerEncoder(o0l1OIl0ioi.class, llIoOo1olIoo.I00000oIO);
/* 955 */                   il0IIIOll.registerEncoder(o001i0OiOiI.class, li11lo1IIOOi.I00000oIO);
/* 962 */                   il0IIIOll.registerEncoder(l1oioiOo.class, lIo1Olil.I00000oIO);
/* 969 */                   il0IIIOll.registerEncoder(l1oOOloO0.class, lIoIOiiiI.I00000oIO);
/* 976 */                   il0IIIOll.registerEncoder(o000ol.class, li110Ill0i.I00000oIO);
/* 983 */                   il0IIIOll.registerEncoder(looo0l.class, li0OII.I00000oIO);
/* 990 */                   il0IIIOll.registerEncoder(o0iOloIo.class, ll1oIil.I00000oIO);
/* 997 */                   il0IIIOll.registerEncoder(o0iiI0Olioo.class, llI0iioI0ii.I00000oIO);
/* 1004 */                  il0IIIOll.registerEncoder(o0iOo0IO10.class, ll1oOo0.I00000oIO);
/* 1011 */                  il0IIIOll.registerEncoder(l1o0oO.class, lIliiIo0Ol.I00000oIO);
/* 1018 */                  il0IIIOll.registerEncoder(l1o01i0.class, lIlliio0OOo.I00000oIO);
/* 1025 */                  il0IIIOll.registerEncoder(o0O1l0o1.class, lioi10IoIOli.I00000oIO);
/* 1032 */                  il0IIIOll.registerEncoder(o0OI1oO0.class, lioioooll1Ol.I00000oIO);
/* 1039 */                  il0IIIOll.registerEncoder(o0OIIo0l.class, lioll00i.I00000oIO);
/* 1046 */                  il0IIIOll.registerEncoder(l1ioi10IIoO0.class, lIi1I10.I00000oIO);
/* 1053 */                  il0IIIOll.registerEncoder(l1il0l0IoOO1.class, lIiIiO.I00000oIO);
/* 1060 */                  il0IIIOll.registerEncoder(o0O0I1.class, lio0o1o.I00000oIO);
/* 1067 */                  il0IIIOll.registerEncoder(o0O0oi0oO.class, lioO11O.I00000oIO);
/* 1074 */                  il0IIIOll.registerEncoder(o0O11i1.class, lioOO1o.I00000oIO);
/* 1081 */                  il0IIIOll.registerEncoder(l1iOloII.class, lIOoi00O.I00000oIO);
/* 1088 */                  il0IIIOll.registerEncoder(l1iO0o0oo.class, lIi0oIl.I00000oIO);
/* 1095 */                  il0IIIOll.registerEncoder(o0OO01l1OIl.class, liooIOO1OI.I00000oIO);
/* 1102 */                  il0IIIOll.registerEncoder(o0OOOlOI.class, lioooOo.I00000oIO);
/* 1109 */                  il0IIIOll.registerEncoder(o0OOoIO0Ili1.class, ll00oI.I00000oIO);
/* 1116 */                  il0IIIOll.registerEncoder(l1l0oo0l.class, lIiOo0ll.I00000oIO);
/* 1123 */                  il0IIIOll.registerEncoder(l1l01I.class, lIiilI0o1I.I00000oIO);
/* 1130 */                  il0IIIOll.registerEncoder(o11OO1l0.class, lo1lIi.I00000oIO);
/* 1137 */                  il0IIIOll.registerEncoder(o11OIIOIil.class, lo1o00ll0ool.I00000oIO);
/* 1144 */                  il0IIIOll.registerEncoder(o00oOio1Ii00.class, liIIoio.I00000oIO);
/* 1151 */                  il0IIIOll.registerEncoder(o010oIl0.class, liIioOol.I00000oIO);
/* 1158 */                  il0IIIOll.registerEncoder(o010ii.class, liIOo1.I00000oIO);
/* 1165 */                  il0IIIOll.registerEncoder(o010ol1l.class, liIlll01OI.I00000oIO);
/* 1172 */                  il0IIIOll.registerEncoder(o0oOO11IIO.class, lll1l0io.I00000oIO);
/* 1179 */                  il0IIIOll.registerEncoder(o0oOoio.class, lllIOloI1I0.I00000oIO);
/* 1186 */                  il0IIIOll.registerEncoder(lI11o0Ili1IO.class, lO0iOIlioi.I00000oIO);
/* 1193 */                  il0IIIOll.registerEncoder(lI10OoOI.class, lO0lilI011.I00000oIO);
/* 1200 */                  il0IIIOll.registerEncoder(o11ilIlo.class, loI1Illi0OO0.I00000oIO);
/* 1207 */                  il0IIIOll.registerEncoder(o0o1IOI1.class, lliilooil11i.I00000oIO);
/* 1214 */                  il0IIIOll.registerEncoder(o0o1lo.class, lliliill1Oi.I00000oIO);
/* 1221 */                  il0IIIOll.registerEncoder(lI0ol111l.class, lO0I0o.I00000oIO);
/* 1228 */                  il0IIIOll.registerEncoder(lI0lIOoIO.class, lO0O11I.I00000oIO);
/* 1235 */                  il0IIIOll.registerEncoder(o11i11l0lI00.class, lo1olo0l0.I00000oIO);
/* 1242 */                  il0IIIOll.registerEncoder(o0Ioi100O.class, lil0oii.I00000oIO);
/* 1249 */                  il0IIIOll.registerEncoder(o0Io0O0O0.class, lio01iI0.I00000oIO);
/* 1256 */                  il0IIIOll.registerEncoder(o0Il1lIiil.class, lill0I.I00000oIO);
/* 1263 */                  il0IIIOll.registerEncoder(o0IOOiO11.class, lilOioo.I00000oIO);
/* 1270 */                  il0IIIOll.registerEncoder(o0Ilo1i.class, lillIioOIi00.I00000oIO);
/* 1277 */                  il0IIIOll.registerEncoder(o0IloIOII1OI.class, lilooO.I00000oIO);
/* 1284 */                  il0IIIOll.registerEncoder(o0IIli0.class, lilIOi.I00000oIO);
/* 1291 */                  il0IIIOll.registerEncoder(o0I0o111.class, liioIiiOooOi.I00000oIO);
/* 1298 */                  il0IIIOll.registerEncoder(o0IIOIlloO.class, lil1o010.I00000oIO);
/* 1305 */                  il0IIIOll.registerEncoder(o0I1liO.class, lil11O0l.I00000oIO);
/* 1312 */                  il0IIIOll.registerEncoder(o0Oill1llio0.class, ll0O1iOOIo.I00000oIO);
/* 1319 */                  il0IIIOll.registerEncoder(looOliolio.class, lOoi0o0I0.I00000oIO);
/* 1326 */                  il0IIIOll.registerEncoder(o0OiI0o0Oo.class, ll0I1Io.I00000oIO);
/* 1333 */                  il0IIIOll.registerEncoder(o0Ol1Iioli.class, ll0l0I.I00000oIO);
/* 1340 */                  il0IIIOll.registerEncoder(looOO0i011O.class, lOoIlOlo1oOO.I00000oIO);
/* 1347 */                  il0IIIOll.registerEncoder(looiI1O1OO.class, lOoilIo.I00000oIO);
/* 1354 */                  il0IIIOll.registerEncoder(o1000I.class, llolOOoloO.I00000oIO);
/* 1361 */                  il0IIIOll.registerEncoder(o0oi1o.class, lllOOllO0.I00000oIO);
/* 1368 */                  il0IIIOll.registerEncoder(o11o0iI.class, loIl0olIoI.I00000oIO);
/* 1375 */                  il0IIIOll.registerEncoder(o0oii1OIi.class, llll01il.I00000oIO);
/* 1382 */                  il0IIIOll.registerEncoder(o0oiI10I.class, llli1OOi.I00000oIO);
/* 1389 */                  il0IIIOll.registerEncoder(o11lI1.class, loIIo1OO.I00000oIO);
/* 1396 */                  il0IIIOll.registerEncoder(lI1iiO11I.class, lO0oli01ol.I00000oIO);
/* 1403 */                  il0IIIOll.registerEncoder(lI1O0i1l.class, lO110llOioI.I00000oIO);
/* 1410 */                  il0IIIOll.registerEncoder(o11llO.class, loIOlo.I00000oIO);
/* 1417 */                  il0IIIOll.registerEncoder(looOIIlolo.class, lOoI0I.I00000oIO);
/* 1424 */                  il0IIIOll.registerEncoder(looIil0o0Ii.class, lOo1Oo100i.I00000oIO);
/* 1431 */                  il0IIIOll.registerEncoder(looIOilo0.class, lOo0O0il1.I00000oIO);
/* 1438 */                  il0IIIOll.registerEncoder(loo1iliOIlII.class, lOlliI00i010.I00000oIO);
/* 1445 */                  il0IIIOll.registerEncoder(loo1I0i.class, lOloO10Iiiio.I00000oIO);
/* 1452 */                  il0IIIOll.registerEncoder(o11IOIil1l0o.class, lo1O1Oi.I00000oIO);
/* 1459 */                  il0IIIOll.registerEncoder(o11Ioi0.class, lo1iI1IololI.I00000oIO);
/* 1466 */                  il0IIIOll.registerEncoder(o10l1l.class, lo0I10l1o01.I00000oIO);
/* 1473 */                  il0IIIOll.registerEncoder(o110O0i1li.class, lo0l01ioIo.I00000oIO);
/* 1480 */                  il0IIIOll.registerEncoder(o10loo1oll.class, lo0III.I00000oIO);
/* 1487 */                  il0IIIOll.registerEncoder(o111lO00.class, lo11i0iI.I00000oIO);
/* 1494 */                  il0IIIOll.registerEncoder(o110iI10Io.class, lo0o01OiIo0l.I00000oIO);
/* 1501 */                  il0IIIOll.registerEncoder(o11II0.class, lo1IIi0l.I00000oIO);
/* 1508 */                  il0IIIOll.registerEncoder(o11I00iI.class, lo11oooiIIiO.I00000oIO);
/* 1515 */                  il0IIIOll.registerEncoder(o10oioi0iOO.class, lo0Oo1lIi.I00000oIO);
/* 1522 */                  il0IIIOll.registerEncoder(o10oilOO.class, lo0O1O0iOIOO.I00000oIO);
/* 1529 */                  il0IIIOll.registerEncoder(o111i11.class, lo10loIIllOo.I00000oIO);
/* 1536 */                  il0IIIOll.registerEncoder(o11111.class, lo0oioII11.I00000oIO);
/* 1543 */                  il0IIIOll.registerEncoder(o10iO00iOl.class, lo010I1o1i1i.I00000oIO);
/* 1550 */                  il0IIIOll.registerEncoder(o10OlO.class, iIOo0oiIi1.I00100o1O0lo);
/* 1557 */                  il0IIIOll.registerEncoder(o10IIi1O010o.class, iIOo0oiIi1.I00100l0);
                            break;
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 101 */                   List list = iol1II1ii1i.I00000oIO;
/* 105 */                   iI1lO0li.I00iiI.get();
/* 123 */                   return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
                        case PoseLandmark.LEFT_THUMB:
/* 74 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 78 */                    iI1lO0li.I00iiI.get();
/* 98 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 47 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 51 */                    iI1lO0li.I00iiI.get();
/* 71 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
                        case PoseLandmark.LEFT_HIP:
                        default:
/* 8 */                     return new ConcurrentSkipListMap();
                        case PoseLandmark.RIGHT_HIP:
/* 12 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 16 */                    iI1lO0li.I00iiI.get();
/* 42 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
                    }
                }

                @Override
/* 19 */        public void shutdown() {
                }

                @Override
/* 36 */        public void zzc(iOli1OIoI0o ioli1oioi0o, long j) {
                }

                @Override
/* 36 */        public void zzd(iOli1OIoI0o ioli1oioi0o, long j) {
                }

                @Override
/* 97 */        public void zzb(iOli1OIoI0o ioli1oioi0o, int i, iOlI0O0iIiO ioli0o0iiio) {
                }

                @Override
/* 126 */       public void zza(iOli1OIoI0o ioli1oioi0o) {
                }

                @Override
/* 127 */       public ilIoOl zza() {
/* 128 */           return ilIoOl.I0000Il00O(6, null, "AICore service disconnected");
                }
            }

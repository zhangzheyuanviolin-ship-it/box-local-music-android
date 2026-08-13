            package p000;

            import android.graphics.Bitmap;
            import android.util.JsonWriter;
            import android.view.Window;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.io.StringWriter;
            import java.io.Writer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.Stack;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
/* 13 */    public class I0IIiO0iI implements O1l0OiO10IoI, Ol0iOll10l, OIi0Oi1lOoo, Ol0IlIoIIIoO, Oli00lo1i, IIiOOIoi0, OlI1o0ooI, OlOo0OlIol1l, i0Ii0I1ll, I1oIlOi11, i1lOiiiO, ii0lO1Iiio {
                public final int I00iOIl;
                public Object I00iiI;

                public I0IIiO0iI() {
/* 2 */             this.I00iOIl = 4;
/* 12 */            this.I00iiI = new IIOIoIO00l0i();
                }

                @Override
                public Object I00000oIO(OOllIOloOl01 oOllIOloOl01) {
/* 5 */             OlO0OIIl1 olO0OIIl1 = ((I1Oo1iio0) this.I00iiI).I00ilO0;
/* 10 */            I10OIo i10OIo = new I10OIo(1);
/* 13 */            i10OIo.I00iiI = olO0OIIl1;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            return ilOoO00.I00000oIO(i10OIo, oOllIOloOl01);
                }

                @Override
                public void I00000oOI(IOlo10lO1iOl iOlo10lO1iOl) {
/* 5 */             ((Io0iOll) this.I00iiI).I00000oOI(iOlo10lO1iOl);
                }

                @Override
                public Object I0000Il00O() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_KNEE:
/* 31 */                    return ((i0Ii0I1ll) this.I00iiI).I0000Il00O();
                        default:
/* 16 */                    i0Il00O1 i0il00o1 = (i0Il00O1) ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 18 */                    i0OIlO i0oilo = new i0OIlO();
/* 21 */                    i0oilo.I00000oIO = i0il00o1;
/* 23 */                    VarHandle.storeStoreFence();
/* 26 */                    return i0oilo;
                    }
                }

                @Override
                public void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 5 */             ((I11oi01ll) this.I00iiI).I000oI1ioi(o1illlIiilIl);
                }

                @Override
                public void I0000oI00(O1il00oooo o1il00oooo, Bitmap bitmap, Map map) {
/* 9 */             ((O1I1OO) this.I00iiI).I00111O(o1il00oooo, bitmap, map, iO1o01.I00000oIO(bitmap));
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 5 */             ((Function1) this.I00iiI).invoke(obj);
                }

                @Override
                public Set I000II() {
/* 11 */            return ((OlOo0il1Oo) li0IoO01I0l0.I00000oIO((Io1O0I1i) this.I00iiI)).I000II();
                }

                @Override
                public O1il0O00 I000OOo1O(O1il00oooo o1il00oooo) {
/* 1 */             return null;
                }

                public void I000iOII(IIOII1 iioii1) {
/* 5 */             if (!iioii1.I000OiO()) {
/* 155 */               if (!(iioii1 instanceof OiI01lII01oI)) {
/* 174 */                   String strValueOf = String.valueOf(iioii1.getClass());
/* 195 */                   I000II.I000iOII(IIl001iO0Io.I00100l0(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
/* 437 */                   return;
                        } else {
/* 157 */                   OiI01lII01oI oiI01lII01oI = (OiI01lII01oI) iioii1;
/* 161 */                   I000iOII(oiI01lII01oI.I00iiO);
/* 166 */                   I000iOII(oiI01lII01oI.I00iio);
/* 169 */                   return;
                        }
                    }
/* 7 */             int size = iioii1.size();
/* 11 */            int[] iArr = OiI01lII01oI.I00ioIO;
/* 13 */            int iBinarySearch = Arrays.binarySearch(iArr, size);
/* 17 */            if (iBinarySearch < 0) {
                        iBinarySearch = (-(iBinarySearch + 1)) - 1;
                    }
/* 26 */            int i = iArr[iBinarySearch + 1];
/* 30 */            Stack stack = (Stack) this.I00iiI;
/* 36 */            if (stack.isEmpty() || ((IIOII1) stack.peek()).size() >= i) {
/* 149 */               stack.push(iioii1);
/* 152 */               return;
                    }
/* 51 */            int i2 = iArr[iBinarySearch];
/* 57 */            IIOII1 oiI01lII01oI2 = (IIOII1) stack.pop();
/* 63 */            while (!stack.isEmpty() && ((IIOII1) stack.peek()).size() < i2) {
/* 85 */                oiI01lII01oI2 = new OiI01lII01oI((IIOII1) stack.pop(), oiI01lII01oI2);
                    }
/* 92 */            OiI01lII01oI oiI01lII01oI3 = new OiI01lII01oI(oiI01lII01oI2, iioii1);
/* 99 */            while (!stack.isEmpty()) {
/* 101 */               int[] iArr2 = OiI01lII01oI.I00ioIO;
/* 105 */               int iBinarySearch2 = Arrays.binarySearch(iArr2, oiI01lII01oI3.I00iiI);
/* 109 */               if (iBinarySearch2 < 0) {
                            iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                        }
/* 130 */               if (((IIOII1) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                            break;
                        } else {
/* 140 */                   oiI01lII01oI3 = new OiI01lII01oI((IIOII1) stack.pop(), oiI01lII01oI3);
                        }
                    }
/* 145 */           stack.push(oiI01lII01oI3);
                }

                public String I000l1(Object obj) {
/* 3 */             StringWriter stringWriter = new StringWriter();
                    try {
/* 6 */                 I000o00OoI0I(obj, stringWriter);
                    } catch (IOException unused) {
                    }
/* 9 */             return stringWriter.toString();
                }

                @Override
                public boolean I000lI(O1illlIiilIl o1illlIiilIl) {
/* 7 */             Window.Callback callback = ((I11oi01ll) this.I00iiI).I00l0I0l0lO1.getCallback();
/* 11 */            if (callback == null) {
/* 18 */                return true;
                    }
/* 15 */            callback.onMenuOpened(108, o1illlIiilIl);
/* 18 */            return true;
                }

                public void I000o00OoI0I(Object obj, Writer writer) throws IOException {
/* 5 */             O01IiIi1l o01IiIi1l = (O01IiIi1l) this.I00iiI;
/* 7 */             HashMap map = o01IiIi1l.I00000oIO;
/* 9 */             HashMap map2 = o01IiIi1l.I00000oOI;
/* 11 */            O01IO1I0 o01io1i0 = o01IiIi1l.I0000Il00O;
/* 13 */            boolean z = o01IiIi1l.I0000O;
/* 15 */            O01oi0lIlOo o01oi0lIlOo = new O01oi0lIlOo();
/* 19 */            o01oi0lIlOo.I00000oIO = true;
/* 23 */            JsonWriter jsonWriter = new JsonWriter(writer);
/* 26 */            o01oi0lIlOo.I00000oOI = jsonWriter;
/* 28 */            o01oi0lIlOo.I0000Il00O = map;
/* 30 */            o01oi0lIlOo.I0000O = map2;
/* 32 */            o01oi0lIlOo.I0000oI00 = o01io1i0;
/* 34 */            o01oi0lIlOo.I0001Ioi1lo = z;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            o01oi0lIlOo.I00000oIO(obj);
/* 42 */            o01oi0lIlOo.I0000Il00O();
/* 45 */            jsonWriter.flush();
                }

                public void I000oI1ioi(int i, int i2, int i3) throws IOException {
/* 3 */             IIOIoIO00l0i iIOIoIO00l0i = (IIOIoIO00l0i) this.I00iiI;
/* 7 */             for (int i4 = 0; i4 < i; i4++) {
                        int i5 = i - 1;
/* 21 */                boolean z = ((i2 >> (i5 - i4)) & 1) == 1;
/* 27 */                IIOIoIO00l0i iIOIoIO00l0i2 = z ? iIOIoIO00l0i.I00000oOI : iIOIoIO00l0i.I00000oIO;
/* 29 */                if (iIOIoIO00l0i2 == null) {
/* 33 */                    iIOIoIO00l0i2 = new IIOIoIO00l0i();
/* 36 */                    if (i4 == i5) {
/* 38 */                        iIOIoIO00l0i2.I0000Il00O = i3;
/* 40 */                        iIOIoIO00l0i2.I0000oI00 = true;
                            }
/* 42 */                    if (i2 == 0) {
/* 44 */                        iIOIoIO00l0i2.I0000O = true;
                            }
/* 46 */                    if (z) {
/* 51 */                        iIOIoIO00l0i.I00000oOI = iIOIoIO00l0i2;
                            } else {
/* 48 */                        iIOIoIO00l0i.I00000oIO = iIOIoIO00l0i2;
                            }
                        } else if (iIOIoIO00l0i2.I0000oI00) {
/* 65 */                    IioIoO10iOiI.I000OOo1O("node is leaf, no other following");
/* 98 */                    return;
                        }
/* 53 */                iIOIoIO00l0i = iIOIoIO00l0i2;
                    }
                }

                public void I00100l0(int i, IIOIoIO00l0i iIOIoIO00l0i) throws IOException {
/* 3 */             IIOIoIO00l0i iIOIoIO00l0i2 = (IIOIoIO00l0i) this.I00iiI;
/* 6 */             int i2 = 0;
/* 9 */             while (i2 < 12) {
/* 21 */                boolean z = ((i >> (11 - i2)) & 1) == 1;
/* 27 */                IIOIoIO00l0i iIOIoIO00l0i3 = z ? iIOIoIO00l0i2.I00000oOI : iIOIoIO00l0i2.I00000oIO;
/* 29 */                if (iIOIoIO00l0i3 == null) {
/* 39 */                    iIOIoIO00l0i3 = i2 == 11 ? iIOIoIO00l0i : new IIOIoIO00l0i();
/* 42 */                    if (i == 0) {
/* 44 */                        iIOIoIO00l0i3.I0000O = true;
                            }
/* 46 */                    if (z) {
/* 51 */                        iIOIoIO00l0i2.I00000oOI = iIOIoIO00l0i3;
                            } else {
/* 48 */                        iIOIoIO00l0i2.I00000oIO = iIOIoIO00l0i3;
                            }
                        } else if (iIOIoIO00l0i3.I0000oI00) {
/* 65 */                    IioIoO10iOiI.I000OOo1O("node is leaf, no other following");
/* 106 */                   return;
                        }
/* 53 */                iIOIoIO00l0i2 = iIOIoIO00l0i3;
/* 60 */                i2++;
                    }
                }

                public void I00100o1O0lo(loIOiIO1O1 loioiio1o1) {
/* 9 */             IIlIOloOOO.I001i1lo1io(((IOollI1oO) this.I00iiI).I00000oIO(loioiio1o1));
                }

                @Override
                public void I00OloOo(String str, Iterable iterable) {
/* 3 */             Io1O0I1i io1O0I1i = (Io1O0I1i) this.I00iiI;
/* 6 */             String strI0000oI00 = IOOIli0I.I0000oI00(str, false);
/* 18 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 21 */            Iterator it = iterable.iterator();
/* 29 */            while (it.hasNext()) {
/* 42 */                arrayList.add(IOOIli0I.I0000oI00((String) it.next(), true));
                    }
/* 46 */            io1O0I1i.I00OloOo(strI0000oI00, arrayList);
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    switch (this.I00iOIl) {
                        case 11:
/* 46 */                    IO0oo1I0oIO iO0oo1I0oIO = (IO0oo1I0oIO) this.I00iiI;
/* 53 */                    lII1OI11o1I.I0000oI00("The result can only set once!", iO0oo1I0oIO.I00iiI == null);
/* 56 */                    iO0oo1I0oIO.I00iiI = iIiOOI;
/* 71 */                    return "FutureChain[" + iO0oo1I0oIO + "]";
                        default:
/* 14 */                    O10IIOOiO o10IIOOiO = (O10IIOOiO) this.I00iiI;
/* 21 */                    lII1OI11o1I.I0000oI00("The result can only set once!", o10IIOOiO.I00ilO0 == null);
/* 24 */                    o10IIOOiO.I00ilO0 = iIiOOI;
/* 39 */                    return "ListFuture[" + this + "]";
                    }
                }

                @Override
                public void lock() {
/* 5 */             ((ReentrantLock) this.I00iiI).lock();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 15:
/* 13 */                    StringBuilder sb = new StringBuilder();
/* 18 */                    O0lI0O1OOi1 o0lI0O1OOi1 = (O0lI0O1OOi1) this.I00iiI;
/* 20 */                    sb.append(o0lI0O1OOi1);
/* 25 */                    sb.append(": ");
/* 28 */                    O1I0II11i o1I0II11i = o0lI0O1OOi1.I00l0I0l0lO1;
/* 33 */                    O0O00I1Ili o0O00I1Ili = O0lI0O1OOi1.I00lli11[0];
/* 45 */                    sb.append(((Map) o1I0II11i.invoke()).keySet());
/* 48 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public void unlock() {
/* 5 */             ((ReentrantLock) this.I00iiI).unlock();
                }

                @Override
                public i1o1O0ioO zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 i1lOiiiO i1loiiio = ((i1lOiiiO[]) this.I00iiI)[i];
/* 15 */                if (i1loiiio.zzc(cls)) {
/* 17 */                    return i1loiiio.zzb(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public boolean zzc(Class cls) {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_ANKLE:
/* 31 */                    for (int i = 0; i < 2; i++) {
/* 43 */                        if (((i1lOiiiO[]) this.I00iiI)[i].zzc(cls)) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    for (int i2 = 0; i2 < 2; i2++) {
/* 22 */                        if (((ii0lO1Iiio[]) this.I00iiI)[i2].zzc(cls)) {
                                    break;
                                }
                            }
                            break;
                    }
/* 5 */             return true;
                }

/* 14 */        public I0IIiO0iI(Object obj, int i) {
/* 15 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }

/* 15 */        public I0IIiO0iI(Ii110ilOil ii110ilOil, Ii110iO01ol1 ii110iO01ol1) {
                    this.I00iOIl = 6;
/* 17 */            this.I00iiI = ii110ilOil;
                }

/* 17 */        public I0IIiO0iI(int i) {
/* 18 */            this.I00iOIl = i;
                }

                @Override
/* 28 */        public void I000OiO(int i) {
                }

                @Override
/* 39 */        public ii0oOi0 mo21zzb(Class cls) {
                    for (int i = 0; i < 2; i++) {
                        ii0lO1Iiio ii0lo1iiio = ((ii0lO1Iiio[]) this.I00iiI)[i];
/* 40 */                if (ii0lo1iiio.zzc(cls)) {
/* 41 */                    return ii0lo1iiio.mo21zzb(cls);
                        }
                    }
/* 42 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
                    return null;
                }
            }

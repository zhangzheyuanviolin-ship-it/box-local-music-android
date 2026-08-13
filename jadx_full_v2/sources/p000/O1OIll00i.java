            package p000;

            import android.os.IInterface;
            import android.view.KeyEvent;
            import android.view.MenuItem;
            import androidx.appcompat.widget.Toolbar;
            import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CopyOnWriteArrayList;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public class O1OIll00i implements Il1iool, Ii1i0IloI1, I1IOO1OOo, Il0O1OllI, Illo1O0O10l, O0O1olliIO10, O0iI0IlO0iI, OOooio11i00, O1ilOII, OooI0100Oill, OIi0Oi1lOoo, i0Ii0I1ll, i11lIilOO0II {
                public static final IloooOIO I00iiO = new IloooOIO(1);
                public final int I00iOIl;
                public Object I00iiI;

                public O1OIll00i(byte[] bArr) throws IIOlio1ol {
/* 1 */             int i = 5;
/* 2 */             this.I00iOIl = 5;
/* 4 */             int i2 = IIOo0lIiilo.I00000oIO;
                    try {
/* 17 */                IOoOI0oo1 iOoOI0oo1I000o00OoI0I = IOoOI0oo1.I000o00OoI0I(new I00Io1o110i(bArr).I000l1());
/* 21 */                if (iOoOI0oo1I000o00OoI0I == null) {
/* 98 */                    throw new IIOlio1ol("No content found.");
                        }
                        try {
/* 28 */                    Il0o0lOl il0o0lOlI000o00OoI0I = Il0o0lOl.I000o00OoI0I(iOoOI0oo1I000o00OoI0I.I00iiI);
/* 32 */                    OIilOOI0O0io oIilOOI0O0io = il0o0lOlI000o00OoI0I.I00iiI;
/* 34 */                    I00OilO00Il i00OilO00Il = il0o0lOlI000o00OoI0I.I00iiO;
/* 36 */                    Il0IO1Ol1ioI il0IO1Ol1ioI = il0o0lOlI000o00OoI0I.I00iio;
/* 38 */                    I0ioOiiIO0 i0ioOiiIO0 = il0IO1Ol1ioI.I00iiI;
/* 44 */                    byte[] bArr2 = il0IO1Ol1ioI.I00iiO.I00iOIl;
/* 46 */                    I00O0i0ii i00O0i0ii = IIOlll0i.I00000oIO;
/* 49 */                    Oi0Oooi oi0Oooi = new Oi0Oooi(i, false);
/* 52 */                    oi0Oooi.I00iiI = bArr2;
/* 54 */                    VarHandle.storeStoreFence();
/* 60 */                    IIloOI iIloOI = new IIloOI(7);
/* 63 */                    iIloOI.I00iiI = oi0Oooi;
/* 65 */                    VarHandle.storeStoreFence();
/* 72 */                    this.I00iiI = iOiiIoO.I00000oIO(i00OilO00Il, i0ioOiiIO0, iIloOI);
                        } catch (ClassCastException e) {
/* 90 */                    throw new IIOlio1ol("Malformed content.", e);
                        } catch (IllegalArgumentException e2) {
/* 84 */                    throw new IIOlio1ol("Malformed content.", e2);
                        }
                    } catch (IOException e3) {
/* 186 */               throw new IIOlio1ol("IOException reading content.", e3);
                    } catch (ClassCastException e4) {
/* 114 */               throw new IIOlio1ol("Malformed content.", e4);
                    } catch (IllegalArgumentException e5) {
/* 108 */               throw new IIOlio1ol("Malformed content.", e5);
                    }
                }

                public static int I00O0o1oo(int i) {
/* 3 */             if (i < 128) {
/* 5 */                 return 1;
                    }
/* 7 */             int i2 = 2;
                    while (true) {
/* 8 */                 i >>>= 8;
/* 10 */                if (i == 0) {
/* 49 */                    return i2;
                        }
/* 12 */                i2++;
                    }
                }

                public static int I00O10llo(int i, boolean z) {
/* 6 */             return I00O0o1oo(i) + (z ? 1 : 0) + i;
                }

                public static int I00OI1(int i) {
/* 3 */             if (i < 31) {
/* 5 */                 return 1;
                    }
/* 7 */             int i2 = 2;
                    while (true) {
/* 8 */                 i >>>= 7;
/* 10 */                if (i == 0) {
/* 49 */                    return i2;
                        }
/* 12 */                i2++;
                    }
                }

                @Override
                public boolean I00000oIO() {
/* 5 */             ((OillOo0) this.I00iiI).getClass();
/* 8 */             return false;
                }

                @Override
                public long I00000oOI(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 5 */             return ((OillOo0) this.I00iiI).I00000oOI(i110ooool, i110ooool2, i110ooool3);
                }

                @Override
                public Object I0000Il00O() {
/* 9 */             return i01IlOO.I00000oOI(((i0O00lI) this.I00iiI).I00000oOI());
                }

                @Override
                public boolean I0000O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 1 */             return false;
                }

                @Override
                public i11lilllII I0000oI00(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 i11lIilOO0II i11liiloo0ii = ((i11lIilOO0II[]) this.I00iiI)[i];
/* 15 */                if (i11liiloo0ii.I000l1(cls)) {
/* 17 */                    return i11liiloo0ii.I0000oI00(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
                    switch (this.I00iOIl) {
                        case 13:
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 69 */                    ((Olio0OIill) this.I00iiI).run();
                            break;
                        default:
/* 8 */                     i0Il00O1 i0il00o1 = (i0Il00O1) this.I00iiI;
/* 10 */                    List list = (List) obj;
/* 14 */                    int iI00000oIO = i0il00o1.I00000oOI.I00000oIO();
/* 22 */                    Iterator it = i0il00o1.I0001Ioi1lo().iterator();
/* 30 */                    while (it.hasNext()) {
/* 36 */                        File file = (File) it.next();
/* 46 */                        if (!list.contains(file.getName()) && i0Il00O1.I00000oOI(file, true) != iI00000oIO) {
/* 58 */                            i0Il00O1.I000O01llI0(file);
                                }
                            }
                            break;
                    }
                }

                @Override
                public Object I000II(OOOOI1ioIo oOOOI1ioIo, Object obj) {
/* 1 */             return I001lloI(oOOOI1ioIo, obj);
                }

                @Override
                public Object I000O01llI0(Ooo00oi0O ooo00oi0O, Object obj) {
/* 1 */             return null;
                }

                @Override
                public Object I000OiO(I01l00l i01l00l, Object obj) {
/* 1 */             return null;
                }

                @Override
                public Object I000iOII(O0ioOi0Oo1ii o0ioOi0Oo1ii, Object obj) {
/* 1 */             return null;
                }

                @Override
                public boolean I000l1(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 16 */                if (((i11lIilOO0II[]) this.I00iiI)[i].I000l1(cls)) {
/* 18 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public OI0oiliol10O I000o00OoI0I() {
                    throw null;
                }

                @Override
                public I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 10 */            return ((OillOo0) this.I00iiI).I000oI1ioi(j, i110ooool, i110ooool2, i110ooool3);
                }

                @Override
                public Object I00100l0(OOOOOO0O oooooo0o, Object obj) {
/* 1 */             return I001lloI(oooooo0o, obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public O0O1Ool I0010I0i(KeyEvent keyEvent) {
                    O0O1Ool o0O1Ool;
/* 1 */             int iI00000oIO = l0l1Ol00lIoi.I00000oIO(keyEvent);
/* 9 */             long jI00000oIO = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 15 */            boolean zI00000oIO = O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0010o);
/* 19 */            int i = l0l00iIIIOO.I00000oOI;
/* 24 */            O0O1Ool o0O1Ool2 = null;
/* 25 */            if (zI00000oIO) {
/* 48 */                o0O1Ool = (iI00000oIO == 0 || iI00000oIO == 8 || iI00000oIO == l0l00iIIIOO.I0000Il00O) ? O0O1Ool.I00oOio10iI1 : (iI00000oIO == 2 || iI00000oIO == i) ? O0O1Ool.I00olI : null;
                    } else if ((O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0010I0i) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0oii1o)) && (iI00000oIO == 0 || iI00000oIO == 8 || iI00000oIO == 2 || iI00000oIO == i)) {
/* 77 */                o0O1Ool = O0O1Ool.I01101IOlO;
                    }
/* 79 */            if (o0O1Ool != null) {
/* 81 */                return o0O1Ool;
                    }
/* 82 */            int iI00000oIO2 = l0l1Ol00lIoi.I00000oIO(keyEvent);
/* 86 */            if (iI00000oIO2 == i) {
/* 92 */                long jI00000oIO2 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 102 */               if (O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I0001Ioi1lo) || O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IOO)) {
/* 175 */                   o0O1Ool2 = O0O1Ool.I010i10l;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I000II) || O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IioO0OiOi)) {
/* 171 */                   o0O1Ool2 = O0O1Ool.I010iIIOlo;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I0000O) || O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IO1)) {
/* 167 */                   o0O1Ool2 = O0O1Ool.I010l10O;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I0000oI00) || O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IO1oi11O)) {
/* 163 */                   o0O1Ool2 = O0O1Ool.I010ioo;
                        }
                    } else if (iI00000oIO2 == 2) {
/* 185 */               long jI00000oIO3 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 195 */               if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I0001Ioi1lo) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IOO)) {
/* 300 */                   o0O1Ool2 = O0O1Ool.I00ilI0I1;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I000II) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IioO0OiOi)) {
/* 297 */                   o0O1Ool2 = O0O1Ool.I00iio;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I0000O) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IO1)) {
/* 294 */                   o0O1Ool2 = O0O1Ool.I00io1l;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I0000oI00) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IO1oi11O)) {
/* 291 */                   o0O1Ool2 = O0O1Ool.I00ilO0;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I000iOII)) {
/* 265 */                   o0O1Ool2 = O0O1Ool.I00oOio10iI1;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00111O)) {
/* 277 */                   o0O1Ool2 = O0O1Ool.I00oli;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I001lllioOl)) {
/* 288 */                   o0O1Ool2 = O0O1Ool.I010oio1OO0;
                        }
                    } else if (iI00000oIO2 == 8) {
/* 309 */               long jI00000oIO4 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 319 */               if (O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I001IO000) || O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00IlilI0i0i)) {
/* 349 */                   o0O1Ool2 = O0O1Ool.I010l1O;
                        } else if (O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I001i1O0Ol) || O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00Io1lO)) {
/* 346 */                   o0O1Ool2 = O0O1Ool.I010l1ol111;
                        }
                    } else if (iI00000oIO2 == 1 && O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00111O)) {
/* 371 */               o0O1Ool2 = O0O1Ool.I00oo1iO0ll;
                    }
                    return o0O1Ool2 == null ? ((IIIOlol) this.I00iiI).I0010I0i(keyEvent) : o0O1Ool2;
                }

                @Override
                public Object I0010o(O0o0oOii o0o0oOii, Object obj) {
/* 1 */             return null;
                }

                @Override
                public Object I00111O(IiOoI0oI iiOoI0oI, Object obj) {
/* 1 */             return null;
                }

                @Override
                public Object I001IIilI0O(OiOiliiO oiOiliiO, Float f, Float f2, Function1 function1, Ol1iIIOoO ol1iIIOoO) {
/* 25 */            Object objI00000oIO = lOIo00oi1i.I00000oIO(oiOiliiO, f.floatValue(), iOO0I0.I00000oIO(0.0f, f2.floatValue(), 28), (Ii1OoIll0) this.I00iiI, function1, ol1iIIOoO);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : (I1101l) objI00000oIO;
                }

                @Override
                public Object I001i1O0Ol(OI0011 oi0011, Object obj) {
/* 1 */             return null;
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 11 */            if ("b".equals(oI1Iio0ii1.I00000oOI())) {
/* 16 */                return new OOlIio(this, 2);
                    }
/* 20 */            return null;
                }

                @Override
                public Object I001l0I00(OOOO1o oOOO1o, Object obj) {
                    int i;
/* 5 */             O0IiOio0lo0 o0IiOio0lo0 = (O0IiOio0lo0) this.I00iiI;
/* 19 */            if (oOOO1o.I00Ol1ll1().isEmpty()) {
/* 36 */                i = (oOOO1o.I00oIiI10 != null ? 1 : 0) + (oOOO1o.I00oO101o != null ? 1 : 0);
                    } else {
/* 21 */                i = -1;
                    }
/* 40 */            if (oOOO1o.I00ilO0) {
/* 42 */                if (i == -1) {
/* 123 */                   IiO1i1IO0O1 iiO1i1IO0O1 = new IiO1i1IO0O1(o0IiOio0lo0, oOOO1o);
/* 126 */                   O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 132 */                   I01iiIii10O i01iiIii10O = new I01iiIii10O(13);
/* 135 */                   i01iiIii10O.I00iiI = iiO1i1IO0O1;
/* 137 */                   VarHandle.storeStoreFence();
/* 144 */                   iiO1i1IO0O1.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01iiIii10O);
/* 146 */                   VarHandle.storeStoreFence();
/* 149 */                   return iiO1i1IO0O1;
                        }
/* 44 */                if (i == 0) {
/* 102 */                   IiO11ii iiO11ii = new IiO11ii(o0IiOio0lo0, oOOO1o);
/* 118 */                   iiO11ii.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iiIii10O(iiO11ii, 10));
/* 120 */                   return iiO11ii;
                        }
/* 46 */                if (i == 1) {
/* 81 */                    IiO1IIi11o iiO1IIi11o = new IiO1IIi11o(o0IiOio0lo0, oOOO1o);
/* 97 */                    iiO1IIi11o.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iiIii10O(iiO1IIi11o, 11));
/* 99 */                    return iiO1IIi11o;
                        }
/* 48 */                if (i == 2) {
/* 52 */                    IiO1OioIoI iiO1OioIoI = new IiO1OioIoI(o0IiOio0lo0, oOOO1o);
/* 55 */                    O0oI01I0oo o0oI01I0oo2 = O0oI01I0oo.I00iOIl;
/* 61 */                    I01iiIii10O i01iiIii10O2 = new I01iiIii10O(12);
/* 64 */                    i01iiIii10O2.I00iiI = iiO1OioIoI;
/* 66 */                    VarHandle.storeStoreFence();
/* 73 */                    iiO1OioIoI.I00o0l1o1o0 = l0oi0lOi11i.I00000oIO(o0oI01I0oo2, i01iiIii10O2);
/* 75 */                    VarHandle.storeStoreFence();
/* 78 */                    return iiO1OioIoI;
                        }
                    } else {
/* 150 */               if (i == -1) {
/* 185 */                   return new IiOO0oloI0(o0IiOio0lo0, oOOO1o);
                        }
/* 152 */               if (i == 0) {
/* 179 */                   return new IiOIOIli(o0IiOio0lo0, oOOO1o);
                        }
/* 154 */               if (i == 1) {
/* 173 */                   return new IiOIl1III0l(o0IiOio0lo0, oOOO1o);
                        }
/* 156 */               if (i == 2) {
/* 160 */                   return new IiOO0Il(o0IiOio0lo0, oOOO1o);
                        }
                    }
/* 166 */           IoOOl0iOl1io.I001IIilI0O("Unsupported property: ", oOOO1o);
/* 169 */           return null;
                }

                @Override
                public void I001lIiIIo1O(IInterface iInterface, OOoolO01Ioo oOoolO01Ioo) {
/* 1 */             IoOl0I1Io1O ioOl0I1Io1O = (IoOl0I1Io1O) iInterface;
/* 5 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.I00iiI;
/* 13 */            String strI0000Il00O = remoteListenableDelegatingWorker.getInputData().I0000Il00O("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
/* 17 */            if (strI0000Il00O != null) {
/* 30 */                ioOl0I1Io1O.I001IIilI0O(oOoolO01Ioo, l1oOOloO0.I00000oIO(new OIoo0oi0lIO0(strI0000Il00O, remoteListenableDelegatingWorker.I00000oOI)));
                    } else {
/* 36 */                I000II.I000iOII("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                    }
                }

                @Override
                public Object I001lloI(Illlil illlil, Object obj) {
/* 9 */             return new IiO11010IiO((O0IiOio0lo0) this.I00iiI, illlil);
                }

                @Override
                public Object I00II0Ol1O0l(OI000ilOol oI000ilOol, Object obj) {
/* 1 */             return null;
                }

                @Override
                public void I00II0oii1o(Throwable th) throws Exception {
                    switch (this.I00iOIl) {
                        case 13:
/* 11 */                    ((Ioi0ololOi) this.I00iiI).close();
                            break;
                    }
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             return null;
                }

                @Override
                public Object I00IO1oi11O(String str) {
/* 6 */             return ((Il0OlI) this.I00iiI).I0000oI00(str, null);
                }

                @Override
                public Object I00IioO0OiOi(OIo0l0 oIo0l0, Object obj) {
/* 1 */             return null;
                }

                @Override
                public void I00IlilI0i0i(O1illlIiilIl o1illlIiilIl) {
/* 3 */             Toolbar toolbar = (Toolbar) this.I00iiI;
/* 7 */             I0I1ii0i i0I1ii0i = toolbar.I00iOIl.I00oIiI10;
/* 9 */             if (i0I1ii0i == null || !i0I1ii0i.I000OiO()) {
/* 24 */                Iterator it = ((CopyOnWriteArrayList) toolbar.I010101Oo1lO.I00iiO).iterator();
/* 32 */                while (it.hasNext()) {
/* 42 */                    ((Ill111iO) it.next()).I00000oIO.I0010o();
                        }
                    }
                }

                @Override
                public I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 10 */            return ((OillOo0) this.I00iiI).I00Io1lO(j, i110ooool, i110ooool2, i110ooool3);
                }

                @Override
                public I110ooool I00Io1o110i(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 5 */             return ((OillOo0) this.I00iiI).I00Io1o110i(i110ooool, i110ooool2, i110ooool3);
                }

                public Object I00IoIO0lI(IOIO10lo iOIO10lo, Object obj) {
/* 1 */             return I001lloI(iOIO10lo, obj);
                }

                public IIloOI I00IoO0() {
/* 4 */             IIloOI iIloOI = new IIloOI(4);
/* 11 */            iIloOI.I00iiI = (BitSet) this.I00iiI;
/* 13 */            VarHandle.storeStoreFence();
/* 29 */            return iIloOI;
                }

                public void I00IoiI(char c) {
/* 3 */             if (c <= 127) {
/* 9 */                 ((BitSet) this.I00iiI).set(c);
                    } else {
/* 15 */                I000II.I000iOII("Can only match ASCII characters");
                    }
                }

                public Ii0oiilIloiO I00Iooi00oi() {
/* 8 */             return new Ii0oiilIloiO((ByteArrayOutputStream) this.I00iiI, 1);
                }

                public Ii10I1oIl0l I00O0i0ii() {
/* 8 */             return new Ii10I1oIl0l((ByteArrayOutputStream) this.I00iiI, 1);
                }

                public void I00OIO1(IIl0001i1o01 iIl0001i1o01) {
/* 3 */             if (iIl0001i1o01.I00000oOI) {
/* 49 */                return;
                    }
/* 7 */             I0oiil10Ili i0oiil10Ili = (I0oiil10Ili) this.I00iiI;
                    synchronized (((ArrayList) i0oiil10Ili.I00ilI0I1)) {
/* 18 */                ((ArrayList) i0oiil10Ili.I00ilI0I1).remove(iIl0001i1o01);
                    }
                }

                public void I00OIo(char c, char c2) {
/* 1 */             while (c <= c2) {
/* 3 */                 I00IoiI(c);
/* 8 */                 c = (char) (c + 1);
                    }
                }

                public void I00OOll1(int i) throws IOException {
/* 5 */             ((ByteArrayOutputStream) this.I00iiI).write(i);
                }

                public void I00OilO00Il(byte[] bArr, int i, int i2) throws IOException {
/* 5 */             ((ByteArrayOutputStream) this.I00iiI).write(bArr, i, i2);
                }

                public void I00Oio(int i) throws IOException {
/* 3 */             if (i < 128) {
/* 5 */                 I00OOll1(i);
/* 8 */                 return;
                    }
/* 9 */             int i2 = 5;
/* 10 */            byte[] bArr = new byte[5];
                    while (true) {
                        int i3 = i2 - 1;
/* 15 */                bArr[i3] = (byte) i;
/* 17 */                i >>>= 8;
/* 19 */                if (i == 0) {
                            int i4 = i2 - 2;
/* 27 */                    bArr[i4] = (byte) ((5 - i3) | Barcode.FORMAT_ITF);
/* 31 */                    I00OilO00Il(bArr, i4, 6 - i3);
/* 34 */                    return;
                        }
/* 35 */                i2 = i3;
                    }
                }

                public void I00Ol00(I00IO1oi11O[] i00IO1oi11OArr) {
/* 3 */             for (I00IO1oi11O i00IO1oi11O : i00IO1oi11OArr) {
/* 12 */                i00IO1oi11O.I0000O().I000oI1ioi(this, true);
                    }
                }

                public void I00Ol10(int i, boolean z, byte[] bArr) {
/* 1 */             I00i01iIIliI(i, z);
/* 5 */             I00Oio(bArr.length);
/* 10 */            I00OilO00Il(bArr, 0, bArr.length);
                }

                public void I00Ol1ll1(int i, boolean z, I00IO1oi11O[] i00IO1oi11OArr) throws IOException {
/* 1 */             I00i01iIIliI(i, z);
/* 6 */             I00OOll1(Barcode.FORMAT_ITF);
/* 9 */             I00Ol00(i00IO1oi11OArr);
/* 13 */            I00OOll1(0);
/* 16 */            I00OOll1(0);
                }

                public void I00OloOo(int i, int i2) throws IOException {
/* 3 */             if (i2 < 31) {
/* 6 */                 I00OOll1(i | i2);
/* 9 */                 return;
                    }
/* 11 */            byte[] bArr = new byte[6];
/* 16 */            int i3 = 5;
/* 17 */            bArr[5] = (byte) (i2 & 127);
/* 21 */            while (i2 > 127) {
/* 23 */                i2 >>>= 7;
                        i3--;
/* 32 */                bArr[i3] = (byte) ((i2 & 127) | Barcode.FORMAT_ITF);
                    }
                    int i4 = i3 - 1;
/* 39 */            bArr[i4] = (byte) (i | 31);
/* 43 */            I00OilO00Il(bArr, i4, 6 - i4);
                }

                public void I00i01iIIliI(int i, boolean z) throws IOException {
/* 1 */             if (z) {
/* 3 */                 I00OOll1(i);
                    }
                }

                public void I00i0O(I00OIO1 i00oio1) {
/* 2 */             i00oio1.I000oI1ioi(this, true);
                }

                public void I00i0ilIl0i(I00OIO1[] i00oio1Arr) {
/* 3 */             for (I00OIO1 i00oio1 : i00oio1Arr) {
/* 8 */                 i00oio1.I000oI1ioi(this, true);
                    }
                }

                @Override
/* 28 */        public void I000OOo1O() {
                }

/* 48 */        private final void I00OIl(Throwable th) {
                }

                @Override
/* 88 */        public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
                }

                @Override
/* 88 */        public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
                }

/* 123 */       public O1OIll00i(Object obj, int i) {
/* 124 */           this.I00iOIl = i;
                    this.I00iiI = obj;
                }

/* 124 */       public O1OIll00i(int i) {
/* 125 */           this.I00iOIl = i;
                }

/* 125 */       public O1OIll00i() {
                    this.I00iOIl = 6;
/* 127 */           this.I00iiI = OI0oiliol10O.I000OOo1O();
                }

                @Override
/* 214 */       public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
                }
            }

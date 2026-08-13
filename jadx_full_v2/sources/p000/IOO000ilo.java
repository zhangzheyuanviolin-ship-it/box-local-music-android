            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.LocaleList;
            import android.os.PersistableBundle;
            import android.os.Trace;
            import android.text.Editable;
            import android.text.Selection;
            import android.util.Base64;
            import android.util.Log;
            import android.view.KeyEvent;
            import com.box.gallery.R;
            import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.zip.Adler32;
            import kotlin.jvm.functions.Function1;
            
/* 23 */    public final class IOO000ilo implements IoIo10lOo1, IlIIIi, Illo1O0O10l, OiIiloli0I {
                public static volatile IOO000ilo I00ilI0I1;
                public static final Object I00ilO0 = new Object();
                public static final IOO000ilo I00io1l;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                static {
/* 10 */            Object obj = null;
/* 15 */            I00io1l = new IOO000ilo(obj, obj, obj, 2);
                }

                public IOO000ilo() {
/* 3 */             this.I00iOIl = 29;
/* 15 */            this.I00iiI = new AtomicReference(iO1010o.I00000oIO);
/* 22 */            this.I00iiO = new Object();
                }

                public static IOO000ilo I000lI(IOO000ilo iOO000ilo, OIIlIII0Ili oIIlIII0Ili, Oo0iil0o0oI oo0iil0o0oI, O0ll1IIi o0ll1IIi, int i) {
                    Object obj = oIIlIII0Ili;
/* 3 */             if ((i & 1) != 0) {
/* 7 */                 obj = (O0iOOo0Ii) iOO000ilo.I00iiI;
                    }
/* 11 */            if ((i & 2) != 0) {
/* 15 */                oo0iil0o0oI = (Oo0iil0o0oI) iOO000ilo.I00iiO;
                    }
/* 19 */            if ((i & 4) != 0) {
/* 23 */                o0ll1IIi = (O0ll1IIi) iOO000ilo.I00iio;
                    }
/* 25 */            iOO000ilo.getClass();
/* 31 */            return new IOO000ilo(obj, oo0iil0o0oI, o0ll1IIi, 2);
                }

                public static boolean I000oI1ioi(Editable editable, KeyEvent keyEvent, boolean z) {
                    OoOlI0ii[] ooOlI0iiArr;
/* 10 */            if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
/* 13 */                int selectionStart = Selection.getSelectionStart(editable);
/* 17 */                int selectionEnd = Selection.getSelectionEnd(editable);
/* 22 */                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ooOlI0iiArr = (OoOlI0ii[]) editable.getSpans(selectionStart, selectionEnd, OoOlI0ii.class)) != null && ooOlI0iiArr.length > 0) {
/* 44 */                    for (OoOlI0ii ooOlI0ii : ooOlI0iiArr) {
/* 48 */                        int spanStart = editable.getSpanStart(ooOlI0ii);
/* 52 */                        int spanEnd = editable.getSpanEnd(ooOlI0ii);
/* 56 */                        if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
/* 68 */                            editable.delete(spanStart, spanEnd);
/* 71 */                            return true;
                                }
                            }
                        }
                    }
/* 9 */             return false;
                }

                public static IOO000ilo I001IO000(Context context) {
/* 3 */             if (I00ilI0I1 == null) {
                        synchronized (I00ilO0) {
                            try {
/* 10 */                        if (I00ilI0I1 == null) {
/* 15 */                            IOO000ilo iOO000ilo = new IOO000ilo(1);
/* 22 */                            iOO000ilo.I00iio = context.getApplicationContext();
/* 29 */                            iOO000ilo.I00iiO = new HashSet();
/* 36 */                            iOO000ilo.I00iiI = new HashMap();
/* 38 */                            VarHandle.storeStoreFence();
/* 41 */                            I00ilI0I1 = iOO000ilo;
                                }
                            } finally {
                            }
                        }
                    }
/* 50 */            return I00ilI0I1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
                
                    if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
                
                    if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
                 */
                /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I001l0I00(IiooI1I10 iiooI1I10, Editable editable, int i, int i2, boolean z) {
                    int iMin;
/* 2 */             if (editable != null && i >= 0 && i2 >= 0) {
/* 10 */                int selectionStart = Selection.getSelectionStart(editable);
/* 14 */                int selectionEnd = Selection.getSelectionEnd(editable);
/* 19 */                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
/* 28 */                    if (z) {
/* 30 */                        int iMax = Math.max(i, 0);
/* 34 */                        int length = editable.length();
/* 38 */                        if (selectionStart < 0 || length < selectionStart || iMax < 0) {
/* 45 */                            selectionStart = -1;
/* 94 */                            int iMax2 = Math.max(i2, 0);
/* 98 */                            iMin = editable.length();
/* 102 */                           if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
/* 109 */                               iMin = -1;
/* 161 */                               if (selectionStart != -1 && iMin != -1) {
                                        }
                                    } else {
                                        loop2: while (true) {
/* 111 */                                   boolean z2 = false;
                                            while (true) {
/* 112 */                                       if (iMax2 == 0) {
/* 114 */                                           iMin = selectionEnd;
                                                    break loop2;
                                                }
/* 116 */                                       if (selectionEnd >= iMin) {
/* 118 */                                           if (z2) {
                                                        break;
                                                    }
                                                } else {
/* 121 */                                           char cCharAt = editable.charAt(selectionEnd);
/* 125 */                                           if (z2) {
                                                        break;
                                                    }
/* 143 */                                           if (!Character.isSurrogate(cCharAt)) {
                                                        iMax2--;
/* 147 */                                               selectionEnd++;
                                                    } else {
/* 154 */                                               if (Character.isLowSurrogate(cCharAt)) {
                                                            break loop2;
                                                        }
/* 157 */                                               selectionEnd++;
/* 159 */                                               z2 = true;
                                                    }
                                                }
                                            }
                                            iMax2--;
/* 136 */                                   selectionEnd++;
                                        }
/* 109 */                               iMin = -1;
/* 161 */                               if (selectionStart != -1) {
                                        }
                                    }
                                } else {
                                    loop0: while (true) {
/* 47 */                                boolean z3 = false;
                                        while (true) {
/* 48 */                                    if (iMax == 0) {
                                                break loop0;
                                            }
                                            selectionStart--;
/* 53 */                                    if (selectionStart >= 0) {
/* 60 */                                        char cCharAt2 = editable.charAt(selectionStart);
/* 64 */                                        if (z3) {
                                                    break;
                                                }
/* 80 */                                        if (!Character.isSurrogate(cCharAt2)) {
                                                    iMax--;
                                                } else {
/* 89 */                                            if (Character.isHighSurrogate(cCharAt2)) {
                                                        break loop0;
                                                    }
/* 92 */                                            z3 = true;
                                                }
                                            } else {
/* 55 */                                        if (z3) {
                                                    break loop0;
                                                }
/* 58 */                                        selectionStart = 0;
                                            }
                                        }
                                        iMax--;
                                    }
/* 45 */                            selectionStart = -1;
/* 94 */                            int iMax22 = Math.max(i2, 0);
/* 98 */                            iMin = editable.length();
/* 102 */                           if (selectionEnd >= 0) {
/* 109 */                               iMin = -1;
/* 161 */                               if (selectionStart != -1) {
                                        }
                                    }
                                }
                            } else {
/* 167 */                       selectionStart = Math.max(selectionStart - i, 0);
/* 176 */                       iMin = Math.min(selectionEnd + i2, editable.length());
                            }
/* 186 */                   OoOlI0ii[] ooOlI0iiArr = (OoOlI0ii[]) editable.getSpans(selectionStart, iMin, OoOlI0ii.class);
/* 188 */                   if (ooOlI0iiArr != null && ooOlI0iiArr.length > 0) {
/* 195 */                       for (OoOlI0ii ooOlI0ii : ooOlI0iiArr) {
/* 199 */                           int spanStart = editable.getSpanStart(ooOlI0ii);
/* 203 */                           int spanEnd = editable.getSpanEnd(ooOlI0ii);
/* 207 */                           selectionStart = Math.min(spanStart, selectionStart);
/* 211 */                           iMin = Math.max(spanEnd, iMin);
                                }
/* 218 */                       int iMax3 = Math.max(selectionStart, 0);
/* 226 */                       int iMin2 = Math.min(iMin, editable.length());
/* 230 */                       iiooI1I10.beginBatchEdit();
/* 233 */                       editable.delete(iMax3, iMin2);
/* 236 */                       iiooI1I10.endBatchEdit();
/* 27 */                        return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                public void I00000oIO(O0iiOioolIi o0iiOioolIi, O001OIili o001OIili) {
/* 3 */             Oi1ol0llI oi1ol0llI = (Oi1ol0llI) this.I00iiI;
/* 7 */             Oi1ol0llI oi1ol0llI2 = (Oi1ol0llI) this.I00iiO;
/* 11 */            Oi1ol0llI oi1ol0llI3 = (Oi1ol0llI) this.I00iio;
/* 13 */            int iOrdinal = o001OIili.ordinal();
/* 17 */            if (iOrdinal == 0) {
/* 63 */                oi1ol0llI.I00000oOI(o0iiOioolIi);
/* 66 */                oi1ol0llI3.I00000oOI(o0iiOioolIi);
/* 106 */               return;
                    }
/* 20 */            if (iOrdinal == 1) {
/* 56 */                oi1ol0llI2.I00000oOI(o0iiOioolIi);
/* 59 */                oi1ol0llI3.I00000oOI(o0iiOioolIi);
/* 62 */                return;
                    }
/* 23 */            if (iOrdinal == 2) {
/* 46 */                if (o0iiOioolIi.I00l0I0l0lO1 != null) {
/* 48 */                    oi1ol0llI3.I00000oOI(o0iiOioolIi);
/* 51 */                    return;
                        } else {
/* 52 */                    oi1ol0llI.I00000oOI(o0iiOioolIi);
/* 55 */                    return;
                        }
                    }
/* 26 */            if (iOrdinal != 3) {
/* 40 */                I000II.I00000oIO();
                    } else if (o0iiOioolIi.I00l0I0l0lO1 != null) {
/* 32 */                oi1ol0llI3.I00000oOI(o0iiOioolIi);
                    } else {
/* 36 */                oi1ol0llI2.I00000oOI(o0iiOioolIi);
                    }
                }

                public I0OO1IoI0 I00000oOI() throws GeneralSecurityException {
                    O1OIll00i o1OIll00i;
                    IIOIlli0IO iIOIlli0IOI00000oIO;
/* 3 */             I0OOi0 i0OOi0 = (I0OOi0) this.I00iiI;
/* 6 */             if (i0OOi0 == null || (o1OIll00i = (O1OIll00i) this.I00iiO) == null) {
/* 178 */               IioIoO10iOiI.I000oI1ioi("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (i0OOi0.I00000oIO != ((IIOIlli0IO) o1OIll00i.I00iiI).I00000oIO.length) {
/* 172 */               IioIoO10iOiI.I000oI1ioi("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            I0OOO1l0IoO i0OOO1l0IoO = i0OOi0.I0000Il00O;
/* 27 */            I0OOO1l0IoO i0OOO1l0IoO2 = I0OOO1l0IoO.I0001Ioi1lo;
/* 29 */            if (i0OOO1l0IoO != i0OOO1l0IoO2 && ((Integer) this.I00iio) == null) {
/* 40 */                IioIoO10iOiI.I000oI1ioi("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (i0OOO1l0IoO == i0OOO1l0IoO2 && ((Integer) this.I00iio) != null) {
/* 166 */               IioIoO10iOiI.I000oI1ioi("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (i0OOO1l0IoO == i0OOO1l0IoO2) {
/* 58 */                iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (i0OOO1l0IoO == I0OOO1l0IoO.I0000oI00 || i0OOO1l0IoO == I0OOO1l0IoO.I0000O) {
/* 143 */               iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.I00iio).intValue()).array());
                    } else {
/* 75 */                if (i0OOO1l0IoO != I0OOO1l0IoO.I0000Il00O) {
/* 115 */                   IoOOl0iOl1io.I0010I0i("Unknown AesCmacParametersParameters.Variant: ", ((I0OOi0) this.I00iiI).I0000Il00O);
/* 5 */                     return null;
                        }
/* 102 */               iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.I00iio).intValue()).array());
                    }
/* 151 */           I0OOi0 i0OOi02 = (I0OOi0) this.I00iiI;
/* 153 */           I0OO1IoI0 i0OO1IoI0 = new I0OO1IoI0();
/* 156 */           i0OO1IoI0.I00000oIO = i0OOi02;
/* 158 */           i0OO1IoI0.I00000oOI = iIOIlli0IOI00000oIO;
/* 160 */           VarHandle.storeStoreFence();
/* 163 */           return i0OO1IoI0;
                }

                @Override
                public boolean I0000Il00O(OillooOlI oillooOlI) {
/* 5 */             IIl1Iloio iIl1Iloio = new IIl1Iloio();
/* 10 */            IOi0Olo0Ol iOi0Olo0Ol = new IOi0Olo0Ol();
/* 24 */            IIlIi0lIii iIlIi0lIii = new IIlIi0lIii(((IIioli) ((IIlo0i0ll) this.I00iiI)).I00iOIl, 0);
/* 29 */            IIo0OlO iIo0OlO = (IIo0OlO) this.I00iio;
/* 51 */            IIlioOio1 iIlioOio1 = new IIlioOio1(iIl1Iloio, iOi0Olo0Ol, iIlIi0lIii, iIo0OlO, new i0I11liII(), new IlOoIo(iIo0OlO.I00000oIO()), (IIlo0i0ll) this.I00iiI, null, null);
/* 55 */            Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 82 */            return ((Boolean) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1O001loIoO(this, iIlioOio1.I00000oIO(0, oillooOlI, true, null, null, il011I1OiO0I, il011I1OiO0I), null, 11))).booleanValue();
                }

                public I0Oli1l1 I0000O() throws GeneralSecurityException {
                    O1OIll00i o1OIll00i;
/* 3 */             I0OllIi1iI1 i0OllIi1iI1 = (I0OllIi1iI1) this.I00iiI;
/* 6 */             if (i0OllIi1iI1 == null || (o1OIll00i = (O1OIll00i) this.I00iiO) == null) {
/* 159 */               IioIoO10iOiI.I000oI1ioi("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (i0OllIi1iI1.I00000oIO != ((IIOIlli0IO) o1OIll00i.I00iiI).I00000oIO.length) {
/* 153 */               IioIoO10iOiI.I000oI1ioi("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            IIlIi0lIii iIlIi0lIii = i0OllIi1iI1.I0000O;
/* 27 */            IIlIi0lIii iIlIi0lIii2 = IIlIi0lIii.I00ilI0I1;
/* 29 */            if (iIlIi0lIii != iIlIi0lIii2 && ((Integer) this.I00iio) == null) {
/* 40 */                IioIoO10iOiI.I000oI1ioi("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (iIlIi0lIii == iIlIi0lIii2 && ((Integer) this.I00iio) != null) {
/* 147 */               IioIoO10iOiI.I000oI1ioi("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (iIlIi0lIii == iIlIi0lIii2) {
/* 58 */                IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (iIlIi0lIii == IIlIi0lIii.I00iio) {
/* 91 */                IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.I00iio).intValue()).array());
                    } else {
/* 97 */                if (iIlIi0lIii != IIlIi0lIii.I00iiO) {
/* 141 */                   IoOOl0iOl1io.I0010I0i("Unknown AesEaxParameters.Variant: ", ((I0OllIi1iI1) this.I00iiI).I0000O);
/* 5 */                     return null;
                        }
/* 124 */               IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.I00iio).intValue()).array());
                    }
/* 129 */           return new I0Oli1l1();
                }

                public I0i0OIo0 I0000oI00() throws GeneralSecurityException {
                    O1OIll00i o1OIll00i;
/* 3 */             I0i0l1O i0i0l1O = (I0i0l1O) this.I00iiI;
/* 6 */             if (i0i0l1O == null || (o1OIll00i = (O1OIll00i) this.I00iiO) == null) {
/* 159 */               IioIoO10iOiI.I000oI1ioi("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (i0i0l1O.I00000oIO != ((IIOIlli0IO) o1OIll00i.I00iiI).I00000oIO.length) {
/* 153 */               IioIoO10iOiI.I000oI1ioi("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            I0i0io0oOOi i0i0io0oOOi = i0i0l1O.I00000oOI;
/* 27 */            I0i0io0oOOi i0i0io0oOOi2 = I0i0io0oOOi.I00ilI0I1;
/* 29 */            if (i0i0io0oOOi != i0i0io0oOOi2 && ((Integer) this.I00iio) == null) {
/* 40 */                IioIoO10iOiI.I000oI1ioi("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (i0i0io0oOOi == i0i0io0oOOi2 && ((Integer) this.I00iio) != null) {
/* 147 */               IioIoO10iOiI.I000oI1ioi("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (i0i0io0oOOi == i0i0io0oOOi2) {
/* 58 */                IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (i0i0io0oOOi == I0i0io0oOOi.I00iio) {
/* 91 */                IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.I00iio).intValue()).array());
                    } else {
/* 97 */                if (i0i0io0oOOi != I0i0io0oOOi.I00iiO) {
/* 141 */                   IoOOl0iOl1io.I0010I0i("Unknown AesGcmSivParameters.Variant: ", ((I0i0l1O) this.I00iiI).I00000oOI);
/* 5 */                     return null;
                        }
/* 124 */               IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.I00iio).intValue()).array());
                    }
/* 129 */           return new I0i0OIo0();
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 8 */             ((OOIIlOOo) this.I00iio).I0000oI00 = null;
                }

                @Override
                public void I000II(Object obj, IoIlI1oli ioIlI1oli) {
/* 1 */             IOO00I0Ol11 iOO00I0Ol11 = (IOO00I0Ol11) obj;
/* 5 */             Object obj2 = iOO00I0Ol11.I00iOIl;
/* 7 */             IOIooi0ol1i iOIooi0ol1i = new IOIooi0ol1i();
/* 10 */            iOIooi0ol1i.I00000oIO = ioIlI1oli;
/* 12 */            iOIooi0ol1i.I00000oOI = obj2;
/* 16 */            ArrayList arrayList = new ArrayList();
/* 19 */            iOIooi0ol1i.I0000Il00O = arrayList;
/* 24 */            IIl11il0I0io iIl11il0I0io = new IIl11il0I0io(2);
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            iOO00I0Ol11.I00iiI.invoke(iOIooi0ol1i);
/* 35 */            iOO00I0Ol11.I00iiO = iIl11il0I0io;
/* 37 */            Iterator it = arrayList.iterator();
/* 45 */            while (it.hasNext()) {
/* 51 */                IoI0oI1ilOo1 ioI0oI1ilOo1 = (IoI0oI1ilOo1) it.next();
/* 57 */                ioI0oI1ilOo1.I00000oIO.I000iOII(ioIlI1oli, ioI0oI1ilOo1.I00000oOI);
                    }
                }

                @Override
                public Object I000O01llI0(Function1 function1) {
/* 5 */             Object objInvoke = ((IllOOo00lI) this.I00iiI).invoke();
/* 9 */             function1.invoke(objInvoke);
/* 16 */            Function1 function12 = (Function1) this.I00iiO;
/* 18 */            IOO00I0Ol11 iOO00I0Ol11 = new IOO00I0Ol11();
/* 21 */            iOO00I0Ol11.I00iOIl = objInvoke;
/* 23 */            iOO00I0Ol11.I00iiI = function12;
/* 31 */            iOO00I0Ol11.I00iiO = new IIl11il0I0io(3);
/* 33 */            VarHandle.storeStoreFence();
/* 77 */            return iOO00I0Ol11;
                }

                public I1lO11 I000OOo1O() {
/* 10 */            String strConcat = ((String) this.I00iiI) == null ? " backendName" : "";
/* 16 */            if (((OOIio1010OoO) this.I00iio) == null) {
/* 20 */                strConcat = strConcat.concat(" priority");
                    }
/* 28 */            if (!strConcat.isEmpty()) {
/* 63 */                I000II.I001IO000("Missing required properties:".concat(strConcat));
/* 66 */                return null;
                    }
/* 34 */            String str = (String) this.I00iiI;
/* 38 */            byte[] bArr = (byte[]) this.I00iiO;
/* 42 */            OOIio1010OoO oOIio1010OoO = (OOIio1010OoO) this.I00iio;
/* 44 */            I1lO11 i1lO11 = new I1lO11();
/* 47 */            i1lO11.I00000oIO = str;
/* 49 */            i1lO11.I00000oOI = bArr;
/* 51 */            i1lO11.I0000Il00O = oOIio1010OoO;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            return i1lO11;
                }

                public Ii10i0iO1 I000OiO() {
/* 7 */             lII11l.I00000oIO(IIlIi0lIii.class, (IIlIi0lIii) this.I00iiO);
/* 16 */            lII11l.I00000oIO(OlOO1i11110.class, (OlOO1i11110) this.I00iio);
/* 23 */            Ii10Ioo00l ii10Ioo00l = (Ii10Ioo00l) this.I00iiI;
/* 27 */            IIlIi0lIii iIlIi0lIii = (IIlIi0lIii) this.I00iiO;
/* 31 */            OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00iio;
/* 33 */            Ii10i0iO1 ii10i0iO1 = new Ii10i0iO1();
/* 36 */            ii10i0iO1.I0000Il00O = ii10Ioo00l;
/* 38 */            ii10i0iO1.I00000oIO = iIlIi0lIii;
/* 40 */            ii10i0iO1.I00000oOI = olOO1i11110;
/* 47 */            ii10i0iO1.I0000O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 4);
/* 54 */            ii10i0iO1.I0000oI00 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 3);
/* 61 */            ii10i0iO1.I0001Ioi1lo = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 2);
/* 69 */            ii10i0iO1.I000II = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 9);
/* 77 */            ii10i0iO1.I000O01llI0 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 10);
/* 85 */            ii10i0iO1.I000OOo1O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 8);
/* 92 */            ii10i0iO1.I000OiO = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 7);
/* 100 */           ii10i0iO1.I000iOII = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 11);
/* 107 */           ii10i0iO1.I000l1 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 6);
/* 115 */           ii10i0iO1.I000lI = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 12);
/* 122 */           ii10i0iO1.I000o00OoI0I = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 5);
/* 130 */           ii10i0iO1.I000oI1ioi = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 14);
/* 138 */           ii10i0iO1.I00100l0 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 13);
/* 146 */           ii10i0iO1.I00100o1O0lo = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 16);
/* 154 */           ii10i0iO1.I0010I0i = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 15);
/* 162 */           ii10i0iO1.I0010o = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 17);
/* 170 */           ii10i0iO1.I00111O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 18);
/* 178 */           ii10i0iO1.I001IIilI0O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 19);
/* 186 */           ii10i0iO1.I001IO000 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 20);
/* 194 */           ii10i0iO1.I001i1O0Ol = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 22);
/* 202 */           ii10i0iO1.I001i1lo1io = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 21);
/* 210 */           ii10i0iO1.I001iOo1i0O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 23);
/* 217 */           ii10i0iO1.I001l0I00 = new IiIio01lo();
/* 225 */           ii10i0iO1.I001lIiIIo1O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 25);
/* 233 */           ii10i0iO1.I001lllioOl = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 26);
/* 241 */           ii10i0iO1.I001lloI = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 28);
/* 249 */           ii10i0iO1.I00II0Ol1O0l = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 27);
/* 257 */           ii10i0iO1.I00II0oii1o = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 29);
/* 265 */           ii10i0iO1.I00IO1 = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 24);
/* 273 */           ii10i0iO1.I00IO1oi11O = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 30);
/* 280 */           ii10i0iO1.I00IOO = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 1);
/* 288 */           ii10i0iO1.I00IioO0OiOi = IIl001iO0Io.I000O01llI0(ii10Ioo00l, ii10i0iO1, 31);
/* 294 */           int i = 0;
/* 302 */           IiIio01lo.I00000oIO(ii10i0iO1.I001l0I00, Iiio0Ii.I00000oIO(new Ii10Oil1(ii10Ioo00l, i, i, ii10i0iO1)));
/* 305 */           VarHandle.storeStoreFence();
/* 743 */           return ii10i0iO1;
                }

                public Io1lIilI1II I000iOII() throws GeneralSecurityException {
                    O1OIll00i o1OIll00i;
                    IIOIlli0IO iIOIlli0IOI00000oIO;
/* 3 */             Io1li0o io1li0o = (Io1li0o) this.I00iiI;
/* 6 */             if (io1li0o == null || (o1OIll00i = (O1OIll00i) this.I00iiO) == null) {
/* 178 */               IioIoO10iOiI.I000oI1ioi("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (io1li0o.I00000oIO != ((IIOIlli0IO) o1OIll00i.I00iiI).I00000oIO.length) {
/* 172 */               IioIoO10iOiI.I000oI1ioi("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            Io1lOlI io1lOlI = io1li0o.I0000Il00O;
/* 27 */            Io1lOlI io1lOlI2 = Io1lOlI.I0001Ioi1lo;
/* 29 */            if (io1lOlI != io1lOlI2 && ((Integer) this.I00iio) == null) {
/* 40 */                IioIoO10iOiI.I000oI1ioi("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (io1lOlI == io1lOlI2 && ((Integer) this.I00iio) != null) {
/* 166 */               IioIoO10iOiI.I000oI1ioi("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (io1lOlI == io1lOlI2) {
/* 58 */                iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (io1lOlI == Io1lOlI.I0000oI00 || io1lOlI == Io1lOlI.I0000O) {
/* 143 */               iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.I00iio).intValue()).array());
                    } else {
/* 75 */                if (io1lOlI != Io1lOlI.I0000Il00O) {
/* 115 */                   IoOOl0iOl1io.I0010I0i("Unknown HmacParameters.Variant: ", ((Io1li0o) this.I00iiI).I0000Il00O);
/* 5 */                     return null;
                        }
/* 102 */               iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.I00iio).intValue()).array());
                    }
/* 151 */           Io1li0o io1li0o2 = (Io1li0o) this.I00iiI;
/* 153 */           Io1lIilI1II io1lIilI1II = new Io1lIilI1II();
/* 156 */           io1lIilI1II.I00000oIO = io1li0o2;
/* 158 */           io1lIilI1II.I00000oOI = iIOIlli0IOI00000oIO;
/* 160 */           VarHandle.storeStoreFence();
/* 163 */           return io1lIilI1II;
                }

                public boolean I000l1(O0iiOioolIi o0iiOioolIi) {
                    return !(o0iiOioolIi.I00l0I0l0lO1 == null) && (((OlI00Io1) ((Oi1ol0llI) this.I00iiI).I00iiI).contains(o0iiOioolIi) || ((OlI00Io1) ((Oi1ol0llI) this.I00iiO).I00iiI).contains(o0iiOioolIi));
                }

                public I1ioiIIiOl I000o00OoI0I(String str) {
/* 3 */             Context context = (Context) this.I00iiI;
/* 7 */             IOO0l0i0Oo iOO0l0i0Oo = (IOO0l0i0Oo) this.I00iiO;
/* 11 */            IOO0l0i0Oo iOO0l0i0Oo2 = (IOO0l0i0Oo) this.I00iio;
/* 15 */            I1ioiIIiOl i1ioiIIiOl = new I1ioiIIiOl();
/* 19 */            if (context == null) {
/* 59 */                IOOlIIilOl0.I000II("Null applicationContext");
/* 18 */                return null;
                    }
/* 21 */            i1ioiIIiOl.I00000oIO = context;
/* 23 */            if (iOO0l0i0Oo == null) {
/* 53 */                IOOlIIilOl0.I000II("Null wallClock");
/* 18 */                return null;
                    }
/* 25 */            i1ioiIIiOl.I00000oOI = iOO0l0i0Oo;
/* 27 */            if (iOO0l0i0Oo2 == null) {
/* 47 */                IOOlIIilOl0.I000II("Null monotonicClock");
/* 18 */                return null;
                    }
/* 29 */            i1ioiIIiOl.I0000Il00O = iOO0l0i0Oo2;
/* 31 */            if (str == null) {
/* 41 */                IOOlIIilOl0.I000II("Null backendName");
/* 18 */                return null;
                    }
/* 33 */            i1ioiIIiOl.I0000O = str;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            return i1ioiIIiOl;
                }

                public void I00100l0(Bundle bundle) throws ClassNotFoundException {
/* 3 */             HashSet hashSet = (HashSet) this.I00iiO;
/* 12 */            String string = ((Context) this.I00iio).getString(R.string.androidx_startup);
/* 16 */            if (bundle != null) {
                        try {
/* 20 */                    HashSet hashSet2 = new HashSet();
/* 35 */                    for (String str : bundle.keySet()) {
/* 52 */                        if (string.equals(bundle.getString(str, null))) {
/* 54 */                            Class<?> cls = Class.forName(str);
/* 64 */                            if (IoliIlooo1oo.class.isAssignableFrom(cls)) {
/* 66 */                                hashSet.add(cls);
                                    }
                                }
                            }
/* 70 */                    Iterator it = hashSet.iterator();
/* 78 */                    while (it.hasNext()) {
/* 86 */                        I00100o1O0lo((Class) it.next(), hashSet2);
                            }
                        } catch (ClassNotFoundException e) {
/* 98 */                    throw new IOiIIo1l(e, 8);
                        }
                    }
                }

                public Object I00100o1O0lo(Class cls, HashSet hashSet) {
                    Object objI00000oOI;
/* 3 */             HashMap map = (HashMap) this.I00iiI;
/* 11 */            if (Trace.isEnabled()) {
                        try {
/* 17 */                    lOo0I0iOi11O.I00000oIO(cls.getSimpleName());
                        } finally {
/* 142 */                   Trace.endSection();
                        }
                    }
/* 24 */            if (hashSet.contains(cls)) {
/* 140 */               throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
                    }
/* 30 */            if (map.containsKey(cls)) {
/* 106 */               objI00000oOI = map.get(cls);
                    } else {
/* 32 */                hashSet.add(cls);
                        try {
/* 44 */                    IoliIlooo1oo ioliIlooo1oo = (IoliIlooo1oo) cls.getDeclaredConstructor(null).newInstance(null);
/* 46 */                    List<Class> listI00000oIO = ioliIlooo1oo.I00000oIO();
/* 54 */                    if (!listI00000oIO.isEmpty()) {
/* 64 */                        for (Class cls2 : listI00000oIO) {
/* 76 */                            if (!map.containsKey(cls2)) {
/* 78 */                                I00100o1O0lo(cls2, hashSet);
                                    }
                                }
                            }
/* 86 */                    objI00000oOI = ioliIlooo1oo.I00000oOI((Context) this.I00iio);
/* 90 */                    hashSet.remove(cls);
/* 93 */                    map.put(cls, objI00000oOI);
                        } catch (Throwable th) {
/* 105 */                   throw new IOiIIo1l(th, 8);
                        }
                    }
/* 113 */           return objI00000oOI;
                }

                public Object I0010I0i() {
/* 1 */             long jI00000oIO = lOllI0.I00000oIO();
/* 9 */             if (jI00000oIO == Oo10IliIiI00.I00000oIO) {
/* 11 */                return this.I00iio;
                    }
/* 22 */            Oo101lOol0 oo101lOol0 = (Oo101lOol0) ((AtomicReference) this.I00iiI).get();
/* 24 */            int iI00000oIO = oo101lOol0.I00000oIO(jI00000oIO);
/* 28 */            if (iI00000oIO >= 0) {
/* 32 */                return oo101lOol0.I0000Il00O[iI00000oIO];
                    }
/* 35 */            return null;
                }

                public IIolOo I0010o() {
/* 7 */             return ((IIolilIo) this.I00iio).I00iOIl.I0000Il00O;
                }

                public O11oiiOIl0O I00111O() {
/* 1 */             LocaleList localeList = LocaleList.getDefault();
                    synchronized (((looil0O1Io1) this.I00iio)) {
                        try {
/* 12 */                    O11oiiOIl0O o11oiiOIl0O = (O11oiiOIl0O) this.I00iiO;
/* 14 */                    if (o11oiiOIl0O != null && localeList == ((LocaleList) this.I00iiI)) {
/* 23 */                        return o11oiiOIl0O;
                            }
/* 24 */                    int size = localeList.size();
/* 30 */                    ArrayList arrayList = new ArrayList(size);
/* 34 */                    for (int i = 0; i < size; i++) {
/* 45 */                        arrayList.add(new O11oOOio1iO(localeList.get(i)));
                            }
/* 55 */                    O11oiiOIl0O o11oiiOIl0O2 = new O11oiiOIl0O(arrayList);
/* 58 */                    this.I00iiI = localeList;
/* 60 */                    this.I00iiO = o11oiiOIl0O2;
/* 63 */                    return o11oiiOIl0O2;
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public IiIooOOOI I001IIilI0O() {
/* 7 */             return ((IIolilIo) this.I00iio).I00iOIl.I00000oIO;
                }

                public O0iOOoiioO I001i1O0Ol() {
/* 7 */             return ((IIolilIo) this.I00iio).I00iOIl.I00000oOI;
                }

                public List I001i1lo1io(byte[] bArr) {
/* 14 */            List list = (List) ((ConcurrentMap) this.I00iiI).get(new OOIiilIiOo(bArr));
                    return list != null ? list : Collections.EMPTY_LIST;
                }

                public long I001iOo1i0O() {
/* 7 */             return ((IIolilIo) this.I00iio).I00iOIl.I0000O;
                }

                public boolean I001lIiIIo1O(CharSequence charSequence, int i, int i2, OoOl1ol1l ooOl1ol1l) {
/* 8 */             if ((ooOl1ol1l.I0000Il00O & 3) == 0) {
/* 12 */                Ii1oOi0l ii1oOi0l = (Ii1oOi0l) this.I00iio;
/* 14 */                O1liI1Ii o1liI1IiI00000oOI = ooOl1ol1l.I00000oOI();
/* 20 */                int iI00000oIO = o1liI1IiI00000oOI.I00000oIO(8);
/* 24 */                if (iI00000oIO != 0) {
/* 33 */                    ((ByteBuffer) o1liI1IiI00000oOI.I00iiI).getShort(iI00000oIO + o1liI1IiI00000oOI.I00iOIl);
                        }
/* 36 */                ii1oOi0l.getClass();
/* 39 */                ThreadLocal threadLocal = Ii1oOi0l.I00000oOI;
/* 45 */                if (threadLocal.get() == null) {
/* 52 */                    threadLocal.set(new StringBuilder());
                        }
/* 59 */                StringBuilder sb = (StringBuilder) threadLocal.get();
/* 61 */                sb.setLength(0);
/* 64 */                while (i < i2) {
/* 70 */                    sb.append(charSequence.charAt(i));
/* 73 */                    i++;
                        }
/* 82 */                boolean zHasGlyph = ii1oOi0l.I00000oIO.hasGlyph(sb.toString());
/* 88 */                int i3 = ooOl1ol1l.I0000Il00O & 4;
/* 97 */                ooOl1ol1l.I0000Il00O = zHasGlyph ? i3 | 2 : i3 | 1;
                    }
                    return (ooOl1ol1l.I0000Il00O & 3) == 2;
                }

                public boolean I001lllioOl() {
/* 47 */            return !(((OlI00Io1) ((Oi1ol0llI) this.I00iiI).I00iiI).isEmpty() && ((OlI00Io1) ((Oi1ol0llI) this.I00iio).I00iiI).isEmpty() && ((OlI00Io1) ((Oi1ol0llI) this.I00iiO).I00iiI).isEmpty());
                }

                public Object I001lloI(CharSequence charSequence, int i, int i2, int i3, boolean z, IiooiiI01Olo iiooiiI01Olo) {
                    int i4;
                    char c;
/* 19 */            O1liIoooO o1liIoooO = (O1liIoooO) ((OillOo0) this.I00iiO).I00iio;
/* 22 */            Iiool010Oi iiool010Oi = new Iiool010Oi(0);
/* 26 */            iiool010Oi.I00000oOI = 1;
/* 28 */            iiool010Oi.I0000oI00 = o1liIoooO;
/* 30 */            iiool010Oi.I0001Ioi1lo = o1liIoooO;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            int iCodePointAt = Character.codePointAt(charSequence, i);
/* 40 */            int i5 = 0;
/* 41 */            boolean zI000o00OoI0I = true;
/* 42 */            int iCharCount = i;
                    loop0: while (true) {
/* 44 */                i4 = iCharCount;
/* 46 */                while (iCharCount < i2 && i5 < i3 && zI000o00OoI0I) {
/* 62 */                    O1liIoooO o1liIoooO2 = (O1liIoooO) ((O1liIoooO) iiool010Oi.I0001Ioi1lo).I00000oIO.get(iCodePointAt);
/* 67 */                    if (iiool010Oi.I00000oOI == 2) {
/* 84 */                        if (o1liIoooO2 != null) {
/* 86 */                            iiool010Oi.I0001Ioi1lo = o1liIoooO2;
                                    iiool010Oi.I0000O++;
                                } else {
/* 97 */                            if (iCodePointAt == 65038) {
/* 99 */                                iiool010Oi.I00000oIO();
                                    } else if (iCodePointAt != 65039) {
/* 111 */                               O1liIoooO o1liIoooO3 = (O1liIoooO) iiool010Oi.I0001Ioi1lo;
/* 115 */                               if (o1liIoooO3.I00000oOI != null) {
/* 119 */                                   if (iiool010Oi.I0000O != 1) {
/* 142 */                                       iiool010Oi.I000II = o1liIoooO3;
/* 144 */                                       iiool010Oi.I00000oIO();
                                            } else if (iiool010Oi.I00000oOI()) {
/* 131 */                                       iiool010Oi.I000II = (O1liIoooO) iiool010Oi.I0001Ioi1lo;
/* 133 */                                       iiool010Oi.I00000oIO();
                                            } else {
/* 138 */                                       iiool010Oi.I00000oIO();
                                            }
/* 136 */                                   c = 3;
                                        } else {
/* 148 */                                   iiool010Oi.I00000oIO();
                                        }
                                    }
/* 74 */                            c = 1;
                                }
/* 82 */                        c = 2;
                            } else if (o1liIoooO2 == null) {
/* 71 */                        iiool010Oi.I00000oIO();
/* 74 */                        c = 1;
                            } else {
/* 76 */                        iiool010Oi.I00000oOI = 2;
/* 78 */                        iiool010Oi.I0001Ioi1lo = o1liIoooO2;
/* 80 */                        iiool010Oi.I0000O = 1;
/* 82 */                        c = 2;
                            }
/* 152 */                   iiool010Oi.I0000Il00O = iCodePointAt;
/* 154 */                   if (c == 1) {
/* 212 */                       iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
/* 213 */                       if (iCharCount < i2) {
/* 215 */                           iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                                }
                            } else if (c == 2) {
/* 193 */                       int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
/* 194 */                       if (iCharCount2 < i2) {
/* 196 */                           iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                                }
/* 201 */                       iCharCount = iCharCount2;
                            } else if (c == 3) {
/* 161 */                       if (z || !I001lIiIIo1O(charSequence, i4, iCharCount, ((O1liIoooO) iiool010Oi.I000II).I00000oOI)) {
/* 181 */                           zI000o00OoI0I = iiooiiI01Olo.I000o00OoI0I(charSequence, i4, iCharCount, ((O1liIoooO) iiool010Oi.I000II).I00000oOI);
/* 185 */                           i5++;
                                }
                            }
                        }
                        break loop0;
                    }
/* 224 */           if (iiool010Oi.I00000oOI == 2 && ((O1liIoooO) iiool010Oi.I0001Ioi1lo).I00000oOI != null && ((iiool010Oi.I0000O > 1 || iiool010Oi.I00000oOI()) && i5 < i3 && zI000o00OoI0I && (z || !I001lIiIIo1O(charSequence, i4, iCharCount, ((O1liIoooO) iiool010Oi.I0001Ioi1lo).I00000oOI)))) {
/* 268 */               iiooiiI01Olo.I000o00OoI0I(charSequence, i4, iCharCount, ((O1liIoooO) iiool010Oi.I0001Ioi1lo).I00000oOI);
                    }
/* 271 */           return iiooiiI01Olo.I000l1();
                }

                public void I00II0Ol1O0l(I1lO11 i1lO11, int i, boolean z) {
/* 9 */             I1lIl000I1lI i1lIl000I1lI = (I1lIl000I1lI) this.I00iio;
/* 15 */            Context context = (Context) this.I00iiI;
/* 19 */            ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
/* 28 */            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
/* 32 */            Adler32 adler32 = new Adler32();
/* 49 */            adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
/* 52 */            String str = i1lO11.I00000oIO;
/* 62 */            adler32.update(str.getBytes(Charset.forName("UTF-8")));
/* 66 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
/* 70 */            OOIio1010OoO oOIio1010OoO = i1lO11.I0000Il00O;
/* 84 */            adler32.update(byteBufferAllocate.putInt(OOIioI1.I00000oIO(oOIio1010OoO)).array());
/* 87 */            byte[] bArr = i1lO11.I00000oOI;
/* 89 */            if (bArr != null) {
/* 91 */                adler32.update(bArr);
                    }
/* 98 */            int value = (int) adler32.getValue();
/* 103 */           if (!z) {
/* 109 */               Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
                        while (true) {
/* 117 */                   if (!it.hasNext()) {
                                break;
                            }
/* 119 */                   JobInfo next = it.next();
/* 129 */                   int i2 = next.getExtras().getInt("attemptNumber");
/* 137 */                   if (next.getId() == value) {
/* 139 */                       if (i2 >= i) {
/* 143 */                           l11I1i.I00000oIO("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", i1lO11);
/* 146 */                           return;
                                }
                            }
                        }
                    }
/* 169 */           Cursor cursorRawQuery = ((OiIIilol0iO) this.I00iiO).I00000oIO().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(OOIioI1.I00000oIO(oOIio1010OoO))});
                    try {
/* 191 */               Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
/* 195 */               cursorRawQuery.close();
/* 198 */               long jLongValue = lValueOf.longValue();
/* 204 */               JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
/* 214 */               builder.setMinimumLatency(i1lIl000I1lI.I00000oIO(oOIio1010OoO, jLongValue, i));
/* 225 */               Set set = ((I1lIl0OolO) i1lIl000I1lI.I00000oOI.get(oOIio1010OoO)).I0000Il00O;
/* 234 */               if (set.contains(OiOII0OOOi.I00iOIl)) {
/* 237 */                   builder.setRequiredNetworkType(2);
                        } else {
/* 241 */                   builder.setRequiredNetworkType(1);
                        }
/* 250 */               if (set.contains(OiOII0OOOi.I00iiO)) {
/* 252 */                   builder.setRequiresCharging(true);
                        }
/* 261 */               if (set.contains(OiOII0OOOi.I00iiI)) {
/* 263 */                   builder.setRequiresDeviceIdle(true);
                        }
/* 268 */               PersistableBundle persistableBundle = new PersistableBundle();
/* 271 */               persistableBundle.putInt("attemptNumber", i);
/* 276 */               persistableBundle.putString("backendName", str);
/* 285 */               persistableBundle.putInt("priority", OOIioI1.I00000oIO(oOIio1010OoO));
/* 288 */               if (bArr != null) {
/* 297 */                   persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
                        }
/* 300 */               builder.setExtras(persistableBundle);
/* 319 */               Object[] objArr = {i1lO11, Integer.valueOf(value), Long.valueOf(i1lIl000I1lI.I00000oIO(oOIio1010OoO, jLongValue, i)), lValueOf, Integer.valueOf(i)};
/* 334 */               if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
/* 338 */                   String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
                        }
/* 345 */               jobScheduler.schedule(builder.build());
                    } catch (Throwable th) {
/* 350 */               cursorRawQuery.close();
/* 408 */               throw th;
                    }
                }

                @Override
                public void I00II0oii1o(Throwable th) {
/* 6 */             ((OOIIlOOo) this.I00iio).I0000oI00 = null;
/* 10 */            ArrayList arrayList = (ArrayList) this.I00iiI;
/* 16 */            if (arrayList.isEmpty()) {
/* 77 */                return;
                    }
/* 18 */            Iterator it = arrayList.iterator();
/* 26 */            while (it.hasNext()) {
/* 40 */                ((IIllOioOlolI) this.I00iiO).I001i1O0Ol((IIl1Ol) it.next());
                    }
/* 44 */            arrayList.clear();
                }

                public void I00IO1(Object obj) {
/* 1 */             long jI00000oIO = lOllI0.I00000oIO();
/* 9 */             if (jI00000oIO == Oo10IliIiI00.I00000oIO) {
/* 11 */                this.I00iio = obj;
/* 13 */                return;
                    }
                    synchronized (this.I00iiO) {
/* 25 */                Oo101lOol0 oo101lOol0 = (Oo101lOol0) ((AtomicReference) this.I00iiI).get();
/* 27 */                int iI00000oIO = oo101lOol0.I00000oIO(jI00000oIO);
/* 31 */                if (iI00000oIO < 0) {
/* 41 */                    ((AtomicReference) this.I00iiI).set(oo101lOol0.I00000oOI(jI00000oIO, obj));
                        } else {
/* 50 */                    oo101lOol0.I0000Il00O[iI00000oIO] = obj;
                        }
                    }
                }

                public void I00IO1oi11O(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.I00iiI = str;
                    } else {
/* 8 */                 IOOlIIilOl0.I000II("Null backendName");
                    }
                }

                public void I00IOO(IIolOo iIolOo) {
/* 7 */             ((IIolilIo) this.I00iio).I00iOIl.I0000Il00O = iIolOo;
                }

                public void I00IioO0OiOi(IiIooOOOI iiIooOOOI) {
/* 7 */             ((IIolilIo) this.I00iio).I00iOIl.I00000oIO = iiIooOOOI;
                }

                public void I00IlilI0i0i(O0iOOoiioO o0iOOoiioO) {
/* 7 */             ((IIolilIo) this.I00iio).I00iOIl.I00000oOI = o0iOOoiioO;
                }

                public void I00Io1lO(long j) {
/* 7 */             ((IIolilIo) this.I00iio).I00iOIl.I0000O = j;
                }

                public void I00Io1o110i() {
/* 3 */             OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) this.I00iiO;
/* 7 */             String str = (String) this.I00iio;
/* 13 */            List list = (List) oI10I1IoI0Ol.I000iOII(str);
/* 15 */            if (list != null) {
/* 21 */                list.remove((IllOOo00lI) this.I00iiI);
                    }
/* 25 */            List list2 = list;
/* 27 */            if (list2 == null || list2.isEmpty()) {
/* 55 */                return;
                    }
/* 36 */            oI10I1IoI0Ol.I000lI(str, list);
                }

                @Override
                public I1OoollI1Il1 getKey() {
/* 3 */             return (I1OoollI1Il1) this.I00iio;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 13 */                    String str = (String) this.I00iio;
/* 17 */                    String str2 = (String) this.I00iiO;
/* 23 */                    StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
/* 28 */                    Uri uri = (Uri) this.I00iiI;
/* 30 */                    if (uri != null) {
/* 34 */                        sb.append(" uri=");
/* 41 */                        sb.append(String.valueOf(uri));
                            }
/* 44 */                    if (str2 != null) {
/* 48 */                        sb.append(" action=");
/* 51 */                        sb.append(str2);
                            }
/* 54 */                    if (str != null) {
/* 58 */                        sb.append(" mimetype=");
/* 61 */                        sb.append(str);
                            }
/* 66 */                    sb.append(" }");
/* 69 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 24 */        public IOO000ilo(Object obj, Object obj2, Object obj3, int i) {
/* 25 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                    this.I00iio = obj3;
                }

/* 25 */        public IOO000ilo(int i) {
/* 26 */            this.I00iOIl = i;
                }

/* 26 */        public IOO000ilo(Runnable runnable) {
                    this.I00iOIl = 20;
/* 28 */            this.I00iiO = new CopyOnWriteArrayList();
/* 29 */            this.I00iio = new HashMap();
/* 30 */            this.I00iiI = runnable;
                }
            }

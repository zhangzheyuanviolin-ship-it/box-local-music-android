            package p000;

            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.Flushable;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class IiiI0l01O implements Closeable, Flushable {
                public static final OOoiliiIoloI I00o101lO = new OOoiliiIoloI("[a-z0-9_-]{1,120}");
                public OO0IIO1Il I00iOIl;
                public long I00iiI;
                public OO0IIO1Il I00iiO;
                public OO0IIO1Il I00iio;
                public OO0IIO1Il I00ilI0I1;
                public LinkedHashMap I00ilO0;
                public IIOlO1ii I00io1l;
                public long I00ioIO;
                public int I00l0I0l0lO1;
                public OOliIlo01o I00l0OO0IO;
                public boolean I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public Iii1ooOoII I00o0l1o1o0;

                public static void I00Io1lO(String str) {
/* 7 */             if (I00o101lO.I0000O(str)) {
/* 9 */                 return;
                    }
/* 18 */            I000II.I0010I0i(IIl001iO0Io.I000iOII('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
                }

                /* JADX WARN: Removed duplicated region for block: B:59:0x0114 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x007f, B:34:0x0086, B:27:0x005c, B:29:0x006a, B:38:0x00a6, B:40:0x00ad, B:43:0x00b2, B:45:0x00c0, B:48:0x00c5, B:53:0x0100, B:55:0x010b, B:59:0x0114, B:49:0x00dd, B:51:0x00f2, B:52:0x00fd, B:37:0x0096, B:62:0x0119, B:63:0x0120), top: B:66:0x0001 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized void I00000oIO(I1ii1l10IO i1ii1l10IO, boolean z) {
/* 4 */             Iii1lol iii1lol = (Iii1lol) i1ii1l10IO.I00000oOI;
/* 12 */            if (!O0000Ioio00.I0000O(iii1lol.I000II, i1ii1l10IO)) {
/* 289 */               throw new IllegalStateException("Check failed.");
                    }
/* 16 */            if (!z || iii1lol.I0001Ioi1lo) {
/* 149 */               for (int i = 0; i < 2; i++) {
/* 161 */                   this.I00o0l1o1o0.I000O01llI0((OO0IIO1Il) iii1lol.I0000O.get(i));
                        }
                    } else {
/* 23 */                for (int i2 = 0; i2 < 2; i2++) {
/* 31 */                    if (((boolean[]) i1ii1l10IO.I0000Il00O)[i2] && !this.I00o0l1o1o0.I000l1((OO0IIO1Il) iii1lol.I0000O.get(i2))) {
/* 49 */                        i1ii1l10IO.I00000oOI(false);
/* 53 */                        return;
                            }
                        }
/* 61 */                for (int i3 = 0; i3 < 2; i3++) {
/* 69 */                    OO0IIO1Il oO0IIO1Il = (OO0IIO1Il) iii1lol.I0000O.get(i3);
/* 77 */                    OO0IIO1Il oO0IIO1Il2 = (OO0IIO1Il) iii1lol.I0000Il00O.get(i3);
/* 81 */                    boolean zI000l1 = this.I00o0l1o1o0.I000l1(oO0IIO1Il);
/* 85 */                    Iii1ooOoII iii1ooOoII = this.I00o0l1o1o0;
/* 87 */                    if (zI000l1) {
/* 89 */                        iii1ooOoII.I0000Il00O(oO0IIO1Il, oO0IIO1Il2);
                            } else {
/* 99 */                        OO0IIO1Il oO0IIO1Il3 = (OO0IIO1Il) iii1lol.I0000Il00O.get(i3);
/* 105 */                       if (!iii1ooOoII.I000l1(oO0IIO1Il3)) {
/* 111 */                           I000O01llI0.I00000oIO(iii1ooOoII.I00IOO(oO0IIO1Il3));
                                }
                            }
/* 116 */                   long j = iii1lol.I00000oOI[i3];
/* 124 */                   Long l = this.I00o0l1o1o0.I001i1lo1io(oO0IIO1Il2).I0000O;
/* 133 */                   long jLongValue = l != null ? l.longValue() : 0L;
/* 137 */                   iii1lol.I00000oOI[i3] = jLongValue;
/* 143 */                   this.I00ioIO = (this.I00ioIO - j) + jLongValue;
                        }
                    }
/* 168 */           iii1lol.I000II = null;
/* 172 */           if (iii1lol.I0001Ioi1lo) {
/* 174 */               I00IOO(iii1lol);
/* 178 */               return;
                    }
                    this.I00l0I0l0lO1++;
/* 185 */           OOliIlo01o oOliIlo01o = this.I00l0OO0IO;
/* 191 */           if (z || iii1lol.I0000oI00) {
/* 222 */               iii1lol.I0000oI00 = true;
/* 226 */               oOliIlo01o.I00OilO00Il("CLEAN");
/* 229 */               oOliIlo01o.writeByte(32);
/* 234 */               oOliIlo01o.I00OilO00Il(iii1lol.I00000oIO);
/* 241 */               for (long j2 : iii1lol.I00000oOI) {
/* 245 */                   oOliIlo01o.writeByte(32);
/* 248 */                   oOliIlo01o.I0000Il00O(j2);
                        }
/* 254 */               oOliIlo01o.writeByte(10);
                    } else {
/* 202 */               this.I00ilO0.remove(iii1lol.I00000oIO);
/* 207 */               oOliIlo01o.I00OilO00Il("REMOVE");
/* 210 */               oOliIlo01o.writeByte(32);
/* 215 */               oOliIlo01o.I00OilO00Il(iii1lol.I00000oIO);
/* 218 */               oOliIlo01o.writeByte(10);
                    }
/* 257 */           oOliIlo01o.flush();
/* 266 */           if (this.I00ioIO > this.I00iiI) {
/* 277 */               I000l1();
                    } else if (this.I00l0I0l0lO1 >= 2000) {
                    }
                }

                public final synchronized I1ii1l10IO I0000Il00O(String str) {
/* 4 */             if (this.I00lli11) {
/* 112 */               throw new IllegalStateException("cache is closed");
                    }
/* 6 */             I00Io1lO(str);
/* 9 */             I000O01llI0();
/* 18 */            Iii1lol iii1lol = (Iii1lol) this.I00ilO0.get(str);
/* 29 */            if ((iii1lol != null ? iii1lol.I000II : null) != null) {
/* 20 */                return null;
                    }
/* 33 */            if (iii1lol != null && iii1lol.I000O01llI0 != 0) {
/* 20 */                return null;
                    }
/* 43 */            if (!this.I00lll10 && !this.I00o0iI0io1) {
/* 50 */                OOliIlo01o oOliIlo01o = this.I00l0OO0IO;
/* 54 */                oOliIlo01o.I00OilO00Il("DIRTY");
/* 59 */                oOliIlo01o.writeByte(32);
/* 62 */                oOliIlo01o.I00OilO00Il(str);
/* 67 */                oOliIlo01o.writeByte(10);
/* 70 */                oOliIlo01o.flush();
/* 75 */                if (this.I00li1OI) {
/* 20 */                    return null;
                        }
/* 79 */                if (iii1lol == null) {
/* 83 */                    iii1lol = new Iii1lol(this, str);
/* 88 */                    this.I00ilO0.put(str, iii1lol);
                        }
/* 93 */                I1ii1l10IO i1ii1l10IO = new I1ii1l10IO(this, iii1lol);
/* 96 */                iii1lol.I000II = i1ii1l10IO;
/* 99 */                return i1ii1l10IO;
                    }
/* 100 */           I000l1();
/* 20 */            return null;
                }

                public final synchronized Iii1oi1l1II I000II(String str) {
                    Iii1oi1l1II iii1oi1l1III00000oIO;
/* 4 */             if (this.I00lli11) {
/* 83 */                throw new IllegalStateException("cache is closed");
                    }
/* 6 */             I00Io1lO(str);
/* 9 */             I000O01llI0();
/* 18 */            Iii1lol iii1lol = (Iii1lol) this.I00ilO0.get(str);
/* 20 */            if (iii1lol != null && (iii1oi1l1III00000oIO = iii1lol.I00000oIO()) != null) {
/* 31 */                boolean z = true;
                        this.I00l0I0l0lO1++;
/* 35 */                OOliIlo01o oOliIlo01o = this.I00l0OO0IO;
/* 39 */                oOliIlo01o.I00OilO00Il("READ");
/* 44 */                oOliIlo01o.writeByte(32);
/* 47 */                oOliIlo01o.I00OilO00Il(str);
/* 52 */                oOliIlo01o.writeByte(10);
/* 59 */                if (this.I00l0I0l0lO1 < 2000) {
/* 62 */                    z = false;
                        }
/* 63 */                if (z) {
/* 65 */                    I000l1();
                        }
/* 72 */                return iii1oi1l1III00000oIO;
                    }
/* 74 */            return null;
                }

                public final synchronized void I000O01llI0() {
                    try {
/* 4 */                 if (this.I00ll1) {
/* 7 */                     return;
                        }
/* 12 */                this.I00o0l1o1o0.I000O01llI0(this.I00iio);
/* 23 */                if (this.I00o0l1o1o0.I000l1(this.I00ilI0I1)) {
/* 29 */                    boolean zI000l1 = this.I00o0l1o1o0.I000l1(this.I00iiO);
/* 33 */                    Iii1ooOoII iii1ooOoII = this.I00o0l1o1o0;
/* 35 */                    OO0IIO1Il oO0IIO1Il = this.I00ilI0I1;
/* 37 */                    if (zI000l1) {
/* 39 */                        iii1ooOoII.I000O01llI0(oO0IIO1Il);
                            } else {
/* 47 */                        iii1ooOoII.I0000Il00O(oO0IIO1Il, this.I00iiO);
                            }
                        }
/* 59 */                if (this.I00o0l1o1o0.I000l1(this.I00iiO)) {
                            try {
/* 61 */                        I001i1lo1io();
/* 64 */                        I00100l0();
/* 67 */                        this.I00ll1 = true;
/* 70 */                        return;
                            } catch (IOException unused) {
                                try {
/* 72 */                            close();
/* 79 */                            iO1oIOlI.I00000oIO(this.I00o0l1o1o0, this.I00iOIl);
/* 82 */                            this.I00lli11 = false;
                                } catch (Throwable th) {
/* 86 */                            this.I00lli11 = false;
/* 88 */                            throw th;
                                }
                            }
                        }
/* 89 */                I00IoiI();
/* 92 */                this.I00ll1 = true;
                    } catch (Throwable th2) {
/* 110 */               throw th2;
                    }
                }

                public final void I000l1() {
/* 11 */            iOi1II01i0.I0000O(this.I00io1l, null, null, new I1iOI0oo(this, (IOoil1iiIilo) null, 6), 3);
                }

                public final void I00100l0() {
/* 1 */             Iii1ooOoII iii1ooOoII = this.I00o0l1o1o0;
/* 9 */             Iterator it = this.I00ilO0.values().iterator();
/* 13 */            long j = 0;
/* 19 */            while (it.hasNext()) {
/* 25 */                Iii1lol iii1lol = (Iii1lol) it.next();
/* 30 */                int i = 0;
/* 31 */                if (iii1lol.I000II == null) {
/* 33 */                    while (i < 2) {
/* 39 */                        j += iii1lol.I00000oOI[i];
/* 40 */                        i++;
                            }
                        } else {
/* 44 */                    iii1lol.I000II = null;
/* 46 */                    while (i < 2) {
/* 56 */                        iii1ooOoII.I000O01llI0((OO0IIO1Il) iii1lol.I0000Il00O.get(i));
/* 67 */                        iii1ooOoII.I000O01llI0((OO0IIO1Il) iii1lol.I0000O.get(i));
/* 70 */                        i++;
                            }
/* 73 */                    it.remove();
                        }
                    }
/* 77 */            this.I00ioIO = j;
                }

                public final void I001i1lo1io() throws Throwable {
/* 5 */             Iii1ooOoII iii1ooOoII = this.I00o0l1o1o0;
/* 7 */             OO0IIO1Il oO0IIO1Il = this.I00iiO;
/* 17 */            OOliO0 oOliO0 = new OOliO0(iii1ooOoII.I00iiI.I00IioO0OiOi(oO0IIO1Il));
                    try {
/* 25 */                String strI00IoO0 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 29 */                String strI00IoO02 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 33 */                String strI00IoO03 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 37 */                String strI00IoO04 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 41 */                String strI00IoO05 = oOliO0.I00IoO0(Long.MAX_VALUE);
/* 51 */                if (!"libcore.io.DiskLruCache".equals(strI00IoO0) || !"1".equals(strI00IoO02) || !O0000Ioio00.I0000O(String.valueOf(1), strI00IoO03) || !O0000Ioio00.I0000O(String.valueOf(2), strI00IoO04) || strI00IoO05.length() > 0) {
/* 202 */                   throw new IOException("unexpected journal header: [" + strI00IoO0 + ", " + strI00IoO02 + ", " + strI00IoO03 + ", " + strI00IoO04 + ", " + strI00IoO05 + ']');
                        }
/* 89 */                int i = 0;
                        while (true) {
                            try {
/* 94 */                        I001l0I00(oOliO0.I00IoO0(Long.MAX_VALUE));
/* 97 */                        i++;
                            } catch (EOFException unused) {
/* 109 */                       this.I00l0I0l0lO1 = i - this.I00ilO0.size();
/* 115 */                       if (oOliO0.I00II0Ol1O0l()) {
/* 123 */                           Ol0i0olI ol0i0olII00000oIO = iii1ooOoII.I00iiI.I00000oIO(oO0IIO1Il);
/* 132 */                           I10iOo0il1 i10iOo0il1 = new I10iOo0il1(this, 3);
/* 135 */                           IlII1io ilII1io = new IlII1io(ol0i0olII00000oIO);
/* 138 */                           ilII1io.I00iOIl = i10iOo0il1;
/* 140 */                           VarHandle.storeStoreFence();
/* 147 */                           this.I00l0OO0IO = l1l0I1OIOIO1.I00000oIO(ilII1io);
                                } else {
/* 117 */                           I00IoiI();
                                }
                                try {
/* 149 */                           oOliO0.close();
/* 152 */                           th = null;
                                } catch (Throwable th) {
/* 154 */                           th = th;
                                }
/* 211 */                       if (th != null) {
/* 245 */                           throw th;
                                }
/* 213 */                       return;
                            }
                        }
                    } catch (Throwable th2) {
/* 100 */               th = th2;
                        try {
/* 203 */                   oOliO0.close();
                        } catch (Throwable th3) {
/* 208 */                   ilIilolOlIoO.I00000oIO(th, th3);
                        }
                    }
                }

                public final void I001l0I00(String str) throws IOException {
                    String strSubstring;
/* 1 */             LinkedHashMap linkedHashMap = this.I00ilO0;
/* 7 */             int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, ' ', 0, 6);
/* 14 */            if (iI001i1O0Ol == -1) {
/* 178 */               IioIoO10iOiI.I000OOo1O("unexpected journal line: ".concat(str));
/* 437 */               return;
                    }
/* 16 */            int i = iI001i1O0Ol + 1;
/* 19 */            int iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(str, ' ', i, 4);
/* 23 */            if (iI001i1O0Ol2 == -1) {
/* 25 */                strSubstring = str.substring(i);
/* 29 */                if (iI001i1O0Ol == 6 && OlOolloIIOl0.I000l1(str, "REMOVE", false)) {
/* 39 */                    linkedHashMap.remove(strSubstring);
/* 42 */                    return;
                        }
                    } else {
/* 43 */                strSubstring = str.substring(i, iI001i1O0Ol2);
                    }
/* 47 */            Object iii1lol = linkedHashMap.get(strSubstring);
/* 51 */            if (iii1lol == null) {
/* 55 */                iii1lol = new Iii1lol(this, strSubstring);
/* 58 */                linkedHashMap.put(strSubstring, iii1lol);
                    }
/* 61 */            Iii1lol iii1lol2 = (Iii1lol) iii1lol;
/* 64 */            if (iI001i1O0Ol2 == -1 || iI001i1O0Ol != 5 || !OlOolloIIOl0.I000l1(str, "CLEAN", false)) {
/* 133 */               if (iI001i1O0Ol2 == -1 && iI001i1O0Ol == 5 && OlOolloIIOl0.I000l1(str, "DIRTY", false)) {
/* 150 */                   iii1lol2.I000II = new I1ii1l10IO(this, iii1lol2);
/* 152 */                   return;
                        } else {
/* 153 */                   if (iI001i1O0Ol2 == -1 && iI001i1O0Ol == 4 && OlOolloIIOl0.I000l1(str, "READ", false)) {
/* 165 */                       return;
                            }
/* 170 */                   IioIoO10iOiI.I000OOo1O("unexpected journal line: ".concat(str));
/* 173 */                   return;
                        }
                    }
/* 86 */            List listI00Io1o110i = OlOoOIi0o.I00Io1o110i(str.substring(iI001i1O0Ol2 + 1), new char[]{' '});
/* 90 */            iii1lol2.I0000oI00 = true;
/* 93 */            iii1lol2.I000II = null;
/* 100 */           if (listI00Io1o110i.size() != 2) {
/* 129 */               IOOlIIilOl0.I000l1("unexpected journal line: ", listI00Io1o110i);
/* 132 */               return;
                    }
                    try {
/* 102 */               int size = listI00Io1o110i.size();
/* 106 */               for (int i2 = 0; i2 < size; i2++) {
/* 120 */                   iii1lol2.I00000oOI[i2] = Long.parseLong((String) listI00Io1o110i.get(i2));
                        }
                    } catch (NumberFormatException unused) {
/* 125 */               IOOlIIilOl0.I000l1("unexpected journal line: ", listI00Io1o110i);
                    }
                }

                public final void I00IOO(Iii1lol iii1lol) {
                    OOliIlo01o oOliIlo01o;
/* 1 */             int i = iii1lol.I000O01llI0;
/* 3 */             String str = iii1lol.I00000oIO;
/* 9 */             if (i > 0 && (oOliIlo01o = this.I00l0OO0IO) != null) {
/* 17 */                oOliIlo01o.I00OilO00Il("DIRTY");
/* 20 */                oOliIlo01o.writeByte(32);
/* 23 */                oOliIlo01o.I00OilO00Il(str);
/* 26 */                oOliIlo01o.writeByte(10);
/* 29 */                oOliIlo01o.flush();
                    }
/* 35 */            if (iii1lol.I000O01llI0 > 0 || iii1lol.I000II != null) {
/* 113 */               iii1lol.I0001Ioi1lo = true;
/* 168 */               return;
                    }
/* 44 */            for (int i2 = 0; i2 < 2; i2++) {
/* 56 */                this.I00o0l1o1o0.I000O01llI0((OO0IIO1Il) iii1lol.I0000Il00O.get(i2));
/* 59 */                long j = this.I00ioIO;
/* 61 */                long[] jArr = iii1lol.I00000oOI;
/* 66 */                this.I00ioIO = j - jArr[i2];
/* 70 */                jArr[i2] = 0;
                    }
                    this.I00l0I0l0lO1++;
/* 80 */            OOliIlo01o oOliIlo01o2 = this.I00l0OO0IO;
/* 82 */            if (oOliIlo01o2 != null) {
/* 86 */                oOliIlo01o2.I00OilO00Il("REMOVE");
/* 89 */                oOliIlo01o2.writeByte(32);
/* 92 */                oOliIlo01o2.I00OilO00Il(str);
/* 95 */                oOliIlo01o2.writeByte(10);
                    }
/* 100 */           this.I00ilO0.remove(str);
/* 107 */           if (this.I00l0I0l0lO1 >= 2000) {
/* 109 */               I000l1();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
                
                    I00IOO(r1);
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IioO0OiOi() {
/* 7 */             while (this.I00ioIO > this.I00iiI) {
/* 23 */                for (Iii1lol iii1lol : this.I00ilO0.values()) {
/* 33 */                    if (!iii1lol.I0001Ioi1lo) {
                                break;
                            }
                        }
/* 39 */                return;
                    }
/* 41 */            this.I00lll10 = false;
                }

                public final synchronized void I00IoiI() {
                    Throwable th;
                    try {
/* 2 */                 OOliIlo01o oOliIlo01o = this.I00l0OO0IO;
/* 4 */                 if (oOliIlo01o != null) {
/* 6 */                     oOliIlo01o.close();
                        }
/* 21 */                OOliIlo01o oOliIlo01oI00000oIO = l1l0I1OIOIO1.I00000oIO(this.I00o0l1o1o0.I00IOO(this.I00iio));
                        try {
/* 28 */                    oOliIlo01oI00000oIO.I00OilO00Il("libcore.io.DiskLruCache");
/* 33 */                    oOliIlo01oI00000oIO.writeByte(10);
/* 38 */                    oOliIlo01oI00000oIO.I00OilO00Il("1");
/* 41 */                    oOliIlo01oI00000oIO.writeByte(10);
/* 46 */                    oOliIlo01oI00000oIO.I0000Il00O(1L);
/* 49 */                    oOliIlo01oI00000oIO.writeByte(10);
/* 54 */                    oOliIlo01oI00000oIO.I0000Il00O(2L);
/* 57 */                    oOliIlo01oI00000oIO.writeByte(10);
/* 60 */                    oOliIlo01oI00000oIO.writeByte(10);
/* 77 */                    for (Iii1lol iii1lol : this.I00ilO0.values()) {
/* 89 */                        if (iii1lol.I000II != null) {
/* 93 */                            oOliIlo01oI00000oIO.I00OilO00Il("DIRTY");
/* 96 */                            oOliIlo01oI00000oIO.writeByte(32);
/* 101 */                           oOliIlo01oI00000oIO.I00OilO00Il(iii1lol.I00000oIO);
/* 104 */                           oOliIlo01oI00000oIO.writeByte(10);
                                } else {
/* 112 */                           oOliIlo01oI00000oIO.I00OilO00Il("CLEAN");
/* 115 */                           oOliIlo01oI00000oIO.writeByte(32);
/* 120 */                           oOliIlo01oI00000oIO.I00OilO00Il(iii1lol.I00000oIO);
/* 127 */                           for (long j : iii1lol.I00000oOI) {
/* 131 */                               oOliIlo01oI00000oIO.writeByte(32);
/* 134 */                               oOliIlo01oI00000oIO.I0000Il00O(j);
                                    }
/* 140 */                           oOliIlo01oI00000oIO.writeByte(10);
                                }
                            }
                            try {
/* 144 */                       oOliIlo01oI00000oIO.close();
/* 147 */                       th = null;
                            } catch (Throwable th2) {
/* 149 */                       th = th2;
                            }
                        } catch (Throwable th3) {
                            try {
/* 151 */                       oOliIlo01oI00000oIO.close();
                            } catch (Throwable th4) {
/* 156 */                       ilIilolOlIoO.I00000oIO(th3, th4);
                            }
/* 159 */                   th = th3;
                        }
/* 160 */               if (th != null) {
/* 245 */                   throw th;
                        }
/* 166 */               boolean zI000l1 = this.I00o0l1o1o0.I000l1(this.I00iiO);
/* 170 */               Iii1ooOoII iii1ooOoII = this.I00o0l1o1o0;
/* 172 */               if (zI000l1) {
/* 178 */                   iii1ooOoII.I0000Il00O(this.I00iiO, this.I00ilI0I1);
/* 187 */                   this.I00o0l1o1o0.I0000Il00O(this.I00iio, this.I00iiO);
/* 194 */                   this.I00o0l1o1o0.I000O01llI0(this.I00ilI0I1);
                        } else {
/* 202 */                   iii1ooOoII.I0000Il00O(this.I00iio, this.I00iiO);
                        }
/* 211 */               Ol0i0olI ol0i0olII00000oIO = this.I00o0l1o1o0.I00iiI.I00000oIO(this.I00iiO);
/* 220 */               I10iOo0il1 i10iOo0il1 = new I10iOo0il1(this, 3);
/* 223 */               IlII1io ilII1io = new IlII1io(ol0i0olII00000oIO);
/* 226 */               ilII1io.I00iOIl = i10iOo0il1;
/* 228 */               VarHandle.storeStoreFence();
/* 235 */               this.I00l0OO0IO = l1l0I1OIOIO1.I00000oIO(ilII1io);
/* 237 */               this.I00l0I0l0lO1 = 0;
/* 239 */               this.I00li1OI = false;
/* 241 */               this.I00o0iI0io1 = false;
                    } catch (Throwable th5) {
/* 743 */               throw th5;
                    }
                }

                @Override
                public final synchronized void close() {
                    try {
/* 5 */                 if (this.I00ll1 && !this.I00lli11) {
/* 28 */                    for (Iii1lol iii1lol : (Iii1lol[]) this.I00ilO0.values().toArray(new Iii1lol[0])) {
/* 32 */                        I1ii1l10IO i1ii1l10IO = iii1lol.I000II;
/* 34 */                        if (i1ii1l10IO != null) {
/* 38 */                            Iii1lol iii1lol2 = (Iii1lol) i1ii1l10IO.I00000oOI;
/* 46 */                            if (O0000Ioio00.I0000O(iii1lol2.I000II, i1ii1l10IO)) {
/* 48 */                                iii1lol2.I0001Ioi1lo = true;
                                    }
                                }
                            }
/* 55 */                    I00IioO0OiOi();
/* 61 */                    il001oo1.I00000oOI(this.I00io1l, null);
/* 66 */                    this.I00l0OO0IO.close();
/* 69 */                    this.I00l0OO0IO = null;
/* 71 */                    this.I00lli11 = true;
/* 74 */                    return;
                        }
/* 75 */                this.I00lli11 = true;
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
                }

                @Override
                public final synchronized void flush() {
/* 4 */             if (this.I00ll1) {
/* 10 */                if (this.I00lli11) {
/* 31 */                    throw new IllegalStateException("cache is closed");
                        }
/* 12 */                I00IioO0OiOi();
/* 17 */                this.I00l0OO0IO.flush();
                    }
                }
            }

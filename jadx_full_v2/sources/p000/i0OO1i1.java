            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
/* 8 */     public final class i0OO1i1 implements Runnable {
                public final int I00iOIl = 0;
                public i0OOOllloIII I00iiI;

                public i0OO1i1(i0OOOllloIII i0ooollloiii) {
/* 7 */             this.I00iiI = i0ooollloiii;
                }

                @Override
                public final void run() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i0OOOllloIII i0ooollloiii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 235 */                   i0OiOI1 i0oioi1 = (i0OiOI1) i0ooollloiii.I000O01llI0.I0000Il00O();
/* 237 */                   i0Il00O1 i0il00o1 = i0ooollloiii.I00000oIO;
/* 243 */                   o0IiOl o0iiolI000II = i0oioi1.I000II(i0il00o1.I00100l0());
/* 247 */                   i0IOo0i0 i0ioo0i0 = i0ooollloiii.I000OOo1O;
/* 253 */                   Executor executor = (Executor) i0ioo0i0.I0000Il00O();
/* 259 */                   O1OIll00i o1OIll00i = new O1OIll00i(27);
/* 262 */                   o1OIll00i.I00iiI = i0il00o1;
/* 264 */                   VarHandle.storeStoreFence();
/* 267 */                   o0iiolI000II.I0000oI00(executor, o1OIll00i);
/* 283 */                   o0iiolI000II.I0000O((Executor) i0ioo0i0.I0000Il00O(), new iOl0lOIi11(17));
                            break;
                        default:
/* 8 */                     i0Il00O1 i0il00o12 = i0ooollloiii.I00000oIO;
/* 14 */                    Iterator it = i0il00o12.I0001Ioi1lo().iterator();
                            while (true) {
/* 24 */                        int i2 = 0;
/* 25 */                        if (!it.hasNext()) {
/* 84 */                            Iterator it2 = i0il00o12.I0001Ioi1lo().iterator();
/* 92 */                            while (it2.hasNext()) {
/* 98 */                                File file = (File) it2.next();
/* 104 */                               if (file.listFiles() != null) {
/* 106 */                                   i0Il00O1.I000II(file);
/* 109 */                                   long jI00000oOI = i0Il00O1.I00000oOI(file, false);
/* 122 */                                   if (i0il00o12.I00000oOI.I00000oIO() != jI00000oOI) {
                                                try {
/* 138 */                                           new File(new File(file, String.valueOf(jI00000oOI)), "stale.tmp").createNewFile();
                                                } catch (IOException unused) {
/* 148 */                                           i0Il00O1.I0000Il00O.I00000oOI("Could not write staleness marker.", new Object[0]);
                                                }
                                            }
/* 157 */                                   for (File file2 : file.listFiles()) {
/* 161 */                                       i0Il00O1.I000II(file2);
                                            }
                                        }
                                    }
/* 182 */                           if (new File(i0il00o12.I0000O(), "_tmp").exists()) {
/* 194 */                               File[] fileArrListFiles = new File(i0il00o12.I0000O(), "_tmp").listFiles();
/* 198 */                               int length = fileArrListFiles.length;
/* 199 */                               while (i2 < length) {
/* 201 */                                   File file3 = fileArrListFiles[i2];
/* 216 */                                   if (System.currentTimeMillis() - file3.lastModified() > i0Il00O1.I0000O) {
/* 218 */                                       i0Il00O1.I000O01llI0(file3);
                                            } else {
/* 222 */                                       i0Il00O1.I000II(file3);
                                            }
/* 225 */                                   i2++;
                                        }
                                        break;
                                    }
                                } else {
/* 31 */                            File file4 = (File) it.next();
/* 37 */                            if (file4.listFiles() != null) {
/* 39 */                                File[] fileArrListFiles2 = file4.listFiles();
/* 43 */                                int length2 = fileArrListFiles2.length;
/* 44 */                                while (i2 < length2) {
/* 46 */                                    File file5 = fileArrListFiles2[i2];
/* 50 */                                    File file6 = new File(file5, "stale.tmp");
/* 57 */                                    if (file6.exists() && System.currentTimeMillis() - file6.lastModified() > i0Il00O1.I0000oI00) {
/* 74 */                                        i0Il00O1.I000O01llI0(file5);
                                            }
/* 77 */                                    i2++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }

/* 9 */         public i0OO1i1() {
                }
            }

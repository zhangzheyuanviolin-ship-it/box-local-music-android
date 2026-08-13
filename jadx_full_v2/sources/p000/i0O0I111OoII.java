            package p000;

            import com.google.android.play.core.assetpacks.bs;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.RandomAccessFile;
            import java.io.SequenceInputStream;
            import java.lang.invoke.VarHandle;
            import java.util.zip.GZIPInputStream;
            
            public final class i0O0I111OoII {
                public static final OlOilIlol1 I000II = new OlOilIlol1("ExtractChunkTaskHandler");
                public byte[] I00000oIO;
                public i0Il00O1 I00000oOI;
                public i0O0oOiO11 I0000Il00O;
                public i0OI1IOoili1 I0000O;
                public i0IOo0i0 I0000oI00;
                public i0IOo0i0 I0001Ioi1lo;

                /* JADX WARN: Can't wrap try/catch for region: R(16:160|5|(1:7)(2:8|9)|155|10|(2:12|(12:14|(2:16|(1:(7:19|167|20|(2:21|(2:23|171)(1:170))|28|(1:30)(1:31)|(1:33)(2:35|36))(2:44|45))(2:46|(10:48|(9:70|(1:72)|175|(4:73|(3:77|(1:79)(1:80)|(1:91)(3:82|(1:84)(1:85)|(4:87|(1:89)|177|90)(0)))|92|(1:94)(1:173))|96|(1:98)|99|(1:101)(1:102)|(2:104|(1:106)(2:107|(1:109)(3:110|(4:112|(1:114)|115|(1:117)(2:118|119))(1:120)|121))))|122|123|(2:161|125)|130|158|131|134|(4:136|37e|140|141)(1:145))(2:49|50)))(2:51|(4:53|(4:54|(1:56)|57|(0)(1:178))|60|(1:62))(2:63|64))|34|(0)|122|123|(0)|130|158|131|134|(0)(0))(2:65|66))(1:67)|68|(0)|122|123|(0)|130|158|131|134|(0)(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:133:0x0351, code lost:
                
                    p000.i0O0I111OoII.I000II.I0000oI00("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r19.I000O01llI0), r19.I0001Ioi1lo, (java.lang.String) r19.I00000oOI);
                 */
                /* JADX WARN: Removed duplicated region for block: B:136:0x036d  */
                /* JADX WARN: Removed duplicated region for block: B:145:0x03c1 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:161:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01c9 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01c9, B:72:0x01e4, B:73:0x01e7, B:75:0x01ef, B:77:0x01f3, B:82:0x01fd, B:87:0x020b, B:89:0x022b, B:90:0x0237, B:85:0x0203, B:91:0x023b, B:92:0x0240, B:94:0x0244, B:96:0x0248, B:98:0x024c, B:99:0x025a, B:104:0x0268, B:106:0x026c, B:107:0x027d, B:109:0x0281, B:110:0x0290, B:112:0x0294, B:114:0x02b6, B:115:0x02b9, B:121:0x02e5, B:118:0x02cc, B:119:0x02d3, B:120:0x02d4, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0183, B:63:0x0199, B:64:0x01a2, B:65:0x01a3, B:66:0x01c3, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #3, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x023b A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01c9, B:72:0x01e4, B:73:0x01e7, B:75:0x01ef, B:77:0x01f3, B:82:0x01fd, B:87:0x020b, B:89:0x022b, B:90:0x0237, B:85:0x0203, B:91:0x023b, B:92:0x0240, B:94:0x0244, B:96:0x0248, B:98:0x024c, B:99:0x025a, B:104:0x0268, B:106:0x026c, B:107:0x027d, B:109:0x0281, B:110:0x0290, B:112:0x0294, B:114:0x02b6, B:115:0x02b9, B:121:0x02e5, B:118:0x02cc, B:119:0x02d3, B:120:0x02d4, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0183, B:63:0x0199, B:64:0x01a2, B:65:0x01a3, B:66:0x01c3, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:155:0x004d, outer: #3, inners: #5, #7 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(i0O01I i0o01i) {
                    boolean z;
                    InputStream sequenceInputStream;
                    int i;
                    double d;
                    i0IoI1olO1 i0ioi1olo1I00000oIO;
                    File fileI0000Il00O;
                    long length;
                    int iMin;
                    int iMax;
                    int i2;
/* 11 */            i0Il00O1 i0il00o1 = this.I00000oOI;
/* 15 */            String str = (String) i0o01i.I00000oOI;
/* 17 */            int i3 = i0o01i.I0000Il00O;
/* 19 */            long j = i0o01i.I0000O;
/* 21 */            String str2 = i0o01i.I0001Ioi1lo;
/* 23 */            i0OIi1oi0i1 i0oii1oi0i1 = new i0OIi1oi0i1(i0il00o1, str, i3, j, str2);
/* 26 */            i0il00o1.getClass();
/* 49 */            File file = new File(new File(new File(i0il00o1.I0000Il00O(i3, j, str), "_slices"), "_metadata"), str2);
/* 56 */            if (!file.exists()) {
/* 58 */                file.mkdirs();
                    }
                    try {
/* 61 */                InputStream inputStream = i0o01i.I000l1;
/* 74 */                InputStream gZIPInputStream = i0o01i.I000II != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
                        try {
/* 82 */                    if (i0o01i.I000O01llI0 > 0) {
/* 84 */                        i0IoI0 i0ioi0I00000oOI = i0oii1oi0i1.I00000oOI();
/* 88 */                        int i4 = i0ioi0I00000oOI.I0000oI00;
/* 90 */                        int i5 = i0o01i.I000O01llI0;
/* 94 */                        if (i4 != i5 - 1) {
/* 452 */                           throw new i0O0lI1oiO("Trying to resume with chunk number " + i5 + " when previously processed chunk was number " + i4 + ".", i0o01i.I00000oIO);
                                }
/* 96 */                        int i6 = i0ioi0I00000oOI.I00000oIO;
/* 100 */                       if (i6 == 1) {
/* 302 */                           z = true;
/* 314 */                           I000II.I00000oIO("Resuming zip entry from last chunk during file %s.", i0ioi0I00000oOI.I00000oOI);
/* 321 */                           File file2 = new File(i0ioi0I00000oOI.I00000oOI);
/* 328 */                           if (!file2.exists()) {
/* 419 */                               throw new i0O0lI1oiO("Partial file specified in checkpoint does not exist. Corrupt directory.", i0o01i.I00000oIO);
                                    }
/* 334 */                           RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
/* 339 */                           randomAccessFile.seek(i0ioi0I00000oOI.I0000Il00O);
/* 342 */                           long j2 = i0ioi0I00000oOI.I0000O;
/* 376 */                           do {
/* 350 */                               iMin = (int) Math.min(j2, 8192L);
/* 357 */                               iMax = Math.max(gZIPInputStream.read(this.I00000oIO, 0, iMin), 0);
/* 361 */                               if (iMax > 0) {
/* 365 */                                   randomAccessFile.write(this.I00000oIO, 0, iMax);
                                        }
/* 369 */                               j2 -= iMax;
/* 374 */                               if (j2 <= 0) {
                                            break;
                                        }
/* 376 */                           } while (iMax > 0);
/* 379 */                           long length2 = randomAccessFile.length();
/* 383 */                           randomAccessFile.close();
/* 386 */                           if (iMax != iMin) {
/* 394 */                               I000II.I00000oIO("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
/* 405 */                               i0oii1oi0i1.I0001Ioi1lo(length2, j2, i0o01i.I000O01llI0, file2.getCanonicalPath());
                                    }
                                } else {
/* 103 */                           if (i6 == 2) {
/* 224 */                               I000II.I00000oIO("Resuming zip entry from last chunk during local file header.", new Object[0]);
/* 227 */                               i0Il00O1 i0il00o12 = this.I00000oOI;
/* 231 */                               String str3 = (String) i0o01i.I00000oOI;
/* 233 */                               int i7 = i0o01i.I0000Il00O;
/* 235 */                               long j3 = i0o01i.I0000O;
/* 237 */                               String str4 = i0o01i.I0001Ioi1lo;
/* 239 */                               i0il00o12.getClass();
/* 246 */                               z = true;
/* 271 */                               File file3 = new File(new File(new File(new File(i0il00o12.I0000Il00O(i7, j3, str3), "_slices"), "_metadata"), str4), "checkpoint_ext.dat");
/* 278 */                               if (!file3.exists()) {
/* 301 */                                   throw new i0O0lI1oiO("Checkpoint extension file not found.", i0o01i.I00000oIO);
                                        }
/* 287 */                               sequenceInputStream = new SequenceInputStream(new FileInputStream(file3), gZIPInputStream);
/* 456 */                               if (sequenceInputStream != null) {
/* 460 */                                   i0IolIloo i0ioliloo = new i0IolIloo(sequenceInputStream);
/* 475 */                                   File fileI000l1 = this.I00000oOI.I000l1((String) i0o01i.I00000oOI, i0o01i.I0000Il00O, i0o01i.I0000O, i0o01i.I0001Ioi1lo);
/* 483 */                                   if (!fileI000l1.exists()) {
/* 485 */                                       fileI000l1.mkdirs();
                                            }
/* 583 */                                   do {
/* 488 */                                       i0ioi1olo1I00000oIO = i0ioliloo.I00000oIO();
/* 494 */                                       if (!i0ioi1olo1I00000oIO.I0000O && !i0ioliloo.I00ilI0I1) {
/* 508 */                                           if (i0ioi1olo1I00000oIO.I0000Il00O == 0 ? z : false) {
/* 510 */                                               String str5 = i0ioi1olo1I00000oIO.I00000oIO;
/* 522 */                                               if (!(str5 == null ? false : str5.endsWith("/"))) {
/* 526 */                                                   i0oii1oi0i1.I000OOo1O(i0ioi1olo1I00000oIO.I0001Ioi1lo);
/* 533 */                                                   File file4 = new File(fileI000l1, i0ioi1olo1I00000oIO.I00000oIO);
/* 540 */                                                   file4.getParentFile().mkdirs();
/* 545 */                                                   FileOutputStream fileOutputStream = new FileOutputStream(file4);
/* 550 */                                                   int i8 = i0ioliloo.read(this.I00000oIO, 0, 8192);
/* 554 */                                                   while (i8 > 0) {
/* 558 */                                                       fileOutputStream.write(this.I00000oIO, 0, i8);
/* 563 */                                                       i8 = i0ioliloo.read(this.I00000oIO, 0, 8192);
                                                            }
/* 568 */                                                   fileOutputStream.close();
                                                        }
                                                    } else {
/* 574 */                                               i0oii1oi0i1.I000OiO(i0ioliloo, i0ioi1olo1I00000oIO.I0001Ioi1lo);
                                                    }
                                                }
/* 579 */                                       if (i0ioliloo.I00iio) {
                                                    break;
                                                }
/* 583 */                                   } while (!i0ioliloo.I00ilI0I1);
/* 587 */                                   if (i0ioliloo.I00ilI0I1) {
/* 595 */                                       I000II.I00000oIO("Writing central directory metadata.", new Object[0]);
/* 600 */                                       i0oii1oi0i1.I000OiO(sequenceInputStream, i0ioi1olo1I00000oIO.I0001Ioi1lo);
                                            }
/* 615 */                                   if (!(i0o01i.I000O01llI0 + 1 == i0o01i.I000OOo1O ? z : false)) {
/* 619 */                                       if (i0ioi1olo1I00000oIO.I0000O) {
/* 627 */                                           I000II.I00000oIO("Writing slice checkpoint for partial local file header.", new Object[0]);
/* 634 */                                           i0oii1oi0i1.I000II(i0o01i.I000O01llI0, i0ioi1olo1I00000oIO.I0001Ioi1lo);
                                                } else if (i0ioliloo.I00ilI0I1) {
/* 648 */                                           I000II.I00000oIO("Writing slice checkpoint for central directory.", new Object[0]);
/* 653 */                                           i0oii1oi0i1.I0000oI00(i0o01i.I000O01llI0);
                                                } else {
/* 659 */                                           if (i0ioi1olo1I00000oIO.I0000Il00O == 0) {
/* 667 */                                               I000II.I00000oIO("Writing slice checkpoint for partial file.", new Object[0]);
/* 685 */                                               File fileI000l12 = this.I00000oOI.I000l1((String) i0o01i.I00000oOI, i0o01i.I0000Il00O, i0o01i.I0000O, i0o01i.I0001Ioi1lo);
/* 693 */                                               if (!fileI000l12.exists()) {
/* 695 */                                                   fileI000l12.mkdirs();
                                                        }
/* 700 */                                               fileI0000Il00O = new File(fileI000l12, i0ioi1olo1I00000oIO.I00000oIO);
/* 707 */                                               length = i0ioi1olo1I00000oIO.I00000oOI - i0ioliloo.I00iiO;
/* 714 */                                               if (fileI0000Il00O.length() != length) {
/* 724 */                                                   throw new i0O0lI1oiO("Partial file is of unexpected size.");
                                                        }
                                                    } else {
/* 731 */                                               I000II.I00000oIO("Writing slice checkpoint for partial unextractable file.", new Object[0]);
/* 734 */                                               fileI0000Il00O = i0oii1oi0i1.I0000Il00O();
/* 738 */                                               length = fileI0000Il00O.length();
                                                    }
/* 750 */                                           i0oii1oi0i1.I0001Ioi1lo(length, i0ioliloo.I00iiO, i0o01i.I000O01llI0, fileI0000Il00O.getCanonicalPath());
                                                }
                                            }
                                        }
/* 753 */                               gZIPInputStream.close();
/* 756 */                               i = i0o01i.I000O01llI0;
/* 762 */                               if (i + 1 == i0o01i.I000OOo1O) {
                                            try {
/* 764 */                                       i0oii1oi0i1.I000O01llI0(i);
                                            } catch (IOException e) {
/* 781 */                                       I000II.I00000oOI("Writing extraction finished checkpoint failed with %s.", e.getMessage());
/* 793 */                                       throw new i0O0lI1oiO(i0o01i.I00000oIO, e, "Writing extraction finished checkpoint failed.");
                                            }
                                        }
/* 820 */                               I000II.I0000O("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0o01i.I000O01llI0), i0o01i.I0001Ioi1lo, (String) i0o01i.I00000oOI, Integer.valueOf(i0o01i.I00000oIO));
/* 841 */                               ((i0OiOI1) this.I0000oI00.I0000Il00O()).I0000O(i0o01i.I00000oIO, i0o01i.I000O01llI0, (String) i0o01i.I00000oOI, i0o01i.I0001Ioi1lo);
/* 846 */                               i0o01i.I000l1.close();
/* 876 */                               if (i0o01i.I000iOII == 3) {
/* 884 */                                   i0Iio1OiI i0iio1oii = (i0Iio1OiI) this.I0001Ioi1lo.I0000Il00O();
/* 889 */                                   String str6 = (String) i0o01i.I00000oOI;
/* 891 */                                   long j4 = i0o01i.I000OiO;
/* 893 */                                   i0O0oOiO11 i0o0ooio11 = this.I0000Il00O;
                                            synchronized (i0o0ooio11) {
/* 907 */                                       d = (i0o01i.I000O01llI0 + 1.0d) / i0o01i.I000OOo1O;
/* 913 */                                       i0o0ooio11.I00000oIO.put(str6, Double.valueOf(d));
                                            }
/* 933 */                                   bs bsVarI00000oIO = bs.I00000oIO(str6, 3, 0, j4, j4, d, 1, i0o01i.I0000oI00, this.I0000O.I00000oIO((String) i0o01i.I00000oOI));
/* 937 */                                   i0iio1oii.getClass();
/* 943 */                                   l0iOoII1Il l0iooii1il = new l0iOoII1Il(3);
/* 946 */                                   l0iooii1il.I00iiI = i0iio1oii;
/* 948 */                                   l0iooii1il.I00iiO = bsVarI00000oIO;
/* 950 */                                   VarHandle.storeStoreFence();
/* 955 */                                   i0iio1oii.I00000oOI.post(l0iooii1il);
/* 958 */                                   return;
                                        }
/* 962 */                               return;
                                    }
/* 105 */                           if (i6 != 3) {
/* 217 */                               throw new i0O0lI1oiO("Slice checkpoint file corrupt. Unexpected FileExtractionStatus " + i6 + ".", i0o01i.I00000oIO);
                                    }
/* 113 */                           I000II.I00000oIO("Resuming central directory from last chunk.", new Object[0]);
/* 116 */                           long j5 = i0ioi0I00000oOI.I0000Il00O;
/* 118 */                           byte[] bArr = i0oii1oi0i1.I00000oIO;
/* 128 */                           RandomAccessFile randomAccessFile2 = new RandomAccessFile(i0oii1oi0i1.I0000Il00O(), "rw");
                                    try {
/* 131 */                               randomAccessFile2.seek(j5);
/* 147 */                               do {
/* 134 */                                   i2 = gZIPInputStream.read(bArr);
/* 138 */                                   if (i2 > 0) {
/* 140 */                                       randomAccessFile2.write(bArr, 0, i2);
                                            }
/* 147 */                               } while (i2 >= 0);
/* 149 */                               randomAccessFile2.close();
/* 162 */                               if (!(i0o01i.I000O01llI0 + 1 == i0o01i.I000OOo1O)) {
/* 179 */                                   throw new i0O0lI1oiO("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", i0o01i.I00000oIO);
                                        }
/* 164 */                               z = true;
                                    } finally {
                                    }
                                }
/* 166 */                       sequenceInputStream = null;
/* 456 */                       if (sequenceInputStream != null) {
                                }
/* 753 */                       gZIPInputStream.close();
/* 756 */                       i = i0o01i.I000O01llI0;
/* 762 */                       if (i + 1 == i0o01i.I000OOo1O) {
                                }
/* 820 */                       I000II.I0000O("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0o01i.I000O01llI0), i0o01i.I0001Ioi1lo, (String) i0o01i.I00000oOI, Integer.valueOf(i0o01i.I00000oIO));
/* 841 */                       ((i0OiOI1) this.I0000oI00.I0000Il00O()).I0000O(i0o01i.I00000oIO, i0o01i.I000O01llI0, (String) i0o01i.I00000oOI, i0o01i.I0001Ioi1lo);
/* 846 */                       i0o01i.I000l1.close();
/* 876 */                       if (i0o01i.I000iOII == 3) {
                                }
                            } else {
/* 453 */                       z = true;
                            }
/* 455 */                   sequenceInputStream = gZIPInputStream;
/* 456 */                   if (sequenceInputStream != null) {
                            }
/* 753 */                   gZIPInputStream.close();
/* 756 */                   i = i0o01i.I000O01llI0;
/* 762 */                   if (i + 1 == i0o01i.I000OOo1O) {
                            }
/* 820 */                   I000II.I0000O("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0o01i.I000O01llI0), i0o01i.I0001Ioi1lo, (String) i0o01i.I00000oOI, Integer.valueOf(i0o01i.I00000oIO));
/* 841 */                   ((i0OiOI1) this.I0000oI00.I0000Il00O()).I0000O(i0o01i.I00000oIO, i0o01i.I000O01llI0, (String) i0o01i.I00000oOI, i0o01i.I0001Ioi1lo);
/* 846 */                   i0o01i.I000l1.close();
/* 876 */                   if (i0o01i.I000iOII == 3) {
                            }
                        } finally {
                        }
                    } catch (IOException e2) {
/* 986 */               I000II.I00000oOI("IOException during extraction %s.", e2.getMessage());
/* 6116 */              throw new i0O0lI1oiO(i0o01i.I00000oIO, e2, "Error extracting chunk " + i0o01i.I000O01llI0 + " of slice " + i0o01i.I0001Ioi1lo + " of pack " + ((String) i0o01i.I00000oOI) + " of session " + i0o01i.I00000oIO + ".");
                    }
                }
            }

            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.regex.Matcher;
            
            public final class lloOo1iol {
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public ArrayList I0000Il00O;

                public final Object I00000oIO(Uri uri, lloO1Oolo lloo1oolo) {
/* 5 */             return lloo1oolo.I00000oIO(I00000oOI(uri));
                }

                public final OillOo0 I00000oOI(Uri uri) {
                    List listI000o00OoI0I;
/* 1 */             IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 6 */             ii1oO1IOiI1o.I00000oIO(4, "initialCapacity");
/* 9 */             Object[] objArr = new Object[4];
/* 11 */            ii1oO1IOiI1o.I00000oIO(4, "initialCapacity");
/* 14 */            Object[] objArrCopyOf = new Object[4];
/* 16 */            String encodedFragment = uri.getEncodedFragment();
/* 25 */            int i = 0;
/* 26 */            if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
/* 106 */               listI000o00OoI0I = OOol0l1I1.I00ilI0I1;
                    } else {
/* 39 */                String strSubstring = encodedFragment.substring(10);
/* 45 */                char cCharAt = "+".charAt(0);
/* 51 */                IO11i1 iO11i1 = new IO11i1();
/* 54 */                iO11i1.I00000oIO = cCharAt;
/* 56 */                VarHandle.storeStoreFence();
/* 63 */                I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(28);
/* 66 */                i0IOIlIOIII.I00iiI = iO11i1;
/* 68 */                VarHandle.storeStoreFence();
/* 73 */                IolIIo0o0Iio iolIIo0o0Iio = new IolIIo0o0Iio();
/* 76 */                iolIIo0o0Iio.I0000O = i0IOIlIOIII;
/* 78 */                iolIIo0o0Iio.I00000oIO = true;
/* 82 */                iolIIo0o0Iio.I0000Il00O = IO11i1I0.I00000oIO;
/* 87 */                iolIIo0o0Iio.I00000oOI = Integer.MAX_VALUE;
/* 91 */                OlIOI10i1 olIOI10i1 = new OlIOI10i1(i);
/* 94 */                olIOI10i1.I00iiI = strSubstring;
/* 96 */                olIOI10i1.I00iiO = iolIIo0o0Iio;
/* 98 */                VarHandle.storeStoreFence();
/* 101 */               listI000o00OoI0I = IoillO0OOoo.I000o00OoI0I(olIOI10i1);
                    }
/* 108 */           int size = listI000o00OoI0I.size();
/* 112 */           int i2 = 0;
/* 113 */           int i3 = 0;
/* 115 */           while (i2 < size) {
/* 121 */               String str = (String) listI000o00OoI0I.get(i2);
/* 125 */               Matcher matcher = lo1oOOI1101i.I00000oIO.matcher(str);
/* 133 */               if (!matcher.matches()) {
/* 175 */                   I000II.I000iOII("Invalid fragment spec: ".concat(String.valueOf(str)));
/* 114 */                   return null;
                        }
/* 135 */               String strGroup = matcher.group(1);
/* 139 */               strGroup.getClass();
/* 145 */               int iI000II = IoilIilo.I000II(objArrCopyOf.length, i3 + 1);
/* 150 */               if (iI000II > objArrCopyOf.length) {
/* 153 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI000II);
                        }
/* 159 */               objArrCopyOf[i3] = strGroup;
/* 161 */               i2++;
/* 157 */               i3++;
                    }
/* 179 */           OOol0l1I1 oOol0l1I1I000lI = IoillO0OOoo.I000lI(i3, objArrCopyOf);
/* 185 */           if (oOol0l1I1I000lI.I00iio > 0) {
/* 345 */               String str2 = (String) oOol0l1I1I000lI.get(0);
/* 353 */               if (this.I00000oOI.get(str2) != null) {
/* 355 */                   OIiilo1Ool0o.I00000oIO();
/* 114 */                   return null;
                        }
/* 361 */               String strValueOf = String.valueOf(uri);
/* 437 */               throw new IOO1IOl1O10(IIl001iO0Io.I00100o1O0lo(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
                    }
/* 191 */           IoillO0OOoo ioillO0OOooI0010I0i = IoillO0OOoo.I000lI(0, objArr).I0010I0i();
/* 195 */           String scheme = uri.getScheme();
/* 205 */           loIo0iiOoi loio0iiooi = (loIo0iiOoi) this.I00000oIO.get(scheme);
/* 207 */           if (loio0iiooi == null) {
/* 340 */               throw new IOO1IOl1O10(IIl001iO0Io.I000o00OoI0I("Requested backend isn't registered: ", scheme));
                    }
/* 209 */           ArrayList arrayList = this.I0000Il00O;
/* 215 */           if (!ioillO0OOooI0010I0i.isEmpty()) {
/* 223 */               ArrayList arrayList2 = new ArrayList(uri.getPathSegments());
/* 230 */               if (!arrayList2.isEmpty() && !uri.getPath().endsWith("/")) {
/* 254 */                   String str3 = (String) arrayList2.get(arrayList2.size() - 1);
/* 260 */                   ListIterator listIterator = ioillO0OOooI0010I0i.listIterator(ioillO0OOooI0010I0i.size());
/* 268 */                   while (listIterator.hasPrevious()) {
/* 274 */                       if (listIterator.previous() != null) {
/* 277 */                           OIiilo1Ool0o.I00000oIO();
/* 114 */                           return null;
                                }
                            }
/* 287 */                   arrayList2.set(arrayList2.size() - 1, str3);
/* 306 */                   uri = uri.buildUpon().path(TextUtils.join("/", arrayList2)).encodedFragment(null).build();
                        }
                    }
/* 314 */           OillOo0 oillOo0 = new OillOo0(23);
/* 317 */           oillOo0.I00iiI = loio0iiooi;
/* 319 */           oillOo0.I00iiO = ioillO0OOooI0010I0i;
/* 321 */           oillOo0.I00iio = arrayList;
/* 323 */           oillOo0.I00ilI0I1 = uri;
/* 325 */           VarHandle.storeStoreFence();
/* 328 */           return oillOo0;
                }
            }

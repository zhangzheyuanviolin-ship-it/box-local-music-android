            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import java.util.NoSuchElementException;
            import java.util.concurrent.CancellationException;
            
            public final class O1111Ol0O extends Oll0io implements IlliIl1l11O {
                public StringBuilder I00iOIl;
                public OOo0ooi I00iiI;
                public int I00iiO;
                public int I00iio;
                public long I00ilI0I1;
                public int I00ilO0;
                public final O1111l I00io1l;
                public final String I00ioIO;
                public final O0l0IlolloIO I00l0I0l0lO1;
                public final IiioilIl1Il I00l0OO0IO;
                public final IlIi0Il I00li1OI;
                public final II0O1i0I1 I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1111Ol0O(O1111l o1111l, String str, O0l0IlolloIO o0l0IlolloIO, IiioilIl1Il iiioilIl1Il, IlIi0Il ilIi0Il, II0O1i0I1 iI0O1i0I1, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = o1111l;
/* 3 */             this.I00ioIO = str;
/* 5 */             this.I00l0I0l0lO1 = o0l0IlolloIO;
/* 7 */             this.I00l0OO0IO = iiioilIl1Il;
/* 9 */             this.I00li1OI = ilIi0Il;
/* 11 */            this.I00ll1 = iI0O1i0I1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new O1111Ol0O(this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O1111Ol0O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:57:0x019e, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r3, r4, r16) != r2) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x01ba, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r0, r3, r16) != r2) goto L62;
                 */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[Catch: Exception -> 0x0024, CancellationException -> 0x01a1, TryCatch #2 {CancellationException -> 0x01a1, Exception -> 0x0024, blocks: (B:9:0x001f, B:14:0x002f, B:44:0x013e, B:46:0x014f, B:51:0x015c, B:17:0x003e, B:39:0x00f4, B:41:0x010f, B:18:0x0045, B:26:0x005c, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:35:0x00a5, B:54:0x0180, B:55:0x0185, B:21:0x004c, B:23:0x0052), top: B:64:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[Catch: Exception -> 0x0024, CancellationException -> 0x01a1, TryCatch #2 {CancellationException -> 0x01a1, Exception -> 0x0024, blocks: (B:9:0x001f, B:14:0x002f, B:44:0x013e, B:46:0x014f, B:51:0x015c, B:17:0x003e, B:39:0x00f4, B:41:0x010f, B:18:0x0045, B:26:0x005c, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:35:0x00a5, B:54:0x0180, B:55:0x0185, B:21:0x004c, B:23:0x0052), top: B:64:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x014f A[Catch: Exception -> 0x0024, CancellationException -> 0x01a1, TryCatch #2 {CancellationException -> 0x01a1, Exception -> 0x0024, blocks: (B:9:0x001f, B:14:0x002f, B:44:0x013e, B:46:0x014f, B:51:0x015c, B:17:0x003e, B:39:0x00f4, B:41:0x010f, B:18:0x0045, B:26:0x005c, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:35:0x00a5, B:54:0x0180, B:55:0x0185, B:21:0x004c, B:23:0x0052), top: B:64:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0180 A[Catch: Exception -> 0x0024, CancellationException -> 0x01a1, TryCatch #2 {CancellationException -> 0x01a1, Exception -> 0x0024, blocks: (B:9:0x001f, B:14:0x002f, B:44:0x013e, B:46:0x014f, B:51:0x015c, B:17:0x003e, B:39:0x00f4, B:41:0x010f, B:18:0x0045, B:26:0x005c, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:35:0x00a5, B:54:0x0180, B:55:0x0185, B:21:0x004c, B:23:0x0052), top: B:64:0x0008 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Iterator it;
                    StringBuilder sb;
                    long j;
                    int i;
                    OOo0ooi oOo0ooi;
                    int i2;
                    long jI00000oIO;
                    String strI00000oIO;
                    String strI00000oIO2;
                    Io11l1li io11l1li;
                    Ii1lIOIo01 ii1lIOIo01;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                    try {
                    } catch (CancellationException unused) {
/* 418 */               IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 420 */               Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 429 */               I1iOI0oo i1iOI0oo = new I1iOI0oo(this.I00li1OI, (IOoil1iiIilo) null, 9);
/* 432 */               this.I00iOIl = null;
/* 434 */               this.I00iiI = null;
/* 437 */               this.I00ilO0 = 5;
                    } catch (Exception e) {
/* 391 */               IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 393 */               Io11l1li io11l1li3 = O1OI1l011OO1.I00000oIO;
/* 401 */               O00lOIIO o00lOIIO = new O00lOIIO(this.I00ll1, e, null, 2);
/* 404 */               this.I00iOIl = null;
/* 406 */               this.I00iiI = null;
/* 409 */               this.I00ilO0 = 6;
                    }
                    switch (this.I00ilO0) {
                        case 0:
/* 74 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    OlIl0i olIl0i = this.I00io1l.I000O01llI0;
/* 81 */                    if (olIl0i != null) {
/* 83 */                        this.I00ilO0 = 1;
/* 89 */                        if (olIl0i.I001l0I00(this) == ii0111o) {
                                }
/* 445 */                       return ii0111o;
                            }
/* 95 */                    StringBuilder sb2 = new StringBuilder();
/* 100 */                   OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 105 */                   oOo0ooi2.I00iOIl = "";
/* 119 */                   List listI000O01llI0 = IOOi1I.I000O01llI0("<|im_end|>", "<|eot_id|>", "<|endoftext|>", "<|im_start|>");
/* 126 */                   it = listI000O01llI0.iterator();
/* 134 */                   if (it.hasNext()) {
/* 390 */                       throw new NoSuchElementException();
                            }
/* 142 */                   int length = ((String) it.next()).length();
                            while (true) {
/* 146 */                       int i3 = length;
/* 151 */                       while (it.hasNext()) {
/* 159 */                           length = ((String) it.next()).length();
/* 163 */                           if (i3 < length) {
                                        break;
                                    }
                                }
/* 168 */                       OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 173 */                       OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 176 */                       O1111l o1111l = this.I00io1l;
/* 178 */                       String str = this.I00ioIO;
/* 180 */                       O0l0IlolloIO o0l0IlolloIO = this.I00l0I0l0lO1;
/* 182 */                       long jI00000oIO2 = OI0101io.I00000oIO();
/* 188 */                       IlOil1ii responseAsFlow = o1111l.I00000oIO.getResponseAsFlow(str);
/* 196 */                       I1iOI0oo i1iOI0oo2 = new I1iOI0oo(oOo0l0ii10l, (IOoil1iiIilo) null, 10);
/* 202 */                       IlOlOlI0 ilOlOlI0 = new IlOlOlI0(1);
/* 205 */                       ilOlOlI0.I00iiI = responseAsFlow;
/* 207 */                       ilOlOlI0.I00iiO = i1iOI0oo2;
/* 209 */                       VarHandle.storeStoreFence();
/* 214 */                       O1111O0lioll o1111O0lioll = new O1111O0lioll(sb2, i3, listI000O01llI0, oOo0l0ii10l, oOo0ll111, o1111l, oOo0ooi2, o0l0IlolloIO);
/* 217 */                       this.I00iOIl = sb2;
/* 219 */                       this.I00iiI = oOo0ooi2;
/* 221 */                       this.I00iiO = i3;
/* 224 */                       this.I00iio = 3;
/* 226 */                       this.I00ilI0I1 = jI00000oIO2;
/* 229 */                       this.I00ilO0 = 2;
/* 235 */                       if (ilOlOlI0.I00000oIO(o1111O0lioll, this) == ii0111o) {
/* 445 */                           return ii0111o;
                                }
/* 240 */                       sb = sb2;
/* 241 */                       j = jI00000oIO2;
/* 242 */                       i = i3;
/* 243 */                       oOo0ooi = oOo0ooi2;
/* 244 */                       i2 = 3;
/* 245 */                       jI00000oIO = Oo111Ii1Il.I00000oIO(j);
/* 254 */                       strI00000oIO = O1111l.I00000oIO(sb.toString(), false);
/* 270 */                       if (strI00000oIO.length() > ((String) oOo0ooi.I00iOIl).length()) {
/* 280 */                           String strSubstring = strI00000oIO.substring(((String) oOo0ooi.I00iOIl).length());
/* 284 */                           oOo0ooi.I00iOIl = strI00000oIO;
/* 286 */                           IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 288 */                           Io11l1li io11l1li4 = O1OI1l011OO1.I00000oIO;
/* 295 */                           O1111Io1o o1111Io1o = new O1111Io1o(this.I00l0I0l0lO1, strSubstring, null, 0);
/* 298 */                           this.I00iOIl = sb;
/* 300 */                           this.I00iiI = null;
/* 302 */                           this.I00iiO = i;
/* 304 */                           this.I00iio = i2;
/* 306 */                           this.I00ilI0I1 = jI00000oIO;
/* 309 */                           this.I00ilO0 = 3;
/* 315 */                           if (iOi1II01i0.I0000oI00(io11l1li4, o1111Io1o, this) == ii0111o) {
                                    }
/* 445 */                           return ii0111o;
                                }
/* 319 */                       StringBuilder sb3 = sb;
/* 320 */                       long j2 = jI00000oIO;
/* 326 */                       strI00000oIO2 = O1111l.I00000oIO(sb3.toString(), true);
/* 334 */                       if (OlOoOIi0o.I001l0I00(strI00000oIO2)) {
/* 346 */                           strI00000oIO2 = !OlOoOIi0o.I001l0I00(sb3) ? "(No visible content produced)" : "(Empty response)";
                                }
/* 350 */                       IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 352 */                       io11l1li = O1OI1l011OO1.I00000oIO;
/* 361 */                       ii1lIOIo01 = new Ii1lIOIo01(this.I00io1l, this.I00l0OO0IO, strI00000oIO2, j2, null);
/* 365 */                       this.I00iOIl = null;
/* 367 */                       this.I00iiI = null;
/* 369 */                       this.I00iiO = i;
/* 371 */                       this.I00iio = i2;
/* 373 */                       this.I00ilI0I1 = j2;
/* 376 */                       this.I00ilO0 = 4;
/* 382 */                       if (iOi1II01i0.I0000oI00(io11l1li, ii1lIOIo01, this) == ii0111o) {
/* 445 */                           return ii0111o;
                                }
/* 446 */                       return OoiIlOl1iI.I00000oIO;
                            }
                            break;
                        case 1:
/* 70 */                    lIoii1l01l0i.I00000oOI(obj);
/* 95 */                    StringBuilder sb22 = new StringBuilder();
/* 100 */                   OOo0ooi oOo0ooi22 = new OOo0ooi();
/* 105 */                   oOo0ooi22.I00iOIl = "";
/* 119 */                   List listI000O01llI02 = IOOi1I.I000O01llI0("<|im_end|>", "<|eot_id|>", "<|endoftext|>", "<|im_start|>");
/* 126 */                   it = listI000O01llI02.iterator();
/* 134 */                   if (it.hasNext()) {
                            }
                            break;
                        case 2:
/* 53 */                    j = this.I00ilI0I1;
/* 55 */                    i2 = this.I00iio;
/* 57 */                    int i4 = this.I00iiO;
/* 59 */                    oOo0ooi = this.I00iiI;
/* 61 */                    StringBuilder sb4 = this.I00iOIl;
/* 63 */                    lIoii1l01l0i.I00000oOI(obj);
/* 66 */                    i = i4;
/* 67 */                    sb = sb4;
/* 245 */                   jI00000oIO = Oo111Ii1Il.I00000oIO(j);
/* 254 */                   strI00000oIO = O1111l.I00000oIO(sb.toString(), false);
/* 270 */                   if (strI00000oIO.length() > ((String) oOo0ooi.I00iOIl).length()) {
                            }
/* 319 */                   StringBuilder sb32 = sb;
/* 320 */                   long j22 = jI00000oIO;
/* 326 */                   strI00000oIO2 = O1111l.I00000oIO(sb32.toString(), true);
/* 334 */                   if (OlOoOIi0o.I001l0I00(strI00000oIO2)) {
                            }
/* 350 */                   IiI0oillOO10 iiI0oillOO1042 = IiiIil1lOIO.I00000oIO;
/* 352 */                   io11l1li = O1OI1l011OO1.I00000oIO;
/* 361 */                   ii1lIOIo01 = new Ii1lIOIo01(this.I00io1l, this.I00l0OO0IO, strI00000oIO2, j22, null);
/* 365 */                   this.I00iOIl = null;
/* 367 */                   this.I00iiI = null;
/* 369 */                   this.I00iiO = i;
/* 371 */                   this.I00iio = i2;
/* 373 */                   this.I00ilI0I1 = j22;
/* 376 */                   this.I00ilO0 = 4;
/* 382 */                   if (iOi1II01i0.I0000oI00(io11l1li, ii1lIOIo01, this) == ii0111o) {
                            }
/* 446 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 40 */                    jI00000oIO = this.I00ilI0I1;
/* 42 */                    i2 = this.I00iio;
/* 44 */                    i = this.I00iiO;
/* 46 */                    sb = this.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 319 */                   StringBuilder sb322 = sb;
/* 320 */                   long j222 = jI00000oIO;
/* 326 */                   strI00000oIO2 = O1111l.I00000oIO(sb322.toString(), true);
/* 334 */                   if (OlOoOIi0o.I001l0I00(strI00000oIO2)) {
                            }
/* 350 */                   IiI0oillOO10 iiI0oillOO10422 = IiiIil1lOIO.I00000oIO;
/* 352 */                   io11l1li = O1OI1l011OO1.I00000oIO;
/* 361 */                   ii1lIOIo01 = new Ii1lIOIo01(this.I00io1l, this.I00l0OO0IO, strI00000oIO2, j222, null);
/* 365 */                   this.I00iOIl = null;
/* 367 */                   this.I00iiI = null;
/* 369 */                   this.I00iiO = i;
/* 371 */                   this.I00iio = i2;
/* 373 */                   this.I00ilI0I1 = j222;
/* 376 */                   this.I00ilO0 = 4;
/* 382 */                   if (iOi1II01i0.I0000oI00(io11l1li, ii1lIOIo01, this) == ii0111o) {
                            }
/* 446 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 32 */                    lIoii1l01l0i.I00000oOI(obj);
/* 446 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 446 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 446 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 14 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                     return null;
                    }
                }
            }

            package p000;

            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OolI1IIioII extends Oll0io implements Function1 {
                public Object I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public O11ooiIoo0l I00iio;
                public I0OIi10lO0iO I00ilI0I1;
                public long I00ilO0;
                public int I00io1l;
                public final OolI1lo I00ioIO;
                public final List I00l0I0l0lO1;
                public final List I00l0OO0IO;
                public final List I00li1OI;
                public final O11ooiIoo0l I00ll1;
                public final I0OIi10lO0iO I00lli11;
                public final long I00lll10;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OolI1IIioII(OolI1lo oolI1lo, List list, List list2, List list3, O11ooiIoo0l o11ooiIoo0l, I0OIi10lO0iO i0OIi10lO0iO, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00ioIO = oolI1lo;
/* 3 */             this.I00l0I0l0lO1 = list;
/* 5 */             this.I00l0OO0IO = list2;
/* 7 */             this.I00li1OI = list3;
/* 9 */             this.I00ll1 = o11ooiIoo0l;
/* 11 */            this.I00lli11 = i0OIi10lO0iO;
/* 13 */            this.I00lll10 = j;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            return new OolI1IIioII(this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, this.I00lli11, this.I00lll10, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((OolI1IIioII) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:55|(5:(1:(1:(9:6|51|7|8|62|31|32|33|34)(2:11|12))(3:13|14|15))(7:17|18|56|19|20|(1:23)|29)|64|27|(6:30|62|31|32|33|34)|29)|53|24|58|25|26|(2:(0)|(1:61))) */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
                
                    r20 = r11;
                    r18 = r12;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v4 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    String str;
                    String str2;
                    List list;
                    I0OIi10lO0iO i0OIi10lO0iO;
                    Object objI0000Il00O;
                    O11ooiIoo0l o11ooiIoo0l;
                    int i2;
                    long j;
                    AutoCloseable autoCloseable;
                    Throwable th;
                    AutoCloseable autoCloseable2;
                    IIll1i iIll1i;
                    Object objI0000Il00O2;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i3 = this.I00io1l;
/* 7 */             ?? r1 = 3;
/* 8 */             ?? r2 = "CXCP";
                    try {
                        try {
                            try {
                                try {
/* 13 */                            if (i3 == 0) {
/* 85 */                                lIoii1l01l0i.I00000oOI(obj);
/* 88 */                                l11I11lO.I0000O(3, "CXCP");
/* 91 */                                OolI1lo oolI1lo = this.I00ioIO;
/* 93 */                                List list2 = this.I00l0I0l0lO1;
/* 95 */                                List list3 = this.I00l0OO0IO;
/* 97 */                                list = this.I00li1OI;
/* 99 */                                O11ooiIoo0l o11ooiIoo0l2 = this.I00ll1;
/* 101 */                               i0OIi10lO0iO = this.I00lli11;
/* 103 */                               long j2 = this.I00lll10;
/* 107 */                               IIll0oO iIll0oOI00000oIO = oolI1lo.I0000Il00O.I00000oIO();
/* 111 */                               this.I00iOIl = list2;
                                        try {
/* 116 */                                   this.I00iiI = list3;
/* 121 */                                   this.I00iiO = list;
/* 123 */                                   this.I00iio = o11ooiIoo0l2;
/* 125 */                                   this.I00ilI0I1 = i0OIi10lO0iO;
/* 127 */                                   this.I00ilO0 = j2;
/* 129 */                                   this.I00io1l = 1;
/* 131 */                                   objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(this);
/* 135 */                                   if (objI0000Il00O != ii0111o) {
/* 138 */                                       o11ooiIoo0l = o11ooiIoo0l2;
/* 139 */                                       i2 = 3;
/* 140 */                                       r1 = list2;
/* 8 */                                         str = "CXCP";
/* 144 */                                       r2 = list3;
/* 145 */                                       j = j2;
                                            }
/* 191 */                                   return ii0111o;
                                        } catch (CancellationException unused) {
/* 8 */                                     str2 = "CXCP";
/* 201 */                                   str = str2;
/* 203 */                                   i = 3;
/* 230 */                                   l11I11lO.I0000O(i, str);
/* 233 */                                   return OolI1lo.I000l1;
                                        }
                                    }
/* 15 */                            if (i3 != 1) {
/* 17 */                                if (i3 != 2) {
/* 41 */                                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                    return null;
                                        }
/* 22 */                                autoCloseable2 = (AutoCloseable) this.I00iOIl;
                                        try {
/* 24 */                                    lIoii1l01l0i.I00000oOI(obj);
/* 27 */                                    objI0000Il00O2 = obj;
/* 8 */                                     str2 = "CXCP";
                                        } catch (Throwable th2) {
/* 34 */                                    th = th2;
/* 8 */                                     str2 = "CXCP";
                                            try {
/* 219 */                                       throw th;
                                            } catch (Throwable th3) {
/* 221 */                                       iOOl00.I00000oIO(autoCloseable2, th);
/* 224 */                                       throw th3;
                                            }
                                        }
                                        try {
/* 194 */                                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) objI0000Il00O2;
/* 197 */                                   iOOl00.I00000oIO(autoCloseable2, null);
/* 200 */                                   return iiIOI1ol0o;
                                        } catch (Throwable th4) {
/* 206 */                                   th = th4;
/* 219 */                                   throw th;
                                        }
                                    }
/* 45 */                            long j3 = this.I00ilO0;
/* 47 */                            I0OIi10lO0iO i0OIi10lO0iO2 = this.I00ilI0I1;
/* 49 */                            o11ooiIoo0l = this.I00iio;
/* 51 */                            list = this.I00iiO;
/* 55 */                            List list4 = this.I00iiI;
/* 61 */                            List list5 = (List) this.I00iOIl;
/* 63 */                            lIoii1l01l0i.I00000oOI(obj);
/* 8 */                             str = "CXCP";
/* 67 */                            r2 = list4;
/* 70 */                            objI0000Il00O = obj;
/* 74 */                            i0OIi10lO0iO = i0OIi10lO0iO2;
/* 76 */                            i2 = 3;
/* 77 */                            r1 = list5;
/* 78 */                            j = j3;
/* 185 */                           objI0000Il00O2 = IIll1i.I0000Il00O(iIll1i, r1, r2, list, null, o11ooiIoo0l, null, i0OIi10lO0iO, null, j, j, this, 7175);
/* 189 */                           if (objI0000Il00O2 != ii0111o) {
/* 192 */                               autoCloseable2 = autoCloseable;
/* 194 */                               IiIOI1ol0o iiIOI1ol0o2 = (IiIOI1ol0o) objI0000Il00O2;
/* 197 */                               iOOl00.I00000oIO(autoCloseable2, null);
/* 200 */                               return iiIOI1ol0o2;
                                    }
/* 191 */                           return ii0111o;
                                } catch (Throwable th5) {
/* 208 */                           th = th5;
/* 209 */                           th = th;
/* 210 */                           autoCloseable2 = autoCloseable;
/* 219 */                           throw th;
                                }
/* 148 */                       AutoCloseable autoCloseable3 = (AutoCloseable) objI0000Il00O;
/* 151 */                       iIll1i = (IIll1i) autoCloseable3;
/* 153 */                       this.I00iOIl = autoCloseable3;
/* 155 */                       this.I00iiI = null;
/* 157 */                       this.I00iiO = null;
/* 159 */                       this.I00iio = null;
/* 161 */                       this.I00ilI0I1 = null;
/* 163 */                       this.I00io1l = 2;
/* 180 */                       autoCloseable = autoCloseable3;
/* 183 */                       str2 = str;
                            } catch (CancellationException unused2) {
/* 225 */                       i = i2;
/* 230 */                       l11I11lO.I0000O(i, str);
/* 233 */                       return OolI1lo.I000l1;
                            }
                        } catch (CancellationException unused3) {
/* 81 */                    i = r1;
/* 82 */                    str = r2;
                        }
                    } catch (CancellationException unused4) {
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class IoOIOiI01i00 extends Oll0io implements Function3 {
                public int I00iOIl;
                public int I00iiI;
                public OO11OoloI I00iiO;
                public Object I00iio;
                public final IoOIi0o I00ilI0I1;
                public final IoIlI1oli I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoOIOiI01i00(IoOIi0o ioOIi0o, IoIlI1oli ioIlI1oli, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = ioOIi0o;
/* 3 */             this.I00ilO0 = ioIlI1oli;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 11 */            IoOIOiI01i00 ioOIOiI01i00 = new IoOIOiI01i00(this.I00ilI0I1, this.I00ilO0, (IOoil1iiIilo) obj3);
/* 14 */            ioOIOiI01i00.I00iiO = (OO11OoloI) obj;
/* 16 */            ioOIOiI01i00.I00iio = obj2;
/* 20 */            return ioOIOiI01i00.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
                
                    if (r0.I0000oI00(r10, (p000.IoIlIolo10o) r11) == r2) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOoOloI0iI iOoOloI0iII00000oIO;
                    int iIntValue;
/* 1 */             OO11OoloI oO11OoloI = this.I00iiO;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 12 */            if (i == 0) {
/* 36 */                lIoii1l01l0i.I00000oOI(obj);
/* 41 */                if (!(obj2 instanceof OIio0oloI1I)) {
/* 187 */                   StringBuilder sb = new StringBuilder("\n|Fail to prepare request body for sending. \n|The body type is: ");
/* 200 */                   sb.append(OOoOl0i.I00000oIO.I00000oOI(obj2.getClass()));
/* 205 */                   sb.append(", with Content-Type: ");
/* 216 */                   String strI00oII = ((IoO10oI0o) oO11OoloI.I00iOIl).I0000Il00O.I00oII("Content-Type");
/* 220 */                   if (strI00oII != null) {
/* 222 */                       IOoOloI0iI iOoOloI0iI = IOoOloI0iI.I0000oI00;
/* 224 */                       iOoOloI0iII00000oIO = iioIIll1.I00000oIO(strI00oII);
                            } else {
/* 229 */                       iOoOloI0iII00000oIO = null;
                            }
/* 230 */                   sb.append(iOoOloI0iII00000oIO);
/* 235 */                   sb.append(".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.");
/* 246 */                   IOOlIIilOl0.I0000oI00(OlOoOOooiIll.I0000O(sb.toString()));
/* 11 */                    return null;
                        }
/* 43 */                Object obj3 = oO11OoloI.I00iOIl;
/* 46 */                IoO10oI0o ioO10oI0o = (IoO10oI0o) obj3;
/* 48 */                ioO10oI0o.I0000O = obj2;
/* 50 */                ioO10oI0o.I00000oIO(null);
/* 53 */                IoO10oI0o ioO10oI0o2 = (IoO10oI0o) obj3;
/* 63 */                Integer num = (Integer) ioO10oI0o2.I0001Ioi1lo.I0000O(IoO1lI1l.I0000Il00O);
/* 95 */                iIntValue = (num == null || num.intValue() < 20) ? 20 : num.intValue() < Integer.MAX_VALUE ? num.intValue() + 1 : num.intValue();
/* 98 */                IoOIOIOiI10O ioOIOIOiI10O = new IoOIOIOiI10O();
/* 101 */               ioOIOIOiI10O.I00000oIO = iIntValue;
/* 105 */               ioOIOIOiI10O.I00000oOI = this.I00ilO0;
/* 107 */               VarHandle.storeStoreFence();
/* 126 */               for (Function3 function3 : IOOi0Ool1i.I00OIo(this.I00ilI0I1.I00000oIO)) {
/* 136 */                   IoOIOIiIiii1 ioOIOIiIiii1 = new IoOIOIiIiii1();
/* 139 */                   ioOIOIiIiii1.I00000oIO = function3;
/* 141 */                   ioOIOIiIiii1.I00000oOI = ioOIOIOiI10O;
/* 143 */                   VarHandle.storeStoreFence();
/* 146 */                   ioOIOIOiI10O = ioOIOIiIiii1;
                        }
/* 148 */               this.I00iiO = oO11OoloI;
/* 150 */               this.I00iio = null;
/* 152 */               this.I00iOIl = iIntValue;
/* 154 */               this.I00iiI = 1;
/* 156 */               obj = ioOIOIOiI10O.I00000oIO(ioO10oI0o2, this);
/* 160 */               if (obj != ii0111o) {
                        }
/* 179 */               return ii0111o;
                    }
/* 14 */            if (i != 1) {
/* 16 */                if (i == 2) {
/* 18 */                    lIoii1l01l0i.I00000oOI(obj);
/* 180 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 25 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                return null;
                    }
/* 29 */            iIntValue = this.I00iOIl;
/* 31 */            lIoii1l01l0i.I00000oOI(obj);
/* 165 */           this.I00iiO = null;
/* 167 */           this.I00iio = null;
/* 169 */           this.I00iOIl = iIntValue;
/* 171 */           this.I00iiI = 2;
                }
            }

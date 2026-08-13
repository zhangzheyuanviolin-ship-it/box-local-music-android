            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import com.google.mlkit.genai.prompt.GenerationConfig;
            import com.google.mlkit.genai.prompt.ModelConfig;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.security.MessageDigest;
            import java.security.Provider;
            import java.util.List;
            
/* 27 */    public final class l1I0oI implements I1iil1I00, IOIoiiol, lIoio0O1ioo, O1l0OiO10IoI, IIO1Oili, Ii00l0i1loO, Il0OlI, i0i0lO11loi, i1li10loi, iiOOiO011l00, iiIi1oo0Io, ili0l0oo0, IioIOllO1, IOiOiIIiii1 {
                public static l1I0oI I00iiI;
                public static final l1I0oI I00ilO0;
                public static final l1I0oI I00io1l;
                public static final l1I0oI I00ioIO;
                public static final l1I0oI I00l0I0l0lO1;
                public static final l1I0oI I00l0OO0IO;
                public static final l1I0oI I00li1OI;
                public final int I00iOIl;
                public static final l1I0oI I00iiO = new l1I0oI(1);
                public static final l1I0oI I00iio = new l1I0oI(2);
                public static final l1I0oI I00ilI0I1 = new l1I0oI(3);
                public static final l1I0oI I00ll1 = new l1I0oI(6);
                public static final l1I0oI I00lli11 = new l1I0oI(7);
                public static final l1I0oI I00lll10 = new l1I0oI(21);
                public static final l1I0oI I00o0iI0io1 = new l1I0oI(22);
                public static final l1I0oI I00o0l1o1o0 = new l1I0oI(23);
                public static final l1I0oI I00o101lO = new l1I0oI(25);

                static {
/* 27 */            int i = 4;
/* 31 */            I00ilO0 = new l1I0oI(i);
/* 38 */            I00io1l = new l1I0oI(i);
/* 45 */            I00ioIO = new l1I0oI(i);
/* 52 */            I00l0I0l0lO1 = new l1I0oI(i);
/* 59 */            I00l0OO0IO = new l1I0oI(i);
/* 66 */            I00li1OI = new l1I0oI(i);
                }

                public l1I0oI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static OolOiI0I I0001Ioi1lo(Ool10o ool10o) {
                    return ool10o instanceof OOIIOiolI ? OolOiI0I.I00iiO : ool10o instanceof Ioi1Io1o ? OolOiI0I.I00iio : ool10o instanceof Ioi01I0 ? OolOiI0I.I00ilI0I1 : li0IooIlo10.I00000oOI(ool10o) ? OolOiI0I.I00ilO0 : ool10o instanceof OlOO1Io010o ? OolOiI0I.I00io1l : OolOiI0I.I00ioIO;
                }

                public static OiII0Oi I000OiO(O00llIO00 o00llIO00) {
/* 5 */             OiII0Oi oiII0Oi = new OiII0Oi();
/* 8 */             oiII0Oi.I00iOIl = (OOoI1O) o00llIO00;
/* 10 */            VarHandle.storeStoreFence();
/* 49 */            return oiII0Oi;
                }

                public static final Context I0010I0i() {
/* 7 */             return (Context) o1I0I0O.I000l1.getValue();
                }

                public static synchronized void I0010o() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new l1I0oI(0);
                    }
                }

                public static final int I00111O(GenerationConfig generationConfig, o0oi1IOOoI o0oi1ioooi) {
/* 1 */             ModelConfig modelConfig = generationConfig.getZzb();
/* 5 */             int zza = modelConfig.getZza();
/* 12 */            if (zza != 0) {
/* 14 */                if (zza != 1) {
/* 70 */                    return -1;
                        }
/* 17 */                int zzb = modelConfig.getZzb();
/* 21 */                if (zzb == 1) {
/* 43 */                    o0oi1IOOoI o0oi1ioooi2 = o0oi1IOOoI.I00iOIl;
/* 45 */                    int iOrdinal = o0oi1ioooi.ordinal();
/* 49 */                    if (iOrdinal != 0) {
                                return iOrdinal != 3 ? -1 : 653;
                            }
/* 57 */                    return 646;
                        }
/* 23 */                if (zzb != 2) {
/* 70 */                    return -1;
                        }
/* 26 */                o0oi1IOOoI o0oi1ioooi3 = o0oi1IOOoI.I00iOIl;
/* 28 */                int iOrdinal2 = o0oi1ioooi.ordinal();
/* 32 */                if (iOrdinal2 != 0) {
                            return iOrdinal2 != 3 ? -1 : 652;
                        }
/* 40 */                return 647;
                    }
/* 60 */            int zzb2 = modelConfig.getZzb();
/* 66 */            if (zzb2 == 1) {
/* 107 */               o0oi1IOOoI o0oi1ioooi4 = o0oi1IOOoI.I00iOIl;
/* 109 */               int iOrdinal3 = o0oi1ioooi.ordinal();
/* 113 */               if (iOrdinal3 == 0) {
/* 139 */                   return 645;
                        }
/* 115 */               if (iOrdinal3 == 1) {
/* 136 */                   return 649;
                        }
/* 117 */               if (iOrdinal3 == 2) {
/* 133 */                   return 650;
                        }
/* 119 */               if (iOrdinal3 == 3) {
/* 130 */                   return 651;
                        }
/* 121 */               if (iOrdinal3 == 4) {
/* 123 */                   return 655;
                        }
/* 126 */               I000II.I00000oIO();
/* 64 */                return 0;
                    }
/* 68 */            if (zzb2 != 2) {
/* 70 */                return -1;
                    }
/* 72 */            o0oi1IOOoI o0oi1ioooi5 = o0oi1IOOoI.I00iOIl;
/* 74 */            int iOrdinal4 = o0oi1ioooi.ordinal();
/* 78 */            if (iOrdinal4 == 0) {
/* 104 */               return 636;
                    }
/* 80 */            if (iOrdinal4 == 1) {
/* 101 */               return 643;
                    }
/* 82 */            if (iOrdinal4 == 2) {
/* 98 */                return 644;
                    }
/* 84 */            if (iOrdinal4 == 3) {
/* 95 */                return 648;
                    }
/* 86 */            if (iOrdinal4 == 4) {
/* 88 */                return 654;
                    }
/* 91 */            I000II.I00000oIO();
/* 64 */            return 0;
                }

                @Override
                public byte[] I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             byte[] bArr2 = new byte[i2];
/* 4 */             System.arraycopy(bArr, i, bArr2, 0, i2);
/* 215 */           return bArr2;
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r3
                  0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IioIO1i I000OOo1O(Context context, String str, IioI1o1 iioI1o1) {
/* 3 */             IioIO1i iioIO1i = new IioIO1i();
/* 10 */            iioIO1i.I00000oOI = iioI1o1.I0000O(context, str);
/* 12 */            int i = 1;
/* 13 */            int iI0000Il00O = iioI1o1.I0000Il00O(context, str, true);
/* 17 */            iioIO1i.I0000Il00O = iI0000Il00O;
/* 19 */            int i2 = iioIO1i.I00000oOI;
/* 21 */            if (i2 == 0) {
/* 23 */                i2 = 0;
/* 24 */                if (iI0000Il00O == 0) {
/* 26 */                    i = 0;
                        } else if (i2 >= iI0000Il00O) {
/* 30 */                    i = -1;
                        }
                    }
/* 31 */            iioIO1i.I0000O = i;
/* 215 */           return iioIO1i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 14 */            ioIlI1oli.I00ilI0I1.I000II(IoO0l0Iiioll.I00100o1O0lo, new I0i11IIlO((IlliOIo0o10) oll0io, (IOoil1iiIilo) null, 7));
                }

                @Override
                public boolean I000lI(O1illlIiilIl o1illlIiilIl) {
/* 1 */             return false;
                }

                @Override
                public int I00O10llo() {
/* 1 */             return 1;
                }

                @Override
                public void close(long j, long j2, long j3, long j4, long j5) {
/* 1 */             int i = this.I00iOIl;
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 13 */            return new Oioo1I0o((Context) ((I1ii1o0) iOiOIoiiO0i).I00000oIO(Context.class));
                }

                @Override
                public byte[] getAnalyticsLogs(long j) {
/* 2 */             return new byte[0];
                }

                @Override
                public long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1L;
                }

                @Override
                public long initializeFrameBufferReleaseCallback(long j) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1L;
                }

                @Override
                public long initializeFrameManager() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1L;
                }

                @Override
                public long initializeIsolationCallback() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1L;
                }

                @Override
                public long initializeResultsCallback() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return 1L;
                }

                @Override
                public byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4) {
                    switch (this.I00iOIl) {
                        case 17:
/* 19 */                    return i0o10lO1i.I000oI1ioi().I00000oOI();
                        default:
/* 10 */                    return il1looOi.I001IIilI0O().I0000O();
                    }
                }

                @Override
                public byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4) {
                    switch (this.I00iOIl) {
                        case 17:
/* 19 */                    return i0o10lO1i.I000oI1ioi().I00000oOI();
                        default:
/* 10 */                    return il1looOi.I001IIilI0O().I0000O();
                    }
                }

                @Override
                public byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
                    switch (this.I00iOIl) {
                        case 17:
/* 19 */                    return i0o10lO1i.I000oI1ioi().I00000oOI();
                        default:
/* 10 */                    return il1looOi.I001IIilI0O().I0000O();
                    }
                }

                @Override
                public void start(long j) {
/* 1 */             int i = this.I00iOIl;
                }

                @Override
                public boolean stop(long j) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return true;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 15:
/* 11 */                    return "SharingStarted.Eagerly";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public void waitUntilIdle(long j) {
/* 1 */             int i = this.I00iOIl;
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 92 */                    List list = iol1II1ii1i.I00000oIO;
/* 96 */                    iI1lO0li.I00iiI.get();
/* 115 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 65 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 69 */                    iI1lO0li.I00iiI.get();
/* 89 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(73, 518400000L, "measurement.upload.max_queue_time").get();
                        case PoseLandmark.LEFT_HIP:
/* 30 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 34 */                    iI1lO0li.I00iiI.get();
/* 60 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(67, 100L, "measurement.upload.max_bundles").get()).longValue());
                        default:
/* 6 */                     List list4 = iol1II1ii1i.I00000oIO;
/* 10 */                    iIO0ooOool.I00iiI.get();
/* 27 */                    return (Boolean) iIO1lO.I00000oIO.I0010o(true, "measurement.rb.attribution.enable_trigger_redaction", 7).get();
                    }
                }

                @Override
                public lO1i1o0O0o mo39zzb(Class cls) {
/* 8 */             if (!lIIOO0oi1o.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (lO1i1o0O0o) lIIOO0oi1o.I000lI(cls.asSubclass(lIIOO0oi1o.class)).I000OiO(3, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public boolean zzc(Class cls) {
                    switch (this.I00iOIl) {
                        case 7:
/* 10 */                    return lIIOO0oi1o.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }

                @Override
/* 28 */        public void I000l1() {
                }

/* 48 */        private final void I000o00OoI0I(long j) {
                }

/* 48 */        private final void I000oI1ioi(long j) {
                }

/* 48 */        private final void I00100l0(long j) {
                }

/* 48 */        private final void I00100o1O0lo(long j) {
                }

                @Override
/* 54 */        public i1oI1I00i0 zzb(Class cls) {
/* 55 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
/* 88 */        public void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
                }

                @Override
/* 118 */       public void mo40zza() {
                }

/* 965 */       private final void I00000oOI(long j, long j2, long j3, long j4, long j5) {
                }

/* 965 */       private final void I0000Il00O(long j, long j2, long j3, long j4, long j5) {
                }
            }

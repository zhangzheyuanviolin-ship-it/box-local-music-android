            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import p000.Il0IO001iOOo;
            import p000.IlIO00o1;
            import p000.OIOi0lOI;
            import p000.OIOi0o;
            import p000.OoloOoIl;
            import p000.iilo0lOo110;
            import p000.io1OllI;
            
/* 8 */     final class zzkc implements OIOi0o {
                private static final Charset zza = Charset.forName("UTF-8");
                private static final IlIO00o1 zzb = io1OllI.I0001Ioi1lo(1, IlIO00o1.I00000oIO("key"));
                private static final IlIO00o1 zzc = io1OllI.I0001Ioi1lo(2, IlIO00o1.I00000oIO("value"));
                private static final OIOi0lOI zzd = new OIOi0lOI() {
                    @Override
                    public final void encode(Object obj, Object obj2) {
/* 5 */                 zzkc.zzg((Map.Entry) obj, (OIOi0o) obj2);
                    }
                };
                private OutputStream zze;
                private final Map zzf;
                private final Map zzg;
                private final OIOi0lOI zzh;
                private final zzkg zzi = new zzkg(this);

                public zzkc(OutputStream outputStream, Map map, Map map2, OIOi0lOI oIOi0lOI) {
/* 11 */            this.zze = outputStream;
/* 13 */            this.zzf = map;
/* 15 */            this.zzg = map2;
/* 17 */            this.zzh = oIOi0lOI;
                }

                public static void zzg(Map.Entry entry, OIOi0o oIOi0o) {
/* 7 */             oIOi0o.add(zzb, entry.getKey());
/* 16 */            oIOi0o.add(zzc, entry.getValue());
                }

                private static int zzh(IlIO00o1 ilIO00o1) {
/* 7 */             zzka zzkaVar = (zzka) ilIO00o1.I00000oOI(zzka.class);
/* 9 */             if (zzkaVar != null) {
/* 11 */                return zzkaVar.zza();
                    }
/* 18 */            iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 21 */            return 0;
                }

                private final long zzi(OIOi0lOI oIOi0lOI, Object obj) throws IOException {
/* 3 */             zzjx zzjxVar = new zzjx();
                    try {
/* 6 */                 OutputStream outputStream = this.zze;
/* 8 */                 this.zze = zzjxVar;
                        try {
/* 10 */                    oIOi0lOI.encode(obj, this);
/* 13 */                    this.zze = outputStream;
/* 15 */                    long jZza = zzjxVar.zza();
/* 19 */                    zzjxVar.close();
/* 22 */                    return jZza;
                        } catch (Throwable th) {
/* 26 */                    this.zze = outputStream;
/* 28 */                    throw th;
                        }
                    } catch (Throwable th2) {
                        try {
/* 29 */                    zzjxVar.close();
                        } catch (Throwable th3) {
/* 34 */                    th2.addSuppressed(th3);
                        }
/* 37 */                throw th2;
                    }
                }

                private static zzka zzj(IlIO00o1 ilIO00o1) {
/* 7 */             zzka zzkaVar = (zzka) ilIO00o1.I00000oOI(zzka.class);
/* 9 */             if (zzkaVar != null) {
/* 11 */                return zzkaVar;
                    }
/* 14 */            iilo0lOo110.I0000O("Field has no @Protobuf config");
/* 17 */            return null;
                }

                private final zzkc zzk(OIOi0lOI oIOi0lOI, IlIO00o1 ilIO00o1, Object obj, boolean z) throws IOException {
/* 1 */             long jZzi = zzi(oIOi0lOI, obj);
/* 5 */             if (z && jZzi == 0) {
/* 13 */                return this;
                    }
/* 22 */            zzn((zzh(ilIO00o1) << 3) | 2);
/* 25 */            zzo(jZzi);
/* 28 */            oIOi0lOI.encode(obj, this);
/* 204 */           return this;
                }

                private final zzkc zzl(OoloOoIl ooloOoIl, IlIO00o1 ilIO00o1, Object obj, boolean z) {
/* 1 */             zzkg zzkgVar = this.zzi;
/* 3 */             zzkgVar.zza(ilIO00o1, z);
/* 6 */             ooloOoIl.encode(obj, zzkgVar);
/* 204 */           return this;
                }

                private static ByteBuffer zzm(int i) {
/* 7 */             return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
                }

                private final void zzn(int i) throws IOException {
                    while (true) {
/* 1 */                 long j = i & (-128);
/* 8 */                 int i2 = i & 127;
/* 10 */                OutputStream outputStream = this.zze;
/* 12 */                if (j == 0) {
/* 22 */                    outputStream.write(i2);
/* 29 */                    return;
                        } else {
/* 16 */                    outputStream.write(i2 | Barcode.FORMAT_ITF);
/* 19 */                    i >>>= 7;
                        }
                    }
                }

                private final void zzo(long j) throws IOException {
                    while (true) {
/* 3 */                 long j2 = (-128) & j;
/* 9 */                 int i = ((int) j) & 127;
/* 11 */                OutputStream outputStream = this.zze;
/* 13 */                if (j2 == 0) {
/* 23 */                    outputStream.write(i);
/* 29 */                    return;
                        } else {
/* 17 */                    outputStream.write(i | Barcode.FORMAT_ITF);
/* 21 */                    j >>>= 7;
                        }
                    }
                }

                public final OIOi0o add(String str, double d) throws IOException {
/* 6 */             zza(IlIO00o1.I0000Il00O(str), d, true);
/* 37 */            return this;
                }

                public final OIOi0o inline(Object obj) {
/* 1 */             zzf(obj);
/* 29 */            return this;
                }

                public final OIOi0o nested(String str) {
/* 5 */             return nested(IlIO00o1.I0000Il00O(str));
                }

                public final OIOi0o zza(IlIO00o1 ilIO00o1, double d, boolean z) throws IOException {
/* 1 */             if (z && d == 0.0d) {
/* 9 */                 return this;
                    }
/* 18 */            zzn((zzh(ilIO00o1) << 3) | 1);
/* 37 */            this.zze.write(zzm(8).putDouble(d).array());
/* 98 */            return this;
                }

                public final OIOi0o zzb(IlIO00o1 ilIO00o1, float f, boolean z) throws IOException {
/* 1 */             if (z && f == 0.0f) {
/* 8 */                 return this;
                    }
/* 17 */            zzn((zzh(ilIO00o1) << 3) | 5);
/* 35 */            this.zze.write(zzm(4).putFloat(f).array());
/* 98 */            return this;
                }

                public final OIOi0o zzc(IlIO00o1 ilIO00o1, Object obj, boolean z) throws IOException {
/* 1 */             if (obj != null) {
/* 7 */                 if (obj instanceof CharSequence) {
/* 9 */                     CharSequence charSequence = (CharSequence) obj;
/* 11 */                    if (!z || charSequence.length() != 0) {
/* 27 */                        zzn((zzh(ilIO00o1) << 3) | 2);
/* 36 */                        byte[] bytes = charSequence.toString().getBytes(zza);
/* 41 */                        zzn(bytes.length);
/* 46 */                        this.zze.write(bytes);
/* 49 */                        return this;
                            }
                        } else if (obj instanceof Collection) {
/* 57 */                    Iterator it = ((Collection) obj).iterator();
/* 65 */                    while (it.hasNext()) {
/* 71 */                        zzc(ilIO00o1, it.next(), false);
                            }
                        } else if (obj instanceof Map) {
/* 85 */                    Iterator it2 = ((Map) obj).entrySet().iterator();
/* 93 */                    while (it2.hasNext()) {
/* 103 */                       zzk(zzd, ilIO00o1, (Map.Entry) it2.next(), false);
                            }
                        } else {
/* 109 */                   if (obj instanceof Double) {
/* 117 */                       zza(ilIO00o1, ((Double) obj).doubleValue(), z);
/* 120 */                       return this;
                            }
/* 123 */                   if (obj instanceof Float) {
/* 131 */                       zzb(ilIO00o1, ((Float) obj).floatValue(), z);
/* 134 */                       return this;
                            }
/* 137 */                   if (obj instanceof Number) {
/* 145 */                       zze(ilIO00o1, ((Number) obj).longValue(), z);
/* 148 */                       return this;
                            }
/* 151 */                   if (obj instanceof Boolean) {
/* 159 */                       zzd(ilIO00o1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
/* 162 */                       return this;
                            }
/* 165 */                   if (!(obj instanceof byte[])) {
/* 207 */                       OIOi0lOI oIOi0lOI = (OIOi0lOI) this.zzf.get(obj.getClass());
/* 209 */                       if (oIOi0lOI != null) {
/* 211 */                           zzk(oIOi0lOI, ilIO00o1, obj, z);
/* 214 */                           return this;
                                }
/* 225 */                       OoloOoIl ooloOoIl = (OoloOoIl) this.zzg.get(obj.getClass());
/* 227 */                       if (ooloOoIl != null) {
/* 229 */                           zzl(ooloOoIl, ilIO00o1, obj, z);
/* 232 */                           return this;
                                }
/* 236 */                       if (obj instanceof zzjy) {
/* 244 */                           zzd(ilIO00o1, ((zzjy) obj).zza(), true);
/* 247 */                           return this;
                                }
/* 250 */                       if (obj instanceof Enum) {
/* 258 */                           zzd(ilIO00o1, ((Enum) obj).ordinal(), true);
/* 261 */                           return this;
                                }
/* 264 */                       zzk(this.zzh, ilIO00o1, obj, z);
/* 408 */                       return this;
                            }
/* 167 */                   byte[] bArr = (byte[]) obj;
/* 169 */                   if (!z || bArr.length != 0) {
/* 184 */                       zzn((zzh(ilIO00o1) << 3) | 2);
/* 188 */                       zzn(bArr.length);
/* 193 */                       this.zze.write(bArr);
/* 196 */                       return this;
                            }
                        }
                    }
/* 175 */           return this;
                }

                public final zzkc zzd(IlIO00o1 ilIO00o1, int i, boolean z) throws IOException {
/* 1 */             if (!z || i != 0) {
/* 5 */                 zzka zzkaVarZzj = zzj(ilIO00o1);
/* 13 */                int iOrdinal = zzkaVarZzj.zzb().ordinal();
/* 17 */                if (iOrdinal == 0) {
/* 80 */                    zzn(zzkaVarZzj.zza() << 3);
/* 83 */                    zzn(i);
/* 98 */                    return this;
                        }
/* 20 */                if (iOrdinal == 1) {
/* 62 */                    zzn(zzkaVarZzj.zza() << 3);
/* 70 */                    zzn((i + i) ^ (i >> 31));
/* 73 */                    return this;
                        }
/* 23 */                if (iOrdinal == 2) {
/* 34 */                    zzn((zzkaVarZzj.zza() << 3) | 5);
/* 52 */                    this.zze.write(zzm(4).putInt(i).array());
/* 55 */                    return this;
                        }
                    }
/* 25 */            return this;
                }

                public final zzkc zze(IlIO00o1 ilIO00o1, long j, boolean z) throws IOException {
/* 1 */             if (!z || j != 0) {
/* 9 */                 zzka zzkaVarZzj = zzj(ilIO00o1);
/* 17 */                int iOrdinal = zzkaVarZzj.zzb().ordinal();
/* 21 */                if (iOrdinal == 0) {
/* 86 */                    zzn(zzkaVarZzj.zza() << 3);
/* 89 */                    zzo(j);
/* 98 */                    return this;
                        }
/* 24 */                if (iOrdinal == 1) {
/* 66 */                    zzn(zzkaVarZzj.zza() << 3);
/* 76 */                    zzo((j >> 63) ^ (j + j));
/* 79 */                    return this;
                        }
/* 27 */                if (iOrdinal == 2) {
/* 37 */                    zzn((zzkaVarZzj.zza() << 3) | 1);
/* 56 */                    this.zze.write(zzm(8).putLong(j).array());
/* 59 */                    return this;
                        }
                    }
/* 29 */            return this;
                }

                public final zzkc zzf(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return this;
                    }
/* 14 */            OIOi0lOI oIOi0lOI = (OIOi0lOI) this.zzf.get(obj.getClass());
/* 16 */            if (oIOi0lOI != null) {
/* 18 */                oIOi0lOI.encode(obj, this);
/* 21 */                return this;
                    }
/* 36 */            iilo0lOo110.I0000O("No encoder for ".concat(String.valueOf(obj.getClass())));
/* 39 */            return null;
                }

/* 9 */         public final OIOi0o add(IlIO00o1 ilIO00o1, float f) throws IOException {
/* 10 */            zzb(ilIO00o1, f, true);
                    return this;
                }

/* 9 */         public final OIOi0o nested(IlIO00o1 ilIO00o1) {
/* 12 */            throw new Il0IO001iOOo("nested() is not implemented for protobuf encoding.");
                }

                @Override
/* 10 */        public final OIOi0o add(IlIO00o1 ilIO00o1, int i) throws IOException {
/* 11 */            zzd(ilIO00o1, i, true);
                    return this;
                }

                @Override
/* 11 */        public final OIOi0o add(IlIO00o1 ilIO00o1, long j) throws IOException {
/* 12 */            zze(ilIO00o1, j, true);
                    return this;
                }

                @Override
/* 12 */        public final OIOi0o add(IlIO00o1 ilIO00o1, Object obj) throws IOException {
/* 13 */            zzc(ilIO00o1, obj, true);
                    return this;
                }

/* 13 */        public final OIOi0o add(IlIO00o1 ilIO00o1, boolean z) throws IOException {
/* 14 */            zzd(ilIO00o1, z ? 1 : 0, true);
                    return this;
                }

/* 14 */        public final OIOi0o add(IlIO00o1 ilIO00o1, double d) throws IOException {
/* 15 */            zza(ilIO00o1, d, true);
                    return this;
                }

/* 15 */        public final OIOi0o add(String str, int i) throws IOException {
/* 17 */            zzd(IlIO00o1.I0000Il00O(str), i, true);
                    return this;
                }

/* 17 */        public final OIOi0o add(String str, long j) throws IOException {
/* 19 */            zze(IlIO00o1.I0000Il00O(str), j, true);
                    return this;
                }

/* 19 */        public final OIOi0o add(String str, Object obj) throws IOException {
/* 21 */            zzc(IlIO00o1.I0000Il00O(str), obj, true);
                    return this;
                }

/* 21 */        public final OIOi0o add(String str, boolean z) throws IOException {
/* 23 */            zzd(IlIO00o1.I0000Il00O(str), z ? 1 : 0, true);
                    return this;
                }
            }

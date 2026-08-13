            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Reader;
            import java.util.Arrays;
            import java.util.Objects;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.Oi010OO0;
            
            public final class zzkr implements Closeable {
                private final Reader zzb;
                private long zzh;
                private int zzi;
                private String zzj;
                private int[] zzk;
                private String[] zzm;
                private int[] zzn;
                private final char[] zzc = new char[Barcode.FORMAT_UPC_E];
                private int zzd = 0;
                private int zze = 0;
                private int zzf = 0;
                private int zzg = 0;
                int zza = 0;
                private int zzl = 1;

                static {
/* 6 */             zzkp.zza = new zzkq();
                }

                public zzkr(Reader reader) {
/* 23 */            int[] iArr = new int[32];
/* 25 */            this.zzk = iArr;
/* 31 */            iArr[0] = 6;
/* 35 */            this.zzm = new String[32];
/* 39 */            this.zzn = new int[32];
/* 43 */            Objects.requireNonNull(reader, "in == null");
/* 46 */            this.zzb = reader;
                }

                private final int zzo(boolean z) throws IOException {
/* 1 */             int i = this.zzd;
/* 3 */             int i2 = this.zze;
                    while (true) {
/* 6 */                 if (i == i2) {
/* 8 */                     this.zzd = i;
/* 14 */                    if (!zzv(1)) {
/* 16 */                        if (z) {
/* 35 */                            throw new EOFException("End of input".concat(zzd()));
                                }
/* 18 */                        return -1;
                            }
/* 36 */                    i = this.zzd;
/* 38 */                    i2 = this.zze;
                        }
/* 42 */                int i3 = i + 1;
/* 44 */                char c = this.zzc[i];
/* 48 */                if (c == '\n') {
                            this.zzf++;
/* 55 */                    this.zzg = i3;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 75 */                    if (c != '/') {
/* 103 */                       if (c != '#') {
/* 105 */                           this.zzd = i3;
/* 107 */                           return c;
                                }
/* 108 */                       this.zzd = i3;
/* 114 */                       throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                            }
/* 77 */                    this.zzd = i3;
/* 79 */                    if (i3 == i2) {
/* 81 */                        this.zzd = i;
/* 84 */                        boolean zZzv = zzv(2);
                                this.zzd++;
/* 93 */                        if (!zZzv) {
/* 73 */                            return 47;
                                }
                            }
/* 100 */                   throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
/* 115 */               i = i3;
                    }
                }

                private final zzks zzp(String str) throws zzks {
/* 77 */            throw new zzks(str + zzd() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
                }

                private final IllegalStateException zzq(String str) throws IOException {
                    String str2;
/* 1 */             int iZzn = zzn();
                    switch (zzn()) {
                        case 1:
/* 41 */                    str2 = "BEGIN_ARRAY";
                            break;
                        case 2:
/* 38 */                    str2 = "END_ARRAY";
                            break;
                        case 3:
/* 35 */                    str2 = "BEGIN_OBJECT";
                            break;
                        case 4:
/* 32 */                    str2 = "END_OBJECT";
                            break;
                        case 5:
/* 29 */                    str2 = "NAME";
                            break;
                        case 6:
/* 26 */                    str2 = "STRING";
                            break;
                        case 7:
/* 23 */                    str2 = "NUMBER";
                            break;
                        case 8:
/* 20 */                    str2 = "BOOLEAN";
                            break;
                        case 9:
/* 17 */                    str2 = "NULL";
                            break;
                        default:
/* 14 */                    str2 = "END_DOCUMENT";
                            break;
                    }
/* 51 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Expected ", str, " but was ", str2, zzd());
/* 57 */            sbI00111O.append("\nSee ");
/* 75 */            sbI00111O.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzn == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
/* 82 */            return new IllegalStateException(sbI00111O.toString());
                }

                private final String zzr(boolean z) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 11 */            for (int i = 0; i < this.zzl; i++) {
/* 15 */                int i2 = this.zzk[i];
                        switch (i2) {
                            case 1:
                            case 2:
/* 48 */                        int i3 = this.zzn[i];
/* 52 */                        sb.append('[');
/* 55 */                        sb.append(i3);
/* 60 */                        sb.append(']');
                                break;
                            case 3:
                            case 4:
                            case 5:
/* 33 */                        sb.append('.');
/* 38 */                        String str = this.zzm[i];
/* 40 */                        if (str != null) {
/* 42 */                            sb.append(str);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
/* 26 */                        I000II.I000O01llI0(Oi010OO0.I000oI1ioi(i2, "Unknown scope value: "));
/* 29 */                        return null;
                        }
                    }
/* 66 */            return sb.toString();
                }

                /* JADX WARN: Code restructure failed: missing block: B:87:0x0115, code lost:
                
                    r3 = r1 - r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x0117, code lost:
                
                    if (r0 != null) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0119, code lost:
                
                    r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x0125, code lost:
                
                    r0.append(r4, r2, r3);
                    r10.zzd = r1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final String zzs(char c) throws zzks {
                    char[] cArr;
                    int i;
/* 1 */             StringBuilder sb = null;
/* 303 */           loop0: do {
/* 2 */                 int i2 = this.zzd;
/* 4 */                 int i3 = this.zze;
/* 7 */                 int i4 = i2;
                        while (true) {
/* 8 */                     cArr = this.zzc;
/* 13 */                    if (i2 >= i3) {
                                break;
                            }
/* 15 */                    int i5 = i2 + 1;
/* 17 */                    char c2 = cArr[i2];
/* 19 */                    if (c2 == c) {
                                int i6 = (i5 - i4) - 1;
/* 25 */                        this.zzd = i5;
/* 27 */                        if (sb == null) {
/* 31 */                            return new String(cArr, i4, i6);
                                }
/* 35 */                        sb.append(cArr, i4, i6);
/* 38 */                        return sb.toString();
                            }
/* 45 */                    char c3 = '\n';
/* 47 */                    if (c2 == '\\') {
/* 49 */                        int i7 = i5 - i4;
                                int i8 = i7 - 1;
/* 53 */                        this.zzd = i5;
/* 55 */                        if (sb == null) {
/* 64 */                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                                }
/* 67 */                        sb.append(cArr, i4, i8);
/* 76 */                        if (this.zzd == this.zze && !zzv(1)) {
/* 89 */                            throw zzp("Unterminated escape sequence");
                                }
/* 90 */                        int i9 = this.zzd;
/* 92 */                        int i10 = i9 + 1;
/* 94 */                        this.zzd = i10;
/* 96 */                        char c4 = cArr[i9];
/* 98 */                        if (c4 != '\n') {
/* 102 */                           if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
/* 116 */                               if (c4 == 'b') {
/* 245 */                                   c3 = '\b';
                                        } else if (c4 == 'f') {
/* 242 */                                   c3 = '\f';
                                        } else if (c4 != 'n') {
/* 128 */                                   if (c4 == 'r') {
/* 239 */                                       c3 = '\r';
                                            } else if (c4 == 't') {
/* 236 */                                       c3 = '\t';
                                            } else {
/* 136 */                                       if (c4 != 'u') {
/* 235 */                                           throw zzp("Invalid escape sequence");
                                                }
/* 143 */                                       if (i9 + 5 > this.zze && !zzv(4)) {
/* 156 */                                           throw zzp("Unterminated escape sequence");
                                                }
/* 157 */                                       int i11 = this.zzd;
/* 159 */                                       int i12 = i11 + 4;
/* 161 */                                       int i13 = 0;
/* 162 */                                       while (i11 < i12) {
/* 164 */                                           int i14 = i13 << 4;
/* 166 */                                           char c5 = cArr[i11];
/* 170 */                                           if (c5 >= '0' && c5 <= '9') {
                                                        i = c5 - '0';
                                                    } else if (c5 >= 'a' && c5 <= 'f') {
                                                        i = c5 - 'W';
                                                    } else {
/* 192 */                                               if (c5 < 'A' || c5 > 'F') {
                                                            break loop0;
                                                        }
                                                        i = c5 - '7';
                                                    }
/* 178 */                                           i13 = i + i14;
/* 201 */                                           i11++;
                                                }
                                                this.zzd += 4;
/* 227 */                                       c3 = (char) i13;
                                            }
                                        }
                                    }
/* 256 */                           sb.append(c3);
/* 259 */                           i4 = this.zzd;
/* 261 */                           i3 = this.zze;
/* 263 */                           i2 = i4;
                                } else {
                                    this.zzf++;
/* 253 */                           this.zzg = i10;
                                }
/* 255 */                       c3 = c4;
/* 256 */                       sb.append(c3);
/* 259 */                       i4 = this.zzd;
/* 261 */                       i3 = this.zze;
/* 263 */                       i2 = i4;
                            } else {
/* 266 */                       if (c2 == '\n') {
                                    this.zzf++;
/* 273 */                           this.zzg = i5;
                                }
/* 275 */                       i2 = i5;
                            }
                        }
/* 221 */               throw zzp("Malformed Unicode escape \\u".concat(new String(cArr, this.zzd, 4)));
/* 303 */           } while (zzv(1));
/* 437 */           throw zzp("Unterminated string");
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
                
                    throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                 */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final String zzt() throws zzks {
                    String string;
/* 1 */             int i = 0;
/* 2 */             StringBuilder sb = null;
/* 125 */           do {
/* 3 */                 int i2 = 0;
                        while (true) {
/* 6 */                     int i3 = this.zzd + i2;
/* 9 */                     if (i3 < this.zze) {
/* 13 */                        char c = this.zzc[i3];
/* 17 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 37 */                            if (c != '#') {
/* 41 */                                if (c != ',') {
/* 45 */                                    if (c != '/' && c != '=') {
/* 53 */                                        if (c != '{' && c != '}' && c != ':') {
/* 65 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 70 */                                                        i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i2 >= 1024) {
/* 95 */                        if (sb == null) {
/* 105 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 112 */                       sb.append(this.zzc, this.zzd, i2);
                                this.zzd += i2;
                            } else if (zzv(i2 + 1)) {
                            }
                        }
/* 93 */                i = i2;
/* 127 */               char[] cArr = this.zzc;
/* 129 */               if (sb != null) {
/* 135 */                   string = new String(cArr, this.zzd, i);
                        } else {
/* 141 */                   sb.append(cArr, this.zzd, i);
/* 144 */                   string = sb.toString();
                        }
                        this.zzd += i;
/* 153 */               return string;
/* 125 */           } while (zzv(1));
/* 127 */           char[] cArr2 = this.zzc;
/* 129 */           if (sb != null) {
                    }
                    this.zzd += i;
/* 153 */           return string;
                }

                private final void zzu(int i) throws zzks {
/* 1 */             int i2 = this.zzl;
/* 7 */             if (i2 - 1 >= 1280) {
/* 77 */                throw new zzks(IIl001iO0Io.I000o00OoI0I("Nesting limit 1280 reached", zzd()));
                    }
/* 9 */             int[] iArr = this.zzk;
/* 12 */            if (i2 == iArr.length) {
/* 14 */                int i3 = i2 + i2;
/* 19 */                this.zzk = Arrays.copyOf(iArr, i3);
/* 27 */                this.zzn = Arrays.copyOf(this.zzn, i3);
/* 37 */                this.zzm = (String[]) Arrays.copyOf(this.zzm, i3);
                    }
/* 39 */            int[] iArr2 = this.zzk;
/* 41 */            int i4 = this.zzl;
/* 45 */            this.zzl = i4 + 1;
/* 47 */            iArr2[i4] = i;
                }

                private final boolean zzv(int i) throws IOException {
                    int i2;
/* 1 */             int i3 = this.zzg;
/* 3 */             int i4 = this.zzd;
/* 6 */             this.zzg = i3 - i4;
/* 8 */             char[] cArr = this.zzc;
/* 10 */            int i5 = this.zze;
/* 13 */            if (i5 != i4) {
/* 15 */                int i6 = i5 - i4;
/* 16 */                this.zze = i6;
/* 18 */                System.arraycopy(cArr, i4, cArr, 0, i6);
                    } else {
/* 22 */                this.zze = 0;
                    }
/* 24 */            this.zzd = 0;
/* 71 */            do {
/* 26 */                Reader reader = this.zzb;
/* 28 */                int i7 = this.zze;
/* 32 */                int i8 = reader.read(cArr, i7, 1024 - i7);
/* 37 */                if (i8 == -1) {
/* 12 */                    return false;
                        }
/* 41 */                i2 = this.zze + i8;
/* 42 */                this.zze = i2;
/* 47 */                if (this.zzf == 0 && this.zzg == 0 && i2 > 0 && cArr[0] == 65279) {
                            this.zzd++;
/* 67 */                    this.zzg = 1;
/* 69 */                    i++;
                        }
/* 71 */            } while (i2 < i);
/* 46 */            return true;
                }

                private final boolean zzw(char c) throws zzks {
/* 3 */             if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
/* 65 */                return false;
                    }
/* 23 */            if (c != '#') {
/* 27 */                if (c == ',') {
/* 65 */                    return false;
                        }
/* 31 */                if (c != '/' && c != '=') {
/* 39 */                    if (c == '{' || c == '}' || c == ':') {
/* 65 */                        return false;
                            }
/* 51 */                    if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
/* 65 */                                return false;
                                    case '\\':
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 64 */            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                }

                @Override
                public final void close() throws IOException {
/* 2 */             this.zza = 0;
/* 8 */             this.zzk[0] = 8;
/* 11 */            this.zzl = 1;
/* 15 */            this.zzb.close();
                }

                public final String toString() {
/* 7 */             return "zzkr".concat(zzd());
                }

                public final double zza() throws IOException, NumberFormatException {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 12 */            if (iZzb == 15) {
/* 14 */                this.zza = 0;
/* 16 */                int[] iArr = this.zzn;
                        int i = this.zzl - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.zzh;
                    }
/* 36 */            if (iZzb == 16) {
/* 38 */                char[] cArr = this.zzc;
/* 42 */                int i2 = this.zzd;
/* 44 */                int i3 = this.zzi;
/* 49 */                this.zzj = new String(cArr, i2, i3);
/* 52 */                this.zzd = i2 + i3;
                    } else if (iZzb == 8 || iZzb == 9) {
/* 96 */                this.zzj = zzs(iZzb == 8 ? '\'' : '\"');
                    } else if (iZzb == 10) {
/* 72 */                this.zzj = zzt();
                    } else if (iZzb != 11) {
/* 84 */                throw zzq("a double");
                    }
/* 98 */            this.zza = 11;
/* 102 */           double d = Double.parseDouble(this.zzj);
/* 110 */           if (Double.isNaN(d) || Double.isInfinite(d)) {
/* 245 */               throw zzp("JSON forbids NaN and infinities: " + d);
                    }
/* 119 */           this.zzj = null;
/* 121 */           this.zza = 0;
/* 123 */           int[] iArr2 = this.zzn;
                    int i4 = this.zzl - 1;
/* 133 */           iArr2[i4] = iArr2[i4] + 1;
/* 135 */           return d;
                }

                /* JADX WARN: Code restructure failed: missing block: B:138:0x01ba, code lost:
                
                    if (zzw(r12) == false) goto L140;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:140:0x01be, code lost:
                
                    if (r9 != 2) goto L157;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x01c0, code lost:
                
                    if (r19 == 0) goto L146;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x01c6, code lost:
                
                    if (r6 != Long.MIN_VALUE) goto L147;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x01c8, code lost:
                
                    if (r20 == 0) goto L146;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x01ca, code lost:
                
                    r3 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x01cc, code lost:
                
                    r9 = 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x01ce, code lost:
                
                    r3 = r20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:149:0x01d2, code lost:
                
                    if (r6 != 0) goto L152;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:150:0x01d4, code lost:
                
                    if (r3 != 0) goto L146;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:152:0x01d7, code lost:
                
                    if (r3 == 0) goto L154;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:154:0x01da, code lost:
                
                    r6 = -r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:155:0x01db, code lost:
                
                    r26.zzh = r6;
                    r26.zzd += r8;
                    r6 = 15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:156:0x01e4, code lost:
                
                    r26.zza = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:157:0x01e7, code lost:
                
                    if (r9 == 2) goto L162;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:159:0x01ea, code lost:
                
                    if (r9 == 4) goto L162;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:161:0x01ed, code lost:
                
                    if (r9 != 7) goto L94;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:0x01ef, code lost:
                
                    r26.zzi = r8;
                    r6 = 16;
                 */
                /* JADX WARN: Removed duplicated region for block: B:101:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x0212  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x0222 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0223  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0239 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int zzb() throws IOException {
                    int iZzo;
                    int i;
                    String str;
                    String str2;
                    int i2;
                    int i3;
                    char c;
                    char c2;
                    int i4;
                    int i5;
/* 3 */             int[] iArr = this.zzk;
                    int i6 = this.zzl - 1;
/* 9 */             int i7 = iArr[i6];
/* 17 */            int i8 = 3;
/* 25 */            int i9 = 0;
/* 26 */            int i10 = 1;
/* 27 */            if (i7 != 1) {
/* 32 */                if (i7 == 2) {
/* 34 */                    int iZzo2 = zzo(true);
/* 38 */                    if (iZzo2 != 44) {
/* 40 */                        if (iZzo2 == 59) {
/* 58 */                            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                }
/* 42 */                        if (iZzo2 != 93) {
/* 53 */                            throw zzp("Unterminated array");
                                }
/* 44 */                        i8 = 4;
                            }
                        } else if (i7 == 3 || i7 == 5) {
/* 614 */                   iArr[i6] = 4;
/* 618 */                   if (i7 != 5 || (iZzo = zzo(true)) == 44) {
/* 646 */                       int iZzo3 = zzo(true);
/* 652 */                       if (iZzo3 == 34) {
/* 680 */                           i8 = 13;
                                } else {
/* 656 */                           if (iZzo3 == 39) {
/* 679 */                               throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                    }
/* 658 */                           if (iZzo3 != 125) {
/* 674 */                               throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                    }
/* 660 */                           if (i7 == 5) {
/* 669 */                               throw zzp("Expected name");
                                    }
                                }
                            } else {
/* 627 */                       if (iZzo == 59) {
/* 644 */                           throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                }
/* 629 */                       if (iZzo != 125) {
/* 639 */                           throw zzp("Unterminated object");
                                }
                            }
/* 631 */                   i8 = 2;
                        } else if (i7 == 4) {
/* 69 */                    iArr[i6] = 5;
/* 71 */                    int iZzo4 = zzo(true);
/* 77 */                    if (iZzo4 != 58) {
/* 81 */                        if (iZzo4 != 61) {
/* 89 */                            throw zzp("Expected ':'");
                                }
/* 94 */                        throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                            }
                        } else if (i7 == 6) {
/* 97 */                    iArr[i6] = 7;
                        } else if (i7 == 7) {
/* 107 */                   if (zzo(false) != -1) {
/* 117 */                       throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                            }
/* 109 */                   i8 = 17;
                        } else if (i7 == 8) {
/* 610 */                   I000II.I001IO000("JsonReader is closed");
/* 25 */                    return 0;
                        }
/* 682 */               this.zza = i8;
/* 743 */               return i8;
                    }
/* 29 */            iArr[i6] = 2;
/* 122 */           int iZzo5 = zzo(true);
/* 128 */           if (iZzo5 != 34) {
/* 132 */               if (iZzo5 == 39) {
/* 602 */                   throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
/* 134 */               if (iZzo5 == 44 || iZzo5 == 59) {
/* 580 */                   i = 1;
                        } else if (iZzo5 != 91) {
/* 142 */                   if (iZzo5 == 93) {
/* 574 */                       i = 1;
/* 575 */                       if (i7 == 1) {
/* 577 */                           i8 = 4;
                                }
                            } else if (iZzo5 != 123) {
                                int i11 = this.zzd - 1;
/* 154 */                       this.zzd = i11;
/* 156 */                       char[] cArr = this.zzc;
/* 158 */                       char c3 = cArr[i11];
/* 162 */                       if (c3 == 't' || c3 == 'T') {
/* 204 */                           str = "TRUE";
/* 206 */                           str2 = "true";
/* 208 */                           i2 = 5;
                                } else if (c3 == 'f' || c3 == 'F') {
/* 198 */                           str = "FALSE";
/* 200 */                           str2 = "false";
/* 202 */                           i2 = 6;
                                } else if (c3 == 'n' || c3 == 'N') {
/* 192 */                           str = "NULL";
/* 194 */                           str2 = "null";
/* 196 */                           i2 = 7;
                                } else {
/* 187 */                           i2 = 0;
/* 188 */                           i3 = 0;
/* 290 */                           if (i2 == 0) {
/* 570 */                               return i2;
                                    }
/* 292 */                           int i12 = this.zzd;
/* 294 */                           int i13 = this.zze;
/* 296 */                           int i14 = 1;
/* 298 */                           int i15 = i3;
/* 300 */                           int i16 = i15;
/* 301 */                           int i17 = i16;
/* 303 */                           long j = 0;
                                    while (true) {
/* 309 */                               if (i12 + i15 == i13) {
/* 313 */                                   if (i15 == 1024) {
                                                break;
                                            }
/* 325 */                                   if (!zzv(i15 + 1)) {
                                                break;
                                            }
/* 329 */                                   i12 = this.zzd;
/* 331 */                                   i13 = this.zze;
/* 335 */                                   c2 = cArr[i12 + i15];
/* 339 */                                   if (c2 != '+') {
                                            }
                                        } else {
/* 335 */                                   c2 = cArr[i12 + i15];
/* 339 */                                   if (c2 != '+') {
/* 531 */                                       i4 = i13;
/* 534 */                                       if (i16 != 5) {
                                                    break;
                                                }
/* 519 */                                       i16 = 6;
/* 537 */                                       i15++;
/* 539 */                                       i13 = i4;
/* 541 */                                       i10 = 1;
                                            } else if (c2 == 'E' || c2 == 'e') {
/* 521 */                                       i4 = i13;
/* 524 */                                       if (i16 != 2 && i16 != 4) {
                                                    break;
                                                }
/* 529 */                                       i16 = 5;
/* 537 */                                       i15++;
/* 539 */                                       i13 = i4;
/* 541 */                                       i10 = 1;
                                            } else if (c2 == '-') {
/* 508 */                                       i4 = i13;
/* 511 */                                       if (i16 == 0) {
/* 513 */                                           i16 = 1;
/* 514 */                                           i17 = 1;
/* 537 */                                           i15++;
/* 539 */                                           i13 = i4;
/* 541 */                                           i10 = 1;
                                                } else {
/* 517 */                                           if (i16 != 5) {
                                                        break;
                                                    }
/* 519 */                                           i16 = 6;
/* 537 */                                           i15++;
/* 539 */                                           i13 = i4;
/* 541 */                                           i10 = 1;
                                                }
                                            } else if (c2 == '.') {
/* 501 */                                       i4 = i13;
/* 504 */                                       if (i16 != 2) {
                                                    break;
                                                }
/* 506 */                                       i16 = 3;
/* 537 */                                       i15++;
/* 539 */                                       i13 = i4;
/* 541 */                                       i10 = 1;
                                            } else {
/* 359 */                                       if (c2 < '0' || c2 > '9') {
                                                    break;
                                                }
/* 366 */                                       if (i16 == i10 || i16 == 0) {
/* 370 */                                           i4 = i13;
/* 435 */                                           j = -(c2 - '0');
/* 437 */                                           i16 = 2;
                                                } else if (i16 != 2) {
/* 417 */                                           i4 = i13;
/* 419 */                                           if (i16 == 3) {
/* 422 */                                               i16 = 4;
                                                    } else if (i16 == 5 || i16 == 6) {
/* 430 */                                               i16 = 7;
                                                    }
/* 537 */                                           i15++;
/* 539 */                                           i13 = i4;
/* 541 */                                           i10 = 1;
                                                } else {
/* 377 */                                           if (j == 0) {
                                                        break;
                                                    }
/* 393 */                                           i4 = i13;
/* 396 */                                           long j2 = (10 * j) - (c2 - '0');
/* 410 */                                           i14 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i3;
/* 412 */                                           j = j2;
                                                }
/* 537 */                                       i15++;
/* 539 */                                       i13 = i4;
/* 541 */                                       i10 = 1;
                                            }
                                        }
/* 545 */                               if (i5 == 0) {
/* 547 */                                   return i5;
                                        }
/* 556 */                               if (zzw(cArr[this.zzd])) {
/* 569 */                                   throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                                        }
/* 564 */                               throw zzp("Expected value");
                                    }
/* 315 */                           i5 = i3;
/* 545 */                           if (i5 == 0) {
                                    }
                                }
/* 209 */                       int i18 = 0;
                                while (true) {
/* 210 */                           int length = str2.length();
/* 214 */                           i3 = i9;
/* 216 */                           int i19 = this.zzd;
/* 218 */                           if (i18 < length) {
/* 223 */                               if ((i19 + i18 >= this.zze && !zzv(i18 + 1)) || ((c = cArr[this.zzd + i18]) != str2.charAt(i18) && c != str.charAt(i18))) {
                                            break;
                                        }
/* 253 */                               i18++;
/* 255 */                               i9 = i3;
                                    } else {
/* 261 */                               if ((i19 + length < this.zze || zzv(length + 1)) && zzw(cArr[this.zzd + length])) {
                                            break;
                                        }
                                        this.zzd += length;
/* 288 */                               this.zza = i2;
                                    }
                                }
/* 233 */                       i2 = i3;
/* 290 */                       if (i2 == 0) {
                                }
                            } else {
/* 571 */                       i8 = 1;
                            }
                        }
/* 581 */               if (i7 == i || i7 == 2) {
/* 597 */                   throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
                        }
/* 592 */               throw zzp("Unexpected value");
                    }
/* 603 */           i8 = 9;
/* 682 */           this.zza = i8;
/* 743 */           return i8;
                }

                public final String zzc() {
/* 2 */             return zzr(false);
                }

                public final String zzd() {
/* 3 */             int i = this.zzf + 1;
/* 9 */             int i2 = this.zzd - this.zzg;
/* 11 */            String strZzr = zzr(false);
/* 19 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo(" at line ", i, " column ");
/* 25 */            sbI00100o1O0lo.append(i2 + 1);
/* 30 */            sbI00100o1O0lo.append(" path ");
/* 33 */            sbI00100o1O0lo.append(strZzr);
/* 36 */            return sbI00100o1O0lo.toString();
                }

                public final String zze() {
                    String strZzs;
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 11 */            if (iZzb == 14) {
/* 13 */                strZzs = zzt();
                    } else if (iZzb == 12) {
/* 24 */                strZzs = zzs('\'');
                    } else {
/* 31 */                if (iZzb != 13) {
/* 110 */                   throw zzq("a name");
                        }
/* 35 */                strZzs = zzs('\"');
                    }
/* 40 */            this.zza = 0;
/* 48 */            this.zzm[this.zzl - 1] = strZzs;
/* 50 */            return strZzs;
                }

                public final String zzf() throws IOException {
                    String string;
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 11 */            if (iZzb == 10) {
/* 13 */                string = zzt();
                    } else if (iZzb == 8) {
/* 24 */                string = zzs('\'');
                    } else if (iZzb == 9) {
/* 35 */                string = zzs('\"');
                    } else if (iZzb == 11) {
/* 44 */                string = this.zzj;
/* 47 */                this.zzj = null;
                    } else if (iZzb == 15) {
/* 56 */                string = Long.toString(this.zzh);
                    } else {
/* 63 */                if (iZzb != 16) {
/* 110 */                   throw zzq("a string");
                        }
/* 73 */                String str = new String(this.zzc, this.zzd, this.zzi);
                        this.zzd += this.zzi;
/* 83 */                string = str;
                    }
/* 85 */            this.zza = 0;
/* 87 */            int[] iArr = this.zzn;
                    int i = this.zzl - 1;
/* 97 */            iArr[i] = iArr[i] + 1;
/* 99 */            return string;
                }

                public final void zzg() {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 10 */            if (iZzb != 3) {
/* 55 */                throw zzq("BEGIN_ARRAY");
                    }
/* 13 */            zzu(1);
/* 23 */            this.zzn[this.zzl - 1] = 0;
/* 25 */            this.zza = 0;
                }

                public final void zzh() {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 10 */            if (iZzb != 1) {
/* 55 */                throw zzq("BEGIN_OBJECT");
                    }
/* 13 */            zzu(3);
/* 17 */            this.zza = 0;
                }

                public final void zzi() {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 10 */            if (iZzb != 4) {
/* 55 */                throw zzq("END_ARRAY");
                    }
/* 12 */            int i = this.zzl;
/* 16 */            this.zzl = i - 1;
/* 18 */            int[] iArr = this.zzn;
                    int i2 = i - 2;
/* 26 */            iArr[i2] = iArr[i2] + 1;
/* 29 */            this.zza = 0;
                }

                public final void zzj() {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 10 */            if (iZzb != 2) {
/* 55 */                throw zzq("END_OBJECT");
                    }
/* 12 */            int i = this.zzl;
                    int i2 = i - 1;
/* 16 */            this.zzl = i2;
/* 21 */            this.zzm[i2] = null;
/* 23 */            int[] iArr = this.zzn;
                    int i3 = i - 2;
/* 31 */            iArr[i3] = iArr[i3] + 1;
/* 34 */            this.zza = 0;
                }

                public final void zzk() {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 10 */            if (iZzb != 7) {
/* 55 */                throw zzq("null");
                    }
/* 13 */            this.zza = 0;
/* 15 */            int[] iArr = this.zzn;
                    int i = this.zzl - 1;
/* 25 */            iArr[i] = iArr[i] + 1;
                }

                public final boolean zzl() throws IOException {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
                    return (iZzb == 2 || iZzb == 4 || iZzb == 17) ? false : true;
                }

                public final boolean zzm() throws IOException {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
/* 12 */            if (iZzb == 5) {
/* 14 */                this.zza = 0;
/* 16 */                int[] iArr = this.zzn;
                        int i = this.zzl - 1;
/* 25 */                iArr[i] = iArr[i] + 1;
/* 10 */                return true;
                    }
/* 29 */            if (iZzb != 6) {
/* 55 */                throw zzq("a boolean");
                    }
/* 31 */            this.zza = 0;
/* 33 */            int[] iArr2 = this.zzn;
                    int i2 = this.zzl - 1;
/* 42 */            iArr2[i2] = iArr2[i2] + 1;
/* 11 */            return false;
                }

                public final int zzn() throws IOException {
/* 1 */             int iZzb = this.zza;
/* 3 */             if (iZzb == 0) {
/* 5 */                 iZzb = zzb();
                    }
                    switch (iZzb) {
                        case 1:
/* 33 */                    return 3;
                        case 2:
/* 31 */                    return 4;
                        case 3:
/* 29 */                    return 1;
                        case 4:
/* 27 */                    return 2;
                        case 5:
                        case 6:
/* 24 */                    return 8;
                        case 7:
/* 21 */                    return 9;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 19 */                    return 6;
                        case 12:
                        case 13:
                        case 14:
/* 17 */                    return 5;
                        case 15:
                        case 16:
/* 15 */                    return 7;
                        default:
/* 12 */                    return 10;
                    }
                }
            }

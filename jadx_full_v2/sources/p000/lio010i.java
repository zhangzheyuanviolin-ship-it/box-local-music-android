            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.Serializable;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.time.ZonedDateTime;
            import java.time.format.DateTimeFormatter;
            import java.time.format.DateTimeParseException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.zip.GZIPOutputStream;
            
/* 18 */    public final class lio010i extends liOO10o0 {
                public long I00iio;
                public long I00ilI0I1;

                public static ii0oooi0IO0l I010ioo(i1IO0oi1I i1io0oi1i) {
                    Object obj;
/* 4 */             Bundle bundleI010l10O = I010l10O(i1io0oi1i.I0000Il00O, true);
/* 28 */            String string = (!bundleI010l10O.containsKey("_o") || (obj = bundleI010l10O.get("_o")) == null) ? "app" : obj.toString();
/* 37 */            String strI00000oOI = ll0i0l0Ili.I00000oOI(i1io0oi1i.I00000oIO, iO1l1II0O0.I00000oIO, iO1l1II0O0.I0001Ioi1lo);
/* 41 */            if (strI00000oOI == null) {
/* 43 */                strI00000oOI = i1io0oi1i.I00000oIO;
                    }
/* 57 */            return new ii0oooi0IO0l(strI00000oOI, new ii0il0lOolIo(bundleI010l10O), string, i1io0oi1i.I00000oOI, 0L);
                }

                public static Bundle I010l10O(Map map, boolean z) {
/* 3 */             Bundle bundle = new Bundle();
/* 18 */            for (String str : map.keySet()) {
/* 26 */                Object obj = map.get(str);
/* 30 */                if (obj == null) {
/* 33 */                    bundle.putString(str, null);
                        } else if (obj instanceof Long) {
/* 47 */                    bundle.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
/* 61 */                    bundle.putDouble(str, ((Double) obj).doubleValue());
                        } else if (!(obj instanceof ArrayList)) {
/* 118 */                   bundle.putString(str, obj.toString());
                        } else if (z) {
/* 71 */                    ArrayList arrayList = (ArrayList) obj;
/* 75 */                    ArrayList arrayList2 = new ArrayList();
/* 78 */                    int size = arrayList.size();
/* 84 */                    for (int i = 0; i < size; i++) {
/* 96 */                        arrayList2.add(I010l10O((Map) arrayList.get(i), false));
                            }
/* 110 */                   bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                        }
                    }
/* 332 */           return bundle;
                }

                public static final void I010lI0oi(l0l0O000 l0l0o000, String str, Long l) {
/* 1 */             List listI000O01llI0 = l0l0o000.I000O01llI0();
/* 5 */             int i = 0;
                    while (true) {
/* 10 */                if (i >= listI000O01llI0.size()) {
/* 32 */                    i = -1;
                            break;
                        } else if (str.equals(((l0lliIlIO) listI000O01llI0.get(i)).I001IIilI0O())) {
                            break;
                        } else {
/* 29 */                    i++;
                        }
                    }
/* 33 */            l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 37 */            l0loooo1ioiI00IO1.I000O01llI0(str);
/* 44 */            l0loooo1ioiI00IO1.I000OiO(l.longValue());
/* 47 */            if (i < 0) {
/* 66 */                l0l0o000.I000l1(l0loooo1ioiI00IO1);
                    } else {
/* 49 */                l0l0o000.I0000Il00O();
/* 62 */                ((l0l1iIIOl) l0l0o000.I00iiI).I00Io1lO(i, (l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                    }
                }

                public static final Bundle I010o0o0oO(List list) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                l0lliIlIO l0lliilio = (l0lliIlIO) it.next();
/* 22 */                String strI001IIilI0O = l0lliilio.I001IIilI0O();
/* 30 */                if (l0lliilio.I001lllioOl()) {
/* 36 */                    bundle.putDouble(strI001IIilI0O, l0lliilio.I001lloI());
                        } else if (l0lliilio.I001l0I00()) {
/* 50 */                    bundle.putFloat(strI001IIilI0O, l0lliilio.I001lIiIIo1O());
                        } else if (l0lliilio.I001IO000()) {
/* 64 */                    bundle.putString(strI001IIilI0O, l0lliilio.I001i1O0Ol());
                        } else if (l0lliilio.I001i1lo1io()) {
/* 78 */                    bundle.putLong(strI001IIilI0O, l0lliilio.I001iOo1i0O());
                        }
                    }
/* 168 */           return bundle;
                }

                public static final l0lliIlIO I010oio1OO0(String str, l0l1iIIOl l0l1iiiol) {
/* 13 */            for (l0lliIlIO l0lliilio : l0l1iiiol.I001IO000()) {
/* 29 */                if (l0lliilio.I001IIilI0O().equals(str)) {
/* 31 */                    return l0lliilio;
                        }
                    }
/* 32 */            return null;
                }

                public static final String I01101IOlO(String str, Map map) {
/* 1 */             if (map == null) {
/* 68 */                return null;
                    }
/* 16 */            for (Map.Entry entry : map.entrySet()) {
/* 34 */                if (str.equalsIgnoreCase((String) entry.getKey())) {
/* 40 */                    if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
/* 68 */                        return null;
                            }
/* 65 */                    return (String) ((List) entry.getValue()).get(0);
                        }
                    }
/* 68 */            return null;
                }

                public static final Serializable I01101olii(String str, l0l1iIIOl l0l1iiiol) {
/* 1 */             l0lliIlIO l0lliilioI010oio1OO0 = I010oio1OO0(str, l0l1iiiol);
/* 5 */             if (l0lliilioI010oio1OO0 == null) {
/* 7 */                 return null;
                    }
/* 9 */             return I011Ill(l0lliilioI010oio1OO0);
                }

                public static final void I0111i(int i, StringBuilder sb) {
/* 2 */             for (int i2 = 0; i2 < i; i2++) {
/* 6 */                 sb.append("  ");
                    }
                }

                public static final void I011IO1I11OI(Uri.Builder builder, String str, String str2, HashSet hashSet) {
/* 5 */             if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
/* 204 */               return;
                    }
/* 14 */            builder.appendQueryParameter(str, str2);
                }

                public static final String I011IOil(boolean z, boolean z2, boolean z3) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             if (z) {
/* 10 */                sb.append("Dynamic ");
                    }
/* 13 */            if (z2) {
/* 17 */                sb.append("Sequence ");
                    }
/* 20 */            if (z3) {
/* 24 */                sb.append("Session-Scoped ");
                    }
/* 27 */            return sb.toString();
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
                public static final Serializable I011Ill(l0lliIlIO l0lliilio) {
/* 5 */             if (l0lliilio.I001IO000()) {
/* 7 */                 return l0lliilio.I001i1O0Ol();
                    }
/* 16 */            if (l0lliilio.I001i1lo1io()) {
/* 22 */                return Long.valueOf(l0lliilio.I001iOo1i0O());
                    }
/* 31 */            if (l0lliilio.I001lllioOl()) {
/* 37 */                return Double.valueOf(l0lliilio.I001lloI());
                    }
/* 46 */            if (l0lliilio.I00II0oii1o() > 0) {
/* 52 */                return I01Ilo0i(l0lliilio.I00II0Ol1O0l());
                    }
/* 57 */            return null;
                }

                public static final void I011Io0I1ioi(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
/* 4 */             for (String str : strArr) {
/* 10 */                String[] strArrSplit = str.split(",");
/* 14 */                String str2 = strArrSplit[0];
/* 19 */                String str3 = strArrSplit[strArrSplit.length - 1];
/* 21 */                String string = bundle.getString(str2);
/* 25 */                if (string != null) {
/* 27 */                    I011IO1I11OI(builder, str3, string, hashSet);
                        }
                    }
                }

                public static final void I011Ol0(StringBuilder sb, String str, l10lii1 l10lii1Var) {
/* 1 */             if (l10lii1Var == null) {
/* 3 */                 return;
                    }
/* 5 */             I0111i(3, sb);
/* 8 */             sb.append(str);
/* 13 */            sb.append(" {\n");
/* 26 */            if (l10lii1Var.I001i1O0Ol() != 0) {
/* 28 */                I0111i(4, sb);
/* 33 */                sb.append("results: ");
/* 44 */                int i = 0;
/* 49 */                for (Long l : l10lii1Var.I001IO000()) {
/* 57 */                    int i2 = i + 1;
/* 59 */                    if (i != 0) {
/* 61 */                        sb.append(", ");
                            }
/* 64 */                    sb.append(l);
/* 67 */                    i = i2;
                        }
/* 69 */                sb.append('\n');
                    }
/* 76 */            if (l10lii1Var.I001IIilI0O() != 0) {
/* 78 */                I0111i(4, sb);
/* 83 */                sb.append("status: ");
/* 94 */                int i3 = 0;
/* 99 */                for (Long l2 : l10lii1Var.I00111O()) {
/* 107 */                   int i4 = i3 + 1;
/* 109 */                   if (i3 != 0) {
/* 111 */                       sb.append(", ");
                            }
/* 114 */                   sb.append(l2);
/* 117 */                   i3 = i4;
                        }
/* 119 */               sb.append('\n');
                    }
/* 129 */           if (l10lii1Var.I001iOo1i0O() != 0) {
/* 131 */               I0111i(4, sb);
/* 136 */               sb.append("dynamic_filter_timestamps: {");
/* 147 */               int i5 = 0;
/* 152 */               for (l0io11IIiil l0io11iiiil : l10lii1Var.I001i1lo1io()) {
/* 160 */                   int i6 = i5 + 1;
/* 162 */                   if (i5 != 0) {
/* 164 */                       sb.append(", ");
                            }
/* 183 */                   sb.append(l0io11iiiil.I00111O() ? Integer.valueOf(l0io11iiiil.I001IIilI0O()) : null);
/* 188 */                   sb.append(":");
/* 207 */                   sb.append(l0io11iiiil.I001IO000() ? Long.valueOf(l0io11iiiil.I001i1O0Ol()) : null);
/* 210 */                   i5 = i6;
                        }
/* 212 */               sb.append("}\n");
                    }
/* 219 */           if (l10lii1Var.I001lIiIIo1O() != 0) {
/* 221 */               I0111i(4, sb);
/* 226 */               sb.append("sequence_filter_timestamps: {");
/* 237 */               int i7 = 0;
/* 242 */               for (l1100ll l1100llVar : l10lii1Var.I001l0I00()) {
/* 250 */                   int i8 = i7 + 1;
/* 252 */                   if (i7 != 0) {
/* 254 */                       sb.append(", ");
                            }
/* 273 */                   sb.append(l1100llVar.I00111O() ? Integer.valueOf(l1100llVar.I001IIilI0O()) : null);
/* 278 */                   sb.append(": [");
/* 285 */                   Iterator it = l1100llVar.I001IO000().iterator();
/* 289 */                   int i9 = 0;
/* 294 */                   while (it.hasNext()) {
/* 302 */                       long jLongValue = ((Long) it.next()).longValue();
/* 306 */                       int i10 = i9 + 1;
/* 308 */                       if (i9 != 0) {
/* 310 */                           sb.append(", ");
                                }
/* 313 */                       sb.append(jLongValue);
/* 316 */                       i9 = i10;
                            }
/* 320 */                   sb.append("]");
/* 323 */                   i7 = i8;
                        }
/* 325 */               sb.append("}\n");
                    }
/* 328 */           I0111i(3, sb);
/* 331 */           sb.append("}\n");
                }

                public static final void I011iIOio(StringBuilder sb, int i, String str, Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
/* 6 */             I0111i(i + 1, sb);
/* 9 */             sb.append(str);
/* 14 */            sb.append(": ");
/* 17 */            sb.append(obj);
/* 22 */            sb.append('\n');
                }

                public static final void I011iO(StringBuilder sb, int i, String str, ioIoo01l0o ioioo01l0o) {
/* 1 */             if (ioioo01l0o == null) {
/* 3 */                 return;
                    }
/* 4 */             I0111i(i, sb);
/* 7 */             sb.append(str);
/* 12 */            sb.append(" {\n");
/* 19 */            if (ioioo01l0o.I00111O()) {
/* 21 */                int iI00II0Ol1O0l = ioioo01l0o.I00II0Ol1O0l();
/* 53 */                I011iIOio(sb, i, "comparison_type", iI00II0Ol1O0l != 1 ? iI00II0Ol1O0l != 2 ? iI00II0Ol1O0l != 3 ? iI00II0Ol1O0l != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
                    }
/* 60 */            if (ioioo01l0o.I001IIilI0O()) {
/* 72 */                I011iIOio(sb, i, "match_as_float", Boolean.valueOf(ioioo01l0o.I001IO000()));
                    }
/* 79 */            if (ioioo01l0o.I001i1O0Ol()) {
/* 87 */                I011iIOio(sb, i, "comparison_value", ioioo01l0o.I001i1lo1io());
                    }
/* 94 */            if (ioioo01l0o.I001iOo1i0O()) {
/* 102 */               I011iIOio(sb, i, "min_comparison_value", ioioo01l0o.I001l0I00());
                    }
/* 109 */           if (ioioo01l0o.I001lIiIIo1O()) {
/* 117 */               I011iIOio(sb, i, "max_comparison_value", ioioo01l0o.I001lllioOl());
                    }
/* 120 */           I0111i(i, sb);
/* 125 */           sb.append("}\n");
                }

                public static boolean I01I1Oo0oll(String str) {
                    return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
                }

                public static boolean I01II10(iI001o1 ii001o1, int i) {
/* 7 */             if (i < ii001o1.size() * 64) {
                        return ((1 << (i % 64)) & ((Long) ii001o1.get(i / 64)).longValue()) != 0;
                    }
/* 36 */            return false;
                }

                public static ArrayList I01IO0oio(BitSet bitSet) {
/* 11 */            int length = (bitSet.length() + 63) / 64;
/* 12 */            ArrayList arrayList = new ArrayList(length);
/* 17 */            for (int i = 0; i < length; i++) {
/* 19 */                long j = 0;
/* 22 */                for (int i2 = 0; i2 < 64; i2++) {
/* 30 */                    int i3 = (i * 64) + i2;
/* 31 */                    if (i3 >= bitSet.length()) {
                                break;
                            }
/* 38 */                    if (bitSet.get(i3)) {
/* 43 */                        j |= 1 << i2;
                            }
                        }
/* 51 */                arrayList.add(Long.valueOf(j));
                    }
/* 77 */            return arrayList;
                }

                public static i1oIooioiO I01IlIoOI(i1oIooioiO i1oiooioio, byte[] bArr) throws iI00lI {
/* 1 */             i1o0l0i i1o0l0iVarI00000oIO = i1o0l0i.I00000oIO();
/* 5 */             if (i1o0l0iVarI00000oIO != null) {
/* 7 */                 i1oiooioio.getClass();
/* 11 */                i1oiooioio.I000II(bArr, bArr.length, i1o0l0iVarI00000oIO);
/* 14 */                return i1oiooioio;
                    }
/* 15 */            i1oiooioio.getClass();
/* 18 */            int length = bArr.length;
/* 19 */            int i = i1ioiooIiOol.I00000oIO;
/* 23 */            i1oiooioio.I000II(bArr, length, i1o0l0i.I00000oOI);
/* 37 */            return i1oiooioio;
                }

                public static int I01Ilioliio(String str, l0ooIi1oOO l0ooii1ooo) {
/* 10 */            for (int i = 0; i < ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OoIoio00O(); i++) {
/* 28 */                if (str.equals(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OoOi(i).I001IO000())) {
/* 30 */                    return i;
                        }
                    }
/* 34 */            return -1;
                }

                public static Bundle[] I01Ilo0i(iI00IlI1oII ii00ili1oii) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = ii00ili1oii.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                l0lliIlIO l0lliilio = (l0lliIlIO) it.next();
/* 22 */                if (l0lliilio != null) {
/* 26 */                    Bundle bundle = new Bundle();
/* 41 */                    for (l0lliIlIO l0lliilio2 : l0lliilio.I00II0Ol1O0l()) {
/* 53 */                        if (l0lliilio2.I001IO000()) {
/* 63 */                            bundle.putString(l0lliilio2.I001IIilI0O(), l0lliilio2.I001i1O0Ol());
                                } else if (l0lliilio2.I001i1lo1io()) {
/* 81 */                            bundle.putLong(l0lliilio2.I001IIilI0O(), l0lliilio2.I001iOo1i0O());
                                } else if (l0lliilio2.I001lllioOl()) {
/* 99 */                            bundle.putDouble(l0lliilio2.I001IIilI0O(), l0lliilio2.I001lloI());
                                }
                            }
/* 107 */                   if (!bundle.isEmpty()) {
/* 109 */                       arrayList.add(bundle);
                            }
                        }
                    }
/* 123 */           return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
                }

                public static HashMap I01Io000(Bundle bundle, boolean z) {
/* 3 */             HashMap map = new HashMap();
/* 18 */            for (String str : bundle.keySet()) {
/* 26 */                Object obj = bundle.get(str);
/* 30 */                boolean z2 = obj instanceof Parcelable[];
/* 32 */                if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
/* 49 */                    if (z) {
/* 53 */                        ArrayList arrayList = new ArrayList();
/* 57 */                        if (z2) {
/* 63 */                            for (Parcelable parcelable : (Parcelable[]) obj) {
/* 69 */                                if (parcelable instanceof Bundle) {
/* 77 */                                    arrayList.add(I01Io000((Bundle) parcelable, false));
                                        }
                                    }
                                } else if (obj instanceof ArrayList) {
/* 87 */                            ArrayList arrayList2 = (ArrayList) obj;
/* 89 */                            int size = arrayList2.size();
/* 94 */                            for (int i = 0; i < size; i++) {
/* 96 */                                Object obj2 = arrayList2.get(i);
/* 102 */                               if (obj2 instanceof Bundle) {
/* 110 */                                   arrayList.add(I01Io000((Bundle) obj2, false));
                                        }
                                    }
                                } else if (obj instanceof Bundle) {
/* 126 */                           arrayList.add(I01Io000((Bundle) obj, false));
                                }
/* 129 */                       map.put(str, arrayList);
                            }
                        } else if (obj != null) {
/* 45 */                    map.put(str, obj);
                        }
                    }
/* 332 */           return map;
                }

                public final void I010l1O(Map map) {
                    long epochMilli;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             String strI01101IOlO = I01101IOlO("Date", map);
/* 15 */            if (TextUtils.isEmpty(strI01101IOlO)) {
/* 77 */                return;
                    }
                    try {
/* 29 */                epochMilli = ZonedDateTime.parse(strI01101IOlO, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                    } catch (DateTimeParseException unused) {
/* 34 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 36 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 43 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Unable to parse header time, time", strI01101IOlO);
/* 46 */                epochMilli = 0;
                    }
/* 49 */            if (epochMilli > 0) {
/* 53 */                l0olllo1i.I00li1OI.getClass();
/* 56 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 60 */                I010II();
/* 67 */                if (this.I00ilI0I1 == 0) {
/* 69 */                    this.I00iio = jElapsedRealtime;
/* 71 */                    this.I00ilI0I1 = epochMilli;
                        }
                    }
                }

                public final long I010l1ol111(long j) {
/* 1 */             I010II();
/* 4 */             long j2 = this.I00ilI0I1;
/* 10 */            if (j2 == 0 || j == 0) {
/* 6 */                 return 0L;
                    }
/* 19 */            return (j2 - this.I00iio) + j;
                }

                public final void I0110OiO(StringBuilder sb, int i, iI00IlI1oII ii00ili1oii) {
/* 1 */             if (ii00ili1oii == null) {
/* 408 */               return;
                    }
/* 5 */             int i2 = i + 1;
/* 7 */             Iterator it = ii00ili1oii.iterator();
/* 15 */            while (it.hasNext()) {
/* 21 */                l0lliIlIO l0lliilio = (l0lliIlIO) it.next();
/* 23 */                if (l0lliilio != null) {
/* 25 */                    I0111i(i2, sb);
/* 30 */                    sb.append("param {\n");
/* 58 */                    I011iIOio(sb, i2, "name", l0lliilio.I00111O() ? ((l0olllO1i) this.I00iOIl).I00l0OO0IO.I00000oOI(l0lliilio.I001IIilI0O()) : null);
/* 75 */                    I011iIOio(sb, i2, "string_value", l0lliilio.I001IO000() ? l0lliilio.I001i1O0Ol() : null);
/* 96 */                    I011iIOio(sb, i2, "int_value", l0lliilio.I001i1lo1io() ? Long.valueOf(l0lliilio.I001iOo1i0O()) : null);
/* 115 */                   I011iIOio(sb, i2, "double_value", l0lliilio.I001lllioOl() ? Double.valueOf(l0lliilio.I001lloI()) : null);
/* 122 */                   if (l0lliilio.I00II0oii1o() > 0) {
/* 128 */                       I0110OiO(sb, i2, l0lliilio.I00II0Ol1O0l());
                            }
/* 131 */                   I0111i(i2, sb);
/* 136 */                   sb.append("}\n");
                        }
                    }
                }

                public final void I0110o(StringBuilder sb, int i, ioIO1Io0o ioio1io0o) {
                    String str;
/* 1 */             if (ioio1io0o == null) {
/* 3 */                 return;
                    }
/* 4 */             I0111i(i, sb);
/* 9 */             sb.append("filter {\n");
/* 16 */            if (ioio1io0o.I001i1lo1io()) {
/* 28 */                I011iIOio(sb, i, "complement", Boolean.valueOf(ioio1io0o.I001iOo1i0O()));
                    }
/* 35 */            if (ioio1io0o.I001l0I00()) {
/* 53 */                I011iIOio(sb, i, "param_name", ((l0olllO1i) this.I00iOIl).I00l0OO0IO.I00000oOI(ioio1io0o.I001lIiIIo1O()));
                    }
/* 62 */            if (ioio1io0o.I00111O()) {
/* 64 */                int i2 = i + 1;
/* 66 */                ioi0O0o ioi0o0oI001IIilI0O = ioio1io0o.I001IIilI0O();
/* 70 */                if (ioi0o0oI001IIilI0O != null) {
/* 74 */                    I0111i(i2, sb);
/* 79 */                    sb.append("string_filter {\n");
/* 86 */                    if (ioi0o0oI001IIilI0O.I00111O()) {
                                switch (ioi0o0oI001IIilI0O.I001lllioOl()) {
                                    case 1:
/* 113 */                               str = "UNKNOWN_MATCH_TYPE";
                                        break;
                                    case 2:
/* 110 */                               str = "REGEXP";
                                        break;
                                    case 3:
/* 107 */                               str = "BEGINS_WITH";
                                        break;
                                    case 4:
/* 104 */                               str = "ENDS_WITH";
                                        break;
                                    case 5:
/* 101 */                               str = "PARTIAL";
                                        break;
                                    case 6:
/* 98 */                                str = "EXACT";
                                        break;
                                    default:
/* 95 */                                str = "IN_LIST";
                                        break;
                                }
/* 117 */                       I011iIOio(sb, i2, "match_type", str);
                            }
/* 124 */                   if (ioi0o0oI001IIilI0O.I001IIilI0O()) {
/* 132 */                       I011iIOio(sb, i2, "expression", ioi0o0oI001IIilI0O.I001IO000());
                            }
/* 139 */                   if (ioi0o0oI001IIilI0O.I001i1O0Ol()) {
/* 151 */                       I011iIOio(sb, i2, "case_sensitive", Boolean.valueOf(ioi0o0oI001IIilI0O.I001i1lo1io()));
                            }
/* 158 */                   if (ioi0o0oI001IIilI0O.I001l0I00() > 0) {
/* 162 */                       I0111i(i + 2, sb);
/* 167 */                       sb.append("expression_list {\n");
/* 182 */                       for (String str2 : ioi0o0oI001IIilI0O.I001iOo1i0O()) {
/* 192 */                           I0111i(i + 3, sb);
/* 195 */                           sb.append(str2);
/* 200 */                           sb.append("\n");
                                }
/* 204 */                       sb.append("}\n");
                            }
/* 207 */                   I0111i(i2, sb);
/* 210 */                   sb.append("}\n");
                        }
                    }
/* 217 */           if (ioio1io0o.I001IO000()) {
/* 227 */               I011iO(sb, i + 1, "number_filter", ioio1io0o.I001i1O0Ol());
                    }
/* 230 */           I0111i(i, sb);
/* 233 */           sb.append("}\n");
                }

                public final void I011iiii0i(l1IIIIIl1iIO l1iiiiil1iio, Object obj) {
/* 1 */             l1iiiiil1iio.I0000Il00O();
/* 8 */             ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00IioO0OiOi();
/* 11 */            l1iiiiil1iio.I0000Il00O();
/* 18 */            ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00Io1lO();
/* 21 */            l1iiiiil1iio.I0000Il00O();
/* 28 */            ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00IoIO0lI();
/* 33 */            if (obj instanceof String) {
/* 37 */                l1iiiiil1iio.I0000Il00O();
/* 44 */                ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00IOO((String) obj);
                    } else if (obj instanceof Long) {
/* 54 */                long jLongValue = ((Long) obj).longValue();
/* 58 */                l1iiiiil1iio.I0000Il00O();
/* 65 */                ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00IlilI0i0i(jLongValue);
                    } else if (obj instanceof Double) {
/* 75 */                double dDoubleValue = ((Double) obj).doubleValue();
/* 79 */                l1iiiiil1iio.I0000Il00O();
/* 86 */                ((l1IOl1iI00l) l1iiiiil1iio.I00iiI).I00Io1o110i(dDoubleValue);
                    } else {
/* 94 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 96 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 103 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Ignoring invalid (type) user attribute value", obj);
                    }
                }

                public final void I011lIilI0lo(l0lOoOo1Ioi l0loooo1ioi, Object obj) {
/* 1 */             l0loooo1ioi.I0000Il00O();
/* 8 */             ((l0lliIlIO) l0loooo1ioi.I00iiI).I00IioO0OiOi();
/* 11 */            l0loooo1ioi.I0000Il00O();
/* 18 */            ((l0lliIlIO) l0loooo1ioi.I00iiI).I00Io1lO();
/* 21 */            l0loooo1ioi.I0000Il00O();
/* 28 */            ((l0lliIlIO) l0loooo1ioi.I00iiI).I00IoIO0lI();
/* 31 */            l0loooo1ioi.I0000Il00O();
/* 38 */            ((l0lliIlIO) l0loooo1ioi.I00iiI).I00Iooi00oi();
/* 43 */            if (obj instanceof String) {
/* 47 */                l0loooo1ioi.I000OOo1O((String) obj);
/* 50 */                return;
                    }
/* 53 */            if (obj instanceof Long) {
/* 61 */                l0loooo1ioi.I000OiO(((Long) obj).longValue());
/* 64 */                return;
                    }
/* 67 */            if (obj instanceof Double) {
/* 71 */                double dDoubleValue = ((Double) obj).doubleValue();
/* 75 */                l0loooo1ioi.I0000Il00O();
/* 82 */                ((l0lliIlIO) l0loooo1ioi.I00iiI).I00Io1o110i(dDoubleValue);
/* 85 */                return;
                    }
/* 88 */            if (!(obj instanceof Bundle[])) {
/* 240 */               l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 242 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 249 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Ignoring invalid (type) event param value", obj);
/* 332 */               return;
                    }
/* 94 */            ArrayList arrayList = new ArrayList();
/* 99 */            for (Bundle bundle : (Bundle[]) obj) {
/* 103 */               if (bundle != null) {
/* 107 */                   l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 123 */                   for (String str : bundle.keySet()) {
/* 131 */                       l0lOoOo1Ioi l0loooo1ioiI00IO12 = l0lliIlIO.I00IO1();
/* 135 */                       l0loooo1ioiI00IO12.I000O01llI0(str);
/* 138 */                       Object obj2 = bundle.get(str);
/* 144 */                       if (obj2 instanceof Long) {
/* 152 */                           l0loooo1ioiI00IO12.I000OiO(((Long) obj2).longValue());
                                } else if (obj2 instanceof String) {
/* 162 */                           l0loooo1ioiI00IO12.I000OOo1O((String) obj2);
                                } else if (obj2 instanceof Double) {
/* 172 */                           double dDoubleValue2 = ((Double) obj2).doubleValue();
/* 176 */                           l0loooo1ioiI00IO12.I0000Il00O();
/* 183 */                           ((l0lliIlIO) l0loooo1ioiI00IO12.I00iiI).I00Io1o110i(dDoubleValue2);
                                }
/* 186 */                       l0loooo1ioiI00IO1.I0000Il00O();
/* 199 */                       ((l0lliIlIO) l0loooo1ioiI00IO1.I00iiI).I00IoO0((l0lliIlIO) l0loooo1ioiI00IO12.I0000oI00());
                            }
/* 211 */                   if (((l0lliIlIO) l0loooo1ioiI00IO1.I00iiI).I00II0oii1o() > 0) {
/* 219 */                       arrayList.add((l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                            }
                        }
                    }
/* 225 */           l0loooo1ioi.I0000Il00O();
/* 232 */           ((l0lliIlIO) l0loooo1ioi.I00iiI).I00IoiI(arrayList);
                }

                public final li1l0Iiiii I011lO1liO1O(String str, l0ooIi1oOO l0ooii1ooo, l0l0O000 l0l0o000, String str2) {
                    int iIndexOf;
/* 7 */             iIO0ooOool.I00000oIO();
/* 12 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 14 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 22 */            if (!iil1iil.I01101IOlO(str, iol1II1ii1i.I0100i)) {
/* 865 */               return null;
                    }
/* 26 */            l0olllo1i.I00li1OI.getClass();
/* 29 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 51 */            HashSet hashSet = new HashSet(Arrays.asList(iil1iil.I010l1ol111(str, iol1II1ii1i.I00l0OO0IO).split(",")));
/* 54 */            lilOOl0 lilool0 = this.I00iiI;
/* 56 */            liOii110IIl lioii110iil = lilool0.I00l0OO0IO;
/* 58 */            l0l1ol11 l0l1ol11Var = lilool0.I00iOIl;
/* 62 */            l0l1ol11 l0l1ol11Var2 = lioii110iil.I00iiI.I00iOIl;
/* 64 */            lilOOl0.I00O0o1oo(l0l1ol11Var2);
/* 67 */            String strI0110OiO = l0l1ol11Var2.I0110OiO(str);
/* 73 */            Uri.Builder builder = new Uri.Builder();
/* 80 */            iIl1iil iil1iil2 = ((l0olllO1i) lioii110iil.I00iOIl).I00iio;
/* 88 */            builder.scheme(iil1iil2.I010l1ol111(str, iol1II1ii1i.I00iiO));
/* 98 */            if (TextUtils.isEmpty(strI0110OiO)) {
/* 152 */               builder.authority(iil1iil2.I010l1ol111(str, iol1II1ii1i.I00iio));
                    } else {
/* 102 */               String strI010l1ol111 = iil1iil2.I010l1ol111(str, iol1II1ii1i.I00iio);
/* 126 */               StringBuilder sb = new StringBuilder(String.valueOf(strI0110OiO).length() + 1 + String.valueOf(strI010l1ol111).length());
/* 129 */               sb.append(strI0110OiO);
/* 132 */               sb.append(".");
/* 135 */               sb.append(strI010l1ol111);
/* 142 */               builder.authority(sb.toString());
                    }
/* 161 */           builder.path(iil1iil2.I010l1ol111(str, iol1II1ii1i.I00ilI0I1));
/* 174 */           I011IO1I11OI(builder, "gmp_app_id", ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00IioO0OiOi(), hashSet);
/* 177 */           iil1iil.I010l1O();
/* 189 */           I011IO1I11OI(builder, "gmp_version", String.valueOf(161000L), hashSet);
/* 196 */           String strI001lloI = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I001lloI();
/* 200 */           iol01I0001 iol01i0001 = iol1II1ii1i.I010I0;
/* 206 */           if (iil1iil.I01101IOlO(str, iol01i0001)) {
/* 208 */               lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 215 */               if (l0l1ol11Var.I011Ol0(str)) {
/* 217 */                   strI001lloI = "";
                        }
                    }
/* 221 */           I011IO1I11OI(builder, "app_instance_id", strI001lloI, hashSet);
/* 234 */           I011IO1I11OI(builder, "rdid", ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I001l0I00(), hashSet);
/* 243 */           I011IO1I11OI(builder, "bundle_id", l0ooii1ooo.I000oI1ioi(), hashSet);
/* 246 */           String strI000o00OoI0I = l0l0o000.I000o00OoI0I();
/* 254 */           String strI00000oOI = ll0i0l0Ili.I00000oOI(strI000o00OoI0I, iO1l1II0O0.I0001Ioi1lo, iO1l1II0O0.I00000oIO);
/* 262 */           if (true != TextUtils.isEmpty(strI00000oOI)) {
/* 264 */               strI000o00OoI0I = strI00000oOI;
                    }
/* 267 */           I011IO1I11OI(builder, "app_event_name", strI000o00OoI0I, hashSet);
/* 284 */           I011IO1I11OI(builder, "app_version", String.valueOf(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00IoiI()), hashSet);
/* 291 */           String strI01iiIii10O = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01iiIii10O();
/* 299 */           if (iil1iil.I01101IOlO(str, iol01i0001)) {
/* 301 */               lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 308 */               if (l0l1ol11Var.I011Io0I1ioi(str) && !TextUtils.isEmpty(strI01iiIii10O) && (iIndexOf = strI01iiIii10O.indexOf(".")) != -1) {
/* 324 */                   strI01iiIii10O = strI01iiIii10O.substring(0, iIndexOf);
                        }
                    }
/* 330 */           I011IO1I11OI(builder, "os_version", strI01iiIii10O, hashSet);
/* 343 */           I011IO1I11OI(builder, "timestamp", String.valueOf(l0l0o000.I00100l0()), hashSet);
/* 356 */           if (((l100ll0OOIoO) l0ooii1ooo.I00iiI).I001lllioOl()) {
/* 360 */               I011IO1I11OI(builder, "lat", "1", hashSet);
                    }
/* 377 */           I011IO1I11OI(builder, "privacy_sandbox_version", String.valueOf(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00oo1iO0ll()), hashSet);
/* 382 */           I011IO1I11OI(builder, "trigger_uri_source", "1", hashSet);
/* 391 */           I011IO1I11OI(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
/* 398 */           I011IO1I11OI(builder, "request_uuid", str2, hashSet);
/* 401 */           List<l0lliIlIO> listI000O01llI0 = l0l0o000.I000O01llI0();
/* 407 */           Bundle bundle = new Bundle();
/* 418 */           for (l0lliIlIO l0lliilio : listI000O01llI0) {
/* 426 */               String strI001IIilI0O = l0lliilio.I001IIilI0O();
/* 434 */               if (l0lliilio.I001lllioOl()) {
/* 444 */                   bundle.putString(strI001IIilI0O, String.valueOf(l0lliilio.I001lloI()));
                        } else if (l0lliilio.I001l0I00()) {
/* 462 */                   bundle.putString(strI001IIilI0O, String.valueOf(l0lliilio.I001lIiIIo1O()));
                        } else if (l0lliilio.I001IO000()) {
/* 476 */                   bundle.putString(strI001IIilI0O, l0lliilio.I001i1O0Ol());
                        } else if (l0lliilio.I001i1lo1io()) {
/* 494 */                   bundle.putString(strI001IIilI0O, String.valueOf(l0lliilio.I001iOo1i0O()));
                        }
                    }
/* 510 */           I011Io0I1ioi(builder, iil1iil.I010l1ol111(str, iol1II1ii1i.I00l0I0l0lO1).split("\\|"), bundle, hashSet);
/* 521 */           List<l1IOl1iI00l> listUnmodifiableList = Collections.unmodifiableList(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Olioli());
/* 527 */           Bundle bundle2 = new Bundle();
/* 538 */           for (l1IOl1iI00l l1iol1ii00l : listUnmodifiableList) {
/* 546 */               String strI001IO000 = l1iol1ii00l.I001IO000();
/* 554 */               if (l1iol1ii00l.I001lloI()) {
/* 564 */                   bundle2.putString(strI001IO000, String.valueOf(l1iol1ii00l.I00II0Ol1O0l()));
                        } else if (l1iol1ii00l.I001lIiIIo1O()) {
/* 582 */                   bundle2.putString(strI001IO000, String.valueOf(l1iol1ii00l.I001lllioOl()));
                        } else if (l1iol1ii00l.I001i1O0Ol()) {
/* 596 */                   bundle2.putString(strI001IO000, l1iol1ii00l.I001i1lo1io());
                        } else if (l1iol1ii00l.I001iOo1i0O()) {
/* 614 */                   bundle2.putString(strI001IO000, String.valueOf(l1iol1ii00l.I001l0I00()));
                        }
                    }
/* 628 */           I011Io0I1ioi(builder, iil1iil.I010l1ol111(str, iol1II1ii1i.I00ioIO).split("\\|"), bundle2, hashSet);
/* 645 */           I011IO1I11OI(builder, "dma", true != ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00olI() ? OIllioIilO.I01OO1I : "1", hashSet);
/* 660 */           if (!((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00oliIiO01i().isEmpty()) {
/* 672 */               I011IO1I11OI(builder, "dma_cps", ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00oliIiO01i(), hashSet);
                    }
/* 683 */           if (((l100ll0OOIoO) l0ooii1ooo.I00iiI).I0100o111I()) {
/* 689 */               l0IiI1o01I1o l0iii1o01i1oI010101Oo1lO = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010101Oo1lO();
/* 701 */               if (!l0iii1o01i1oI010101Oo1lO.I00IOO().isEmpty()) {
/* 709 */                   I011IO1I11OI(builder, "dl_gclid", l0iii1o01i1oI010101Oo1lO.I00IOO(), hashSet);
                        }
/* 720 */               if (!l0iii1o01i1oI010101Oo1lO.I00IlilI0i0i().isEmpty()) {
/* 728 */                   I011IO1I11OI(builder, "dl_gbraid", l0iii1o01i1oI010101Oo1lO.I00IlilI0i0i(), hashSet);
                        }
/* 739 */               if (!l0iii1o01i1oI010101Oo1lO.I00Io1o110i().isEmpty()) {
/* 747 */                   I011IO1I11OI(builder, "dl_gs", l0iii1o01i1oI010101Oo1lO.I00Io1o110i(), hashSet);
                        }
/* 758 */               if (l0iii1o01i1oI010101Oo1lO.I00IoO0() > 0) {
/* 770 */                   I011IO1I11OI(builder, "dl_ss_ts", String.valueOf(l0iii1o01i1oI010101Oo1lO.I00IoO0()), hashSet);
                        }
/* 781 */               if (!l0iii1o01i1oI010101Oo1lO.I00Iooi00oi().isEmpty()) {
/* 789 */                   I011IO1I11OI(builder, "mr_gclid", l0iii1o01i1oI010101Oo1lO.I00Iooi00oi(), hashSet);
                        }
/* 800 */               if (!l0iii1o01i1oI010101Oo1lO.I00O0o1oo().isEmpty()) {
/* 808 */                   I011IO1I11OI(builder, "mr_gbraid", l0iii1o01i1oI010101Oo1lO.I00O0o1oo(), hashSet);
                        }
/* 819 */               if (!l0iii1o01i1oI010101Oo1lO.I00OI1().isEmpty()) {
/* 827 */                   I011IO1I11OI(builder, "mr_gs", l0iii1o01i1oI010101Oo1lO.I00OI1(), hashSet);
                        }
/* 836 */               if (l0iii1o01i1oI010101Oo1lO.I00OIl() > 0) {
/* 848 */                   I011IO1I11OI(builder, "mr_click_ts", String.valueOf(l0iii1o01i1oI010101Oo1lO.I00OIl()), hashSet);
                        }
                    }
/* 861 */           return new li1l0Iiiii(1, jCurrentTimeMillis, builder.build().toString());
                }

                public final l0l1iIIOl I011lOIoo0l(ii00010lll1 ii00010lll1Var) {
/* 1 */             l0l0O000 l0l0o000I00IlilI0i0i = l0l1iIIOl.I00IlilI0i0i();
/* 5 */             long j = ii00010lll1Var.I0001Ioi1lo;
/* 7 */             l0l0o000I00IlilI0i0i.I0000Il00O();
/* 14 */            ((l0l1iIIOl) l0l0o000I00IlilI0i0i.I00iiI).I00O0o1oo(j);
/* 17 */            long j2 = ii00010lll1Var.I0000oI00;
/* 19 */            l0l0o000I00IlilI0i0i.I0000Il00O();
/* 26 */            ((l0l1iIIOl) l0l0o000I00IlilI0i0i.I00iiI).I00111O(j2);
/* 29 */            ii0il0lOolIo ii0il0loolio = ii00010lll1Var.I000II;
/* 31 */            Objects.requireNonNull(ii0il0loolio);
/* 34 */            Bundle bundle = ii0il0loolio.I00iOIl;
/* 48 */            for (String str : bundle.keySet()) {
/* 56 */                l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 60 */                l0loooo1ioiI00IO1.I000O01llI0(str);
/* 63 */                Object obj = bundle.get(str);
/* 67 */                lII0I0I000I.I000II(obj);
/* 70 */                I011lIilI0lo(l0loooo1ioiI00IO1, obj);
/* 73 */                l0l0o000I00IlilI0i0i.I000l1(l0loooo1ioiI00IO1);
                    }
/* 77 */            String str2 = ii00010lll1Var.I0000Il00O;
/* 83 */            if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
/* 93 */                l0lOoOo1Ioi l0loooo1ioiI00IO12 = l0lliIlIO.I00IO1();
/* 97 */                l0loooo1ioiI00IO12.I000O01llI0("_o");
/* 100 */               l0loooo1ioiI00IO12.I000OOo1O(str2);
/* 109 */               l0l0o000I00IlilI0i0i.I000iOII((l0lliIlIO) l0loooo1ioiI00IO12.I0000oI00());
                    }
/* 116 */           return (l0l1iIIOl) l0l0o000I00IlilI0i0i.I0000oI00();
                }

                public final String I011olOoO(l0oiiI0 l0oiii0) {
                    l0O1iO1OIiII l0o1io1oiiiiI00ooiO1I;
/* 1 */             if (l0oiii0 == null) {
/* 3 */                 return "";
                    }
/* 8 */             StringBuilder sb = new StringBuilder();
/* 13 */            sb.append("\nbatch {\n");
/* 21 */            if (l0oiii0.I001iOo1i0O()) {
/* 29 */                I011iIOio(sb, 0, "upload_subdomain", l0oiii0.I001l0I00());
                    }
/* 36 */            if (l0oiii0.I001i1O0Ol()) {
/* 44 */                I011iIOio(sb, 0, "sgtm_join_id", l0oiii0.I001i1lo1io());
                    }
/* 59 */            for (l100ll0OOIoO l100ll0ooioo : l0oiii0.I00111O()) {
/* 67 */                if (l100ll0ooioo != null) {
/* 70 */                    I0111i(1, sb);
/* 75 */                    sb.append("bundle {\n");
/* 82 */                    if (l100ll0ooioo.I00OI1()) {
/* 94 */                        I011iIOio(sb, 1, "protocol_version", Integer.valueOf(l100ll0ooioo.I010OIo1l()));
                            }
/* 107 */                   l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 109 */                   iIl1iil iil1iil = l0olllo1i.I00iio;
/* 111 */                   l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 123 */                   if (iil1iil.I01101IOlO(l100ll0ooioo.I00111O(), iol1II1ii1i.I00ooiO1I) && l100ll0ooioo.I00o0l1o1o0()) {
/* 137 */                       I011iIOio(sb, 1, "session_stitching_token", l100ll0ooioo.I00o101lO());
                            }
/* 146 */                   I011iIOio(sb, 1, "platform", l100ll0ooioo.I01ii1i());
/* 153 */                   if (l100ll0ooioo.I001IO000()) {
/* 165 */                       I011iIOio(sb, 1, "gmp_version", Long.valueOf(l100ll0ooioo.I001i1O0Ol()));
                            }
/* 172 */                   if (l100ll0ooioo.I001i1lo1io()) {
/* 184 */                       I011iIOio(sb, 1, "uploading_gmp_version", Long.valueOf(l100ll0ooioo.I001iOo1i0O()));
                            }
/* 191 */                   if (l100ll0ooioo.I00ll1()) {
/* 203 */                       I011iIOio(sb, 1, "dynamite_version", Long.valueOf(l100ll0ooioo.I00lli11()));
                            }
/* 210 */                   if (l100ll0ooioo.I00Iooi00oi()) {
/* 222 */                       I011iIOio(sb, 1, "config_version", Long.valueOf(l100ll0ooioo.I00O0i0ii()));
                            }
/* 231 */                   I011iIOio(sb, 1, "gmp_app_id", l100ll0ooioo.I00IioO0OiOi());
/* 240 */                   I011iIOio(sb, 1, "app_id", l100ll0ooioo.I00111O());
/* 249 */                   I011iIOio(sb, 1, "app_version", l100ll0ooioo.I001IIilI0O());
/* 256 */                   if (l100ll0ooioo.I00IoO0()) {
/* 268 */                       I011iIOio(sb, 1, "app_version_major", Integer.valueOf(l100ll0ooioo.I00IoiI()));
                            }
/* 277 */                   I011iIOio(sb, 1, "firebase_instance_id", l100ll0ooioo.I00IoIO0lI());
/* 284 */                   if (l100ll0ooioo.I00II0Ol1O0l()) {
/* 296 */                       I011iIOio(sb, 1, "dev_cert_hash", Long.valueOf(l100ll0ooioo.I00II0oii1o()));
                            }
/* 305 */                   I011iIOio(sb, 1, "app_store", l100ll0ooioo.I01io11il());
/* 312 */                   if (l100ll0ooioo.I01OooO0o0o()) {
/* 324 */                       I011iIOio(sb, 1, "upload_timestamp_millis", Long.valueOf(l100ll0ooioo.I01i000i0iI()));
                            }
/* 331 */                   if (l100ll0ooioo.I01i01OoI()) {
/* 343 */                       I011iIOio(sb, 1, "start_timestamp_millis", Long.valueOf(l100ll0ooioo.I01i01iOOOIo()));
                            }
/* 350 */                   if (l100ll0ooioo.I01i1I()) {
/* 362 */                       I011iIOio(sb, 1, "end_timestamp_millis", Long.valueOf(l100ll0ooioo.I01i1oI()));
                            }
/* 369 */                   if (l100ll0ooioo.I01iI0l00O()) {
/* 381 */                       I011iIOio(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(l100ll0ooioo.I01iIIO()));
                            }
/* 388 */                   if (l100ll0ooioo.I01iOOoiOI()) {
/* 400 */                       I011iIOio(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(l100ll0ooioo.I01ii1IIl()));
                            }
/* 409 */                   I011iIOio(sb, 1, "app_instance_id", l100ll0ooioo.I001lloI());
/* 418 */                   I011iIOio(sb, 1, "resettable_device_id", l100ll0ooioo.I001l0I00());
/* 427 */                   I011iIOio(sb, 1, "ds_id", l100ll0ooioo.I00O10llo());
/* 434 */                   if (l100ll0ooioo.I001lIiIIo1O()) {
/* 446 */                       I011iIOio(sb, 1, "limited_ad_tracking", Boolean.valueOf(l100ll0ooioo.I001lllioOl()));
                            }
/* 455 */                   I011iIOio(sb, 1, "os_version", l100ll0ooioo.I01iiIii10O());
/* 464 */                   I011iIOio(sb, 1, "device_model", l100ll0ooioo.I01il1IlO1());
/* 473 */                   I011iIOio(sb, 1, "user_default_language", l100ll0ooioo.I01ilI00oIi());
/* 480 */                   if (l100ll0ooioo.I01illiiIill()) {
/* 492 */                       I011iIOio(sb, 1, "time_zone_offset_minutes", Integer.valueOf(l100ll0ooioo.I01illiil1Oo()));
                            }
/* 499 */                   if (l100ll0ooioo.I00IO1()) {
/* 511 */                       I011iIOio(sb, 1, "bundle_sequential_index", Integer.valueOf(l100ll0ooioo.I00IO1oi11O()));
                            }
/* 518 */                   if (l100ll0ooioo.I00oooO()) {
/* 530 */                       I011iIOio(sb, 1, "delivery_index", Integer.valueOf(l100ll0ooioo.I0100i()));
                            }
/* 537 */                   if (l100ll0ooioo.I00IlilI0i0i()) {
/* 549 */                       I011iIOio(sb, 1, "service_upload", Boolean.valueOf(l100ll0ooioo.I00Io1lO()));
                            }
/* 558 */                   I011iIOio(sb, 1, "health_monitor", l100ll0ooioo.I00IOO());
/* 565 */                   if (l100ll0ooioo.I00l0OO0IO()) {
/* 577 */                       I011iIOio(sb, 1, "retry_counter", Integer.valueOf(l100ll0ooioo.I00li1OI()));
                            }
/* 584 */                   if (l100ll0ooioo.I00lll10()) {
/* 592 */                       I011iIOio(sb, 1, "consent_signals", l100ll0ooioo.I00o0iI0io1());
                            }
/* 599 */                   if (l100ll0ooioo.I00ol1()) {
/* 611 */                       I011iIOio(sb, 1, "is_dma_region", Boolean.valueOf(l100ll0ooioo.I00olI()));
                            }
/* 618 */                   if (l100ll0ooioo.I00oli()) {
/* 626 */                       I011iIOio(sb, 1, "core_platform_services", l100ll0ooioo.I00oliIiO01i());
                            }
/* 633 */                   if (l100ll0ooioo.I00oO101o()) {
/* 641 */                       I011iIOio(sb, 1, "consent_diagnostics", l100ll0ooioo.I00oOio10iI1());
                            }
/* 648 */                   if (l100ll0ooioo.I00oI0i()) {
/* 660 */                       I011iIOio(sb, 1, "target_os_version", Long.valueOf(l100ll0ooioo.I00oII()));
                            }
/* 663 */                   iIO0ooOool.I00000oIO();
/* 679 */                   if (iil1iil.I01101IOlO(l100ll0ooioo.I00111O(), iol1II1ii1i.I0100i)) {
/* 691 */                       I011iIOio(sb, 1, "ad_services_version", Integer.valueOf(l100ll0ooioo.I00oo1iO0ll()));
/* 698 */                       if (l100ll0ooioo.I00ooIo0() && (l0o1io1oiiiiI00ooiO1I = l100ll0ooioo.I00ooiO1I()) != null) {
/* 706 */                           I0111i(2, sb);
/* 711 */                           sb.append("attribution_eligibility_status {\n");
/* 724 */                           I011iIOio(sb, 2, "eligible", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I00111O()));
/* 737 */                           I011iIOio(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001IIilI0O()));
/* 750 */                           I011iIOio(sb, 2, "pre_r", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001IO000()));
/* 763 */                           I011iIOio(sb, 2, "r_extensions_too_old", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001i1O0Ol()));
/* 776 */                           I011iIOio(sb, 2, "adservices_extension_too_old", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001i1lo1io()));
/* 789 */                           I011iIOio(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001iOo1i0O()));
/* 802 */                           I011iIOio(sb, 2, "measurement_manager_disabled", Boolean.valueOf(l0o1io1oiiiiI00ooiO1I.I001l0I00()));
/* 805 */                           I0111i(2, sb);
/* 808 */                           sb.append("}\n");
                                }
                            }
/* 815 */                   if (l100ll0ooioo.I0100o111I()) {
/* 817 */                       l0IiI1o01I1o l0iii1o01i1oI010101Oo1lO = l100ll0ooioo.I010101Oo1lO();
/* 821 */                       I0111i(2, sb);
/* 826 */                       sb.append("ad_campaign_info {\n");
/* 833 */                       if (l0iii1o01i1oI010101Oo1lO.I00IO1oi11O()) {
/* 841 */                           I011iIOio(sb, 2, "deep_link_gclid", l0iii1o01i1oI010101Oo1lO.I00IOO());
                                }
/* 848 */                       if (l0iii1o01i1oI010101Oo1lO.I00IioO0OiOi()) {
/* 856 */                           I011iIOio(sb, 2, "deep_link_gbraid", l0iii1o01i1oI010101Oo1lO.I00IlilI0i0i());
                                }
/* 863 */                       if (l0iii1o01i1oI010101Oo1lO.I00Io1lO()) {
/* 871 */                           I011iIOio(sb, 2, "deep_link_gad_source", l0iii1o01i1oI010101Oo1lO.I00Io1o110i());
                                }
/* 878 */                       if (l0iii1o01i1oI010101Oo1lO.I00OIo()) {
/* 886 */                           I011iIOio(sb, 2, "deep_link_url", l0iii1o01i1oI010101Oo1lO.I00OOll1());
                                }
/* 893 */                       if (l0iii1o01i1oI010101Oo1lO.I00IoIO0lI()) {
/* 905 */                           I011iIOio(sb, 2, "deep_link_session_millis", Long.valueOf(l0iii1o01i1oI010101Oo1lO.I00IoO0()));
                                }
/* 912 */                       if (l0iii1o01i1oI010101Oo1lO.I00IoiI()) {
/* 920 */                           I011iIOio(sb, 2, "market_referrer_gclid", l0iii1o01i1oI010101Oo1lO.I00Iooi00oi());
                                }
/* 927 */                       if (l0iii1o01i1oI010101Oo1lO.I00O0i0ii()) {
/* 935 */                           I011iIOio(sb, 2, "market_referrer_gbraid", l0iii1o01i1oI010101Oo1lO.I00O0o1oo());
                                }
/* 942 */                       if (l0iii1o01i1oI010101Oo1lO.I00O10llo()) {
/* 950 */                           I011iIOio(sb, 2, "market_referrer_gad_source", l0iii1o01i1oI010101Oo1lO.I00OI1());
                                }
/* 957 */                       if (l0iii1o01i1oI010101Oo1lO.I00OIO1()) {
/* 969 */                           I011iIOio(sb, 2, "market_referrer_click_millis", Long.valueOf(l0iii1o01i1oI010101Oo1lO.I00OIl()));
                                }
/* 972 */                       I0111i(2, sb);
/* 975 */                       sb.append("}\n");
                            }
/* 982 */                   if (l100ll0ooioo.I00OIO1()) {
/* 994 */                       I011iIOio(sb, 1, "batching_timestamp_millis", Long.valueOf(l100ll0ooioo.I00OIl()));
                            }
/* 1003 */                  if (l100ll0ooioo.I010I0()) {
/* 1005 */                      l1I1OlIIlO l1i1oliiloI010II = l100ll0ooioo.I010II();
/* 1009 */                      I0111i(2, sb);
/* 1014 */                      sb.append("sgtm_diagnostics {\n");
/* 1017 */                      int iI001i1lo1io = l1i1oliiloI010II.I001i1lo1io();
/* 1045 */                      I011iIOio(sb, 2, "upload_type", iI001i1lo1io != 1 ? iI001i1lo1io != 2 ? iI001i1lo1io != 3 ? iI001i1lo1io != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
/* 1058 */                      I011iIOio(sb, 2, "client_upload_eligibility", io1OllI.I001IIilI0O(l1i1oliiloI010II.I00111O()));
/* 1061 */                      int iI001iOo1i0O = l1i1oliiloI010II.I001iOo1i0O();
/* 1095 */                      I011iIOio(sb, 2, "service_upload_eligibility", iI001iOo1i0O != 1 ? iI001iOo1i0O != 2 ? iI001iOo1i0O != 3 ? iI001iOo1i0O != 4 ? iI001iOo1i0O != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
/* 1098 */                      I0111i(2, sb);
/* 1101 */                      sb.append("}\n");
                            }
/* 1108 */                  if (l100ll0ooioo.I00OIo()) {
/* 1110 */                      l0iiIl l0iiilI00OOll1 = l100ll0ooioo.I00OOll1();
/* 1114 */                      I0111i(2, sb);
/* 1119 */                      sb.append("consent_info_extra {\n");
/* 1134 */                      for (l0i111O0 l0i111o0 : l0iiilI00OOll1.I00111O()) {
/* 1142 */                          I0111i(3, sb);
/* 1147 */                          sb.append("limited_data_modes {\n");
/* 1150 */                          int iI001IIilI0O = l0i111o0.I001IIilI0O();
/* 1178 */                          I011iIOio(sb, 3, "type", iI001IIilI0O != 1 ? iI001IIilI0O != 2 ? iI001IIilI0O != 3 ? iI001IIilI0O != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
/* 1181 */                          int iI001IO000 = l0i111o0.I001IO000();
/* 1199 */                          I011iIOio(sb, 3, "mode", iI001IO000 != 1 ? iI001IO000 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
/* 1202 */                          I0111i(3, sb);
/* 1205 */                          sb.append("}\n");
                                }
/* 1209 */                      I0111i(2, sb);
/* 1212 */                      sb.append("}\n");
                            }
/* 1215 */                  iI00IlI1oII<l1IOl1iI00l> ii00ili1oiiI01Olioli = l100ll0ooioo.I01Olioli();
/* 1222 */                  if (ii00ili1oiiI01Olioli != null) {
/* 1234 */                      for (l1IOl1iI00l l1iol1ii00l : ii00ili1oiiI01Olioli) {
/* 1242 */                          if (l1iol1ii00l != null) {
/* 1244 */                              I0111i(2, sb);
/* 1249 */                              sb.append("user_property {\n");
/* 1270 */                              I011iIOio(sb, 2, "set_timestamp_millis", l1iol1ii00l.I00111O() ? Long.valueOf(l1iol1ii00l.I001IIilI0O()) : null);
/* 1281 */                              I011iIOio(sb, 2, "name", l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()));
/* 1290 */                              I011iIOio(sb, 2, "string_value", l1iol1ii00l.I001i1lo1io());
/* 1311 */                              I011iIOio(sb, 2, "int_value", l1iol1ii00l.I001iOo1i0O() ? Long.valueOf(l1iol1ii00l.I001l0I00()) : null);
/* 1332 */                              I011iIOio(sb, 2, "double_value", l1iol1ii00l.I001lloI() ? Double.valueOf(l1iol1ii00l.I00II0Ol1O0l()) : null);
/* 1335 */                              I0111i(2, sb);
/* 1338 */                              sb.append("}\n");
                                    }
                                }
                            }
/* 1342 */                  iI00IlI1oII<l0OOloOi10O> ii00ili1oiiI00Io1o110i = l100ll0ooioo.I00Io1o110i();
/* 1346 */                  if (ii00ili1oiiI00Io1o110i != null) {
/* 1357 */                      for (l0OOloOi10O l0oolooi10o : ii00ili1oiiI00Io1o110i) {
/* 1365 */                          if (l0oolooi10o != null) {
/* 1367 */                              I0111i(2, sb);
/* 1372 */                              sb.append("audience_membership {\n");
/* 1379 */                              if (l0oolooi10o.I00111O()) {
/* 1391 */                                  I011iIOio(sb, 2, "audience_id", Integer.valueOf(l0oolooi10o.I001IIilI0O()));
                                        }
/* 1398 */                              if (l0oolooi10o.I001iOo1i0O()) {
/* 1410 */                                  I011iIOio(sb, 2, "new_audience", Boolean.valueOf(l0oolooi10o.I001l0I00()));
                                        }
/* 1419 */                              I011Ol0(sb, "current_data", l0oolooi10o.I001IO000());
/* 1426 */                              if (l0oolooi10o.I001i1O0Ol()) {
/* 1434 */                                  I011Ol0(sb, "previous_data", l0oolooi10o.I001i1lo1io());
                                        }
/* 1437 */                              I0111i(2, sb);
/* 1440 */                              sb.append("}\n");
                                    }
                                }
                            }
/* 1444 */                  List<l0l1iIIOl> listI01OOiI1o = l100ll0ooioo.I01OOiI1o();
/* 1448 */                  if (listI01OOiI1o != null) {
/* 1460 */                      for (l0l1iIIOl l0l1iiiol : listI01OOiI1o) {
/* 1468 */                          if (l0l1iiiol != null) {
/* 1470 */                              I0111i(2, sb);
/* 1475 */                              sb.append("event {\n");
/* 1486 */                              I011iIOio(sb, 2, "name", l00i1l00olio.I00000oIO(l0l1iiiol.I001iOo1i0O()));
/* 1493 */                              if (l0l1iiiol.I001l0I00()) {
/* 1505 */                                  I011iIOio(sb, 2, "timestamp_millis", Long.valueOf(l0l1iiiol.I001lIiIIo1O()));
                                        }
/* 1514 */                              if (iil1iil.I01101IOlO(null, iol1II1ii1i.I01101olii) && l0l1iiiol.I00IO1()) {
/* 1532 */                                  I011iIOio(sb, 2, "corrected_timestamp_millis", Long.valueOf(l0l1iiiol.I00IO1oi11O()));
                                        }
/* 1539 */                              if (l0l1iiiol.I001lllioOl()) {
/* 1551 */                                  I011iIOio(sb, 2, "previous_timestamp_millis", Long.valueOf(l0l1iiiol.I001lloI()));
                                        }
/* 1558 */                              if (l0l1iiiol.I00II0Ol1O0l()) {
/* 1570 */                                  I011iIOio(sb, 2, "count", Integer.valueOf(l0l1iiiol.I00II0oii1o()));
                                        }
/* 1577 */                              if (l0l1iiiol.I001i1O0Ol() != 0) {
/* 1585 */                                  I0110OiO(sb, 2, (iI00IlI1oII) l0l1iiiol.I001IO000());
                                        }
/* 1588 */                              I0111i(2, sb);
/* 1591 */                              sb.append("}\n");
                                    }
                                }
                            }
/* 1596 */                  I0111i(1, sb);
/* 1599 */                  sb.append("}\n");
                        }
                    }
/* 1606 */          sb.append("} // End-of-batch\n");
/* 1609 */          return sb.toString();
                }

                public final String I01I01Oolii(ioOIO1il0i iooio1il0i) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("\nproperty_filter {\n");
/* 16 */            if (iooio1il0i.I00111O()) {
/* 28 */                I011iIOio(sb, 0, "filter_id", Integer.valueOf(iooio1il0i.I001IIilI0O()));
                    }
/* 47 */            I011iIOio(sb, 0, "property_name", ((l0olllO1i) this.I00iOIl).I00l0OO0IO.I0000Il00O(iooio1il0i.I001IO000()));
/* 62 */            String strI011IOil = I011IOil(iooio1il0i.I001i1lo1io(), iooio1il0i.I001iOo1i0O(), iooio1il0i.I001lIiIIo1O());
/* 70 */            if (!strI011IOil.isEmpty()) {
/* 74 */                I011iIOio(sb, 0, "filter_type", strI011IOil);
                    }
/* 82 */            I0110o(sb, 1, iooio1il0i.I001i1O0Ol());
/* 87 */            sb.append("}\n");
/* 90 */            return sb.toString();
                }

                public final Parcelable I01I0Iioooo0(byte[] bArr, Parcelable.Creator creator) {
/* 1 */             Parcelable parcelable = null;
/* 2 */             if (bArr == null) {
/* 1 */                 return null;
                    }
/* 5 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 11 */                    parcelObtain.unmarshall(bArr, 0, bArr.length);
/* 14 */                    parcelObtain.setDataPosition(0);
/* 21 */                    parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
                        } catch (OiIi1iiiil01 unused) {
/* 31 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 33 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 40 */                    l01o0io1ooo0.I00ilO0.I00000oOI("Failed to load parcelable from buffer");
                        }
/* 46 */                return parcelable;
                    } finally {
/* 47 */                parcelObtain.recycle();
                    }
                }

                public final List I01IO1il(iI001o1 ii001o1, List list) {
                    int i;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             ArrayList arrayList = new ArrayList(ii001o1);
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                Integer num = (Integer) it.next();
/* 30 */                if (num.intValue() < 0) {
/* 32 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 34 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 41 */                    l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Ignoring negative bit index to be cleared", num);
                        } else {
/* 49 */                    int iIntValue = num.intValue() / 64;
/* 55 */                    if (iIntValue >= arrayList.size()) {
/* 57 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 59 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 74 */                        l01o0io1ooo02.I00l0I0l0lO1.I0000O(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                            } else {
/* 103 */                       arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                            }
                        }
                    }
/* 107 */           int size = arrayList.size();
                    int size2 = arrayList.size() - 1;
                    while (true) {
/* 117 */               int i2 = size2;
/* 118 */               i = size;
/* 119 */               size = i2;
/* 120 */               if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                            break;
                        }
                        size2 = size - 1;
                    }
/* 143 */           return arrayList.subList(0, i);
                }

                public final boolean I01Ii0ll10O(long j, long j2) {
/* 5 */             if (j == 0 || j2 <= 0) {
/* 36 */                return true;
                    }
/* 17 */            ((l0olllO1i) this.I00iOIl).I00li1OI.getClass();
                    return Math.abs(System.currentTimeMillis() - j) > j2;
                }

                public final long I01IiOO(byte[] bArr) throws NoSuchAlgorithmException {
/* 1 */             lII0I0I000I.I000II(bArr);
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 10 */            l0olllO1i.I0000oI00(lioil0ilioi);
/* 13 */            lioil0ilioi.I010II();
/* 16 */            MessageDigest messageDigestI011Io0I1ioi = lioil0ilIOi.I011Io0I1ioi();
/* 20 */            if (messageDigestI011Io0I1ioi != null) {
/* 41 */                return lioil0ilIOi.I011Ol0(messageDigestI011Io0I1ioi.digest(bArr));
                    }
/* 22 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 24 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 31 */            l01o0io1ooo0.I00ilO0.I00000oOI("Failed to get MD5");
/* 34 */            return 0L;
                }

                public final byte[] I01Iio10lo(byte[] bArr) {
                    try {
/* 3 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */                 GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
/* 11 */                gZIPOutputStream.write(bArr);
/* 14 */                gZIPOutputStream.close();
/* 17 */                byteArrayOutputStream.close();
/* 20 */                return byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
/* 30 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 32 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 39 */                l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to gzip content", e);
/* 77 */                throw e;
                    }
                }

                @Override
/* 19 */        public final void I010iIIOlo() {
                }
            }

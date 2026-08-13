            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Typeface;
            import android.graphics.fonts.Font;
            import android.graphics.fonts.FontFamily;
            import android.graphics.fonts.FontStyle;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.Provider;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import javax.crypto.KeyAgreement;
            import kotlin.jvm.functions.Function1;
            
/* 145 */   public final class i1i0olI implements OolOl0lI, Oi1lI0iIIOl, OoI0o0oiol0l, IIO1Oi1, IOoOOI1ii, Il0OlI, IoIo10lOo1, OOIoilO1I10I, i0Ii0I1ll, IOoillilli, iliIOlooOio, iiIi1oo0Io, IOiOiIIiii1, lo11I0lO {
                public static i1i0olI I00iiI;
                public static final I11IiIloOo I00iiO = new I11IiIloOo();
                public static final i1i0olI I00iio = new i1i0olI(2);
                public static final i1i0olI I00ilI0I1 = new i1i0olI(3);
                public static final i1i0olI I00ilO0 = new i1i0olI(4);
                public static final i1i0olI I00io1l = new i1i0olI(5);
                public static final i1i0olI I00ioIO = new i1i0olI(8);
                public static final i1i0olI I00l0I0l0lO1 = new i1i0olI(18);
                public static final i1i0olI I00l0OO0IO = new i1i0olI(21);
                public static final i1i0olI I00li1OI = new i1i0olI(22);
                public static final i1i0olI I00ll1 = new i1i0olI(23);
                public static final i1i0olI I00lli11 = new i1i0olI(24);
                public static final i1i0olI I00lll10 = new i1i0olI(25);
                public static final i1i0olI I00o0iI0io1 = new i1i0olI(27);
                public final int I00iOIl;

                public i1i0olI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static I1ili1lI0O I000OOo1O(long j, long j2, long j3) {
/* 3 */             I1ili1lI0O i1ili1lI0O = new I1ili1lI0O();
/* 6 */             i1ili1lI0O.I00000oIO = j;
/* 8 */             i1ili1lI0O.I00000oOI = j2;
/* 10 */            i1ili1lI0O.I0000Il00O = j3;
/* 12 */            long j4 = Oo0o1OiIo.I0000Il00O;
/* 19 */            if (Oo0o1OiIo.I00000oOI(j, j4)) {
/* 160 */               I000II.I000iOII("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
/* 18 */                return null;
                    }
/* 25 */            if (Oo0o1OiIo.I00000oOI(j2, j4)) {
/* 154 */               I000II.I000iOII("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
/* 18 */                return null;
                    }
/* 31 */            if (Oo0o1OiIo.I00000oOI(j3, j4)) {
/* 148 */               I000II.I000iOII("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
/* 18 */                return null;
                    }
/* 45 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), Oo0o1OiIo.I0000Il00O(j2))) {
/* 47 */                lOlilO1lOIO.I00000oOI(j, j2);
/* 62 */                if (Float.compare(Oo0o1OiIo.I0000O(j), Oo0o1OiIo.I0000O(j2)) > 0) {
/* 64 */                    i1ili1lI0O.I00000oIO = j2;
/* 66 */                    j = j2;
                        }
                    }
/* 80 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j3), 4294967296L)) {
/* 85 */                long jI0000oI00 = lOlilO1lOIO.I0000oI00(1.0E-4f, 4294967296L);
/* 89 */                lOlilO1lOIO.I00000oOI(j3, jI0000oI00);
/* 104 */               if (Float.compare(Oo0o1OiIo.I0000O(j3), Oo0o1OiIo.I0000O(jI0000oI00)) < 0) {
/* 109 */                   I000II.I000iOII("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
/* 18 */                    return null;
                        }
                    }
/* 120 */           if (Oo0o1OiIo.I0000O(j) < 0.0f) {
/* 142 */               I000II.I000iOII("AutoSize.StepBased: minFontSize must not be negative");
/* 18 */                return null;
                    }
/* 128 */           if (Oo0o1OiIo.I0000O(j2) >= 0.0f) {
/* 130 */               VarHandle.storeStoreFence();
/* 133 */               return i1ili1lI0O;
                    }
/* 136 */           I000II.I000iOII("AutoSize.StepBased: maxFontSize must not be negative");
/* 18 */            return null;
                }

                public static Font I000l1(FontFamily fontFamily, int i) {
/* 21 */            FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
/* 24 */            Font font = fontFamily.getFont(0);
/* 32 */            int iI000o00OoI0I = I000o00OoI0I(fontStyle, font.getStyle());
/* 40 */            for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
/* 42 */                Font font2 = fontFamily.getFont(i2);
/* 50 */                int iI000o00OoI0I2 = I000o00OoI0I(fontStyle, font2.getStyle());
/* 54 */                if (iI000o00OoI0I2 < iI000o00OoI0I) {
/* 56 */                    font = font2;
/* 57 */                    iI000o00OoI0I = iI000o00OoI0I2;
                        }
                    }
/* 106 */           return font;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static FontFamily I000lI(Ilili1O1io[] ilili1O1ioArr, ContentResolver contentResolver) throws IOException {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
                    Font fontBuild;
/* 4 */             FontFamily.Builder builder = null;
/* 6 */             for (Ilili1O1io ilili1O1io : ilili1O1ioArr) {
/* 18 */                boolean zEquals = Objects.equals(ilili1O1io.I00000oIO.getScheme(), "systemfont");
/* 22 */                Uri uri = ilili1O1io.I00000oIO;
/* 24 */                String str = ilili1O1io.I0000oI00;
/* 26 */                if (zEquals) {
/* 43 */                    String authority = Objects.equals(uri.getScheme(), "systemfont") ? uri.getAuthority() : null;
/* 44 */                    if (authority == null) {
/* 76 */                        fontBuild = null;
                            } else {
/* 47 */                        Typeface typefaceCreate = Typeface.create(authority, 0);
/* 53 */                        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
/* 57 */                        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
/* 66 */                            typefaceCreate = null;
                                }
/* 67 */                        if (typefaceCreate != null && (fontBuild = OoOl10O1o.I0001Ioi1lo(typefaceCreate)) != null) {
/* 83 */                            if (!TextUtils.isEmpty(str)) {
                                        try {
/* 95 */                                    fontBuild = new Font.Builder(fontBuild).setFontVariationSettings(str).build();
                                        } catch (IOException unused) {
/* 104 */                                   Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                }
                            }
                        } else {
                            try {
/* 110 */                       parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                            } catch (IOException e) {
/* 180 */                       Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                            }
/* 114 */                   if (parcelFileDescriptorOpenFileDescriptor == null) {
/* 116 */                       if (parcelFileDescriptorOpenFileDescriptor != null) {
/* 118 */                           parcelFileDescriptorOpenFileDescriptor.close();
                                }
/* 76 */                        fontBuild = null;
                            } else {
                                try {
/* 143 */                           Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ilili1O1io.I0000Il00O).setSlant(ilili1O1io.I0000O ? 1 : 0).setTtcIndex(ilili1O1io.I00000oOI);
/* 151 */                           if (!TextUtils.isEmpty(str)) {
/* 153 */                               ttcIndex.setFontVariationSettings(str);
                                    }
/* 159 */                           fontBuild = ttcIndex.build();
/* 163 */                           parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th) {
                                    try {
/* 167 */                               parcelFileDescriptorOpenFileDescriptor.close();
                                    } catch (Throwable th2) {
/* 172 */                               th.addSuppressed(th2);
                                    }
/* 175 */                           throw th;
                                }
                            }
                        }
/* 184 */               if (fontBuild != null) {
/* 187 */                   if (builder == null) {
/* 191 */                       builder = new FontFamily.Builder(fontBuild);
                            } else {
/* 195 */                       builder.addFont(fontBuild);
                            }
                        }
                    }
/* 202 */           if (builder == null) {
/* 2 */                 return null;
                    }
/* 205 */           return builder.build();
                }

                public static int I000o00OoI0I(FontStyle fontStyle, FontStyle fontStyle2) {
/* 29 */            return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static Ol0O0iI0l0O I00100o1O0lo(Ol0O0iI0l0O ol0O0iI0l0O) {
                    O0iIl1 o0iIl1I00000oOI;
/* 1 */             OoOIOoO1I ooOIOoO1II00iOIl = ol0O0iI0l0O.I00iOIl();
/* 10 */            OoOOiO ooOOiO = null;
/* 11 */            if (ooOIOoO1II00iOIl instanceof IO0OOo) {
/* 13 */                IO0OOo iO0OOo = (IO0OOo) ooOIOoO1II00iOIl;
/* 15 */                OoOi1Ol ooOi1Ol = iO0OOo.I00iOIl;
/* 27 */                OoOi1Ol ooOi1Ol2 = ooOi1Ol.I00000oIO() == Ooo0Ioii0o0.I00iio ? ooOi1Ol : null;
/* 42 */                Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = (ooOi1Ol2 == null || (o0iIl1I00000oOI = ooOi1Ol2.I00000oOI()) == null) ? null : o0iIl1I00000oOI.I00l0OO0IO();
/* 43 */                OIIOli0 oIIOli0 = iO0OOo.I00iiI;
/* 45 */                if (oIIOli0 == null) {
/* 47 */                    Collection collectionI0000oI00 = iO0OOo.I0000oI00();
/* 59 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI0000oI00, 10));
/* 62 */                    Iterator it = collectionI0000oI00.iterator();
/* 70 */                    while (it.hasNext()) {
/* 82 */                        arrayList.add(((O0iIl1) it.next()).I00l0OO0IO());
                            }
/* 90 */                    IiOl01 iiOl01 = new IiOl01(1);
/* 93 */                    iiOl01.I00iiI = arrayList;
/* 95 */                    VarHandle.storeStoreFence();
/* 100 */                   oIIOli0 = new OIIOli0(ooOi1Ol, iiOl01, ooOOiO, 8);
/* 103 */                   iO0OOo.I00iiI = oIIOli0;
                        }
/* 120 */               return new OIIOlOIoOO(IO0Io01l1.I00iOIl, oIIOli0, ooioo0o1l0I00l0OO0IO, ol0O0iI0l0O.I00OloOo(), ol0O0iI0l0O.I00iiI(), 32);
                    }
/* 126 */           if (!(ooOIOoO1II00iOIl instanceof Iooo1o0oiOo) || !ol0O0iI0l0O.I00iiI()) {
/* 437 */               return ol0O0iI0l0O;
                    }
/* 134 */           Iooo1o0oiOo iooo1o0oiOo = (Iooo1o0oiOo) ooOIOoO1II00iOIl;
/* 136 */           LinkedHashSet linkedHashSet = iooo1o0oiOo.I00iiI;
/* 144 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(linkedHashSet, 10));
/* 147 */           Iterator it2 = linkedHashSet.iterator();
/* 151 */           boolean z = false;
/* 156 */           while (it2.hasNext()) {
/* 168 */               arrayList2.add(OoOilo0Oliii.I000II((O0iIl1) it2.next()));
/* 171 */               z = true;
                    }
/* 173 */           if (z) {
/* 176 */               O0iIl1 o0iIl1 = iooo1o0oiOo.I00iOIl;
/* 180 */               Ooioo0o1l0 ooioo0o1l0I000II = o0iIl1 != null ? OoOilo0Oliii.I000II(o0iIl1) : null;
/* 184 */               arrayList2.isEmpty();
/* 189 */               LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
/* 192 */               linkedHashSet2.hashCode();
/* 197 */               Iooo1o0oiOo iooo1o0oiOo2 = new Iooo1o0oiOo(linkedHashSet2);
/* 200 */               iooo1o0oiOo2.I00iOIl = ooioo0o1l0I000II;
/* 202 */               ooOOiO = iooo1o0oiOo2;
                    }
/* 203 */           if (ooOOiO != null) {
/* 206 */               iooo1o0oiOo = ooOOiO;
                    }
/* 207 */           return iooo1o0oiOo.I00000oIO();
                }

                public static ii10O1i0I I0010I0i(Object obj) {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) obj;
/* 3 */             ii10O1i0I ii10o1i0i = ii0oooo10.zzc;
/* 7 */             if (ii10o1i0i != ii10O1i0I.I0001Ioi1lo) {
/* 29 */                return ii10o1i0i;
                    }
/* 9 */             ii10O1i0I ii10o1i0iI00000oOI = ii10O1i0I.I00000oOI();
/* 13 */            ii0oooo10.zzc = ii10o1i0iI00000oOI;
/* 29 */            return ii10o1i0iI00000oOI;
                }

                public static synchronized void I0010o() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new i1i0olI(0);
                    }
                }

                public static boolean I00111O(int i, IOOOi1 iOOOi1, Object obj) throws ii0iI11ol {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 5 */             int i2 = iOOOi1.I00000oOI;
/* 7 */             int i3 = i2 >>> 3;
/* 9 */             int i4 = i2 & 7;
/* 14 */            if (i4 == 0) {
/* 144 */               iOOOi1.I01Io001O(0);
/* 159 */               ((ii10O1i0I) obj).I0000Il00O(i3 << 3, Long.valueOf(ioooi0.I00i01iIIliI()));
/* 12 */                return true;
                    }
/* 16 */            if (i4 == 1) {
/* 124 */               iOOOi1.I01Io001O(1);
/* 140 */               ((ii10O1i0I) obj).I0000Il00O((i3 << 3) | 1, Long.valueOf(ioooi0.I00OloOo()));
/* 12 */                return true;
                    }
/* 19 */            if (i4 == 2) {
/* 120 */               ((ii10O1i0I) obj).I0000Il00O((i3 << 3) | 2, iOOOi1.I01O10iIoo1O());
/* 12 */                return true;
                    }
/* 21 */            if (i4 != 3) {
/* 24 */                if (i4 != 4) {
/* 27 */                    if (i4 == 5) {
/* 29 */                        iOOOi1.I01Io001O(5);
/* 45 */                        ((ii10O1i0I) obj).I0000Il00O(5 | (i3 << 3), Integer.valueOf(ioooi0.I00OOll1()));
/* 12 */                        return true;
                            }
/* 49 */                    OoOil11Ol1o.I001IO000();
                        }
/* 11 */                return false;
                    }
/* 53 */            ii10O1i0I ii10o1i0iI00000oOI = ii10O1i0I.I00000oOI();
/* 57 */            int i5 = i3 << 3;
/* 59 */            int i6 = i + 1;
/* 62 */            if (i6 >= 100) {
/* 107 */               OoOil11Ol1o.I001iOo1i0O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 11 */                return false;
                    }
/* 71 */            while (iOOOi1.I01Iol() != Integer.MAX_VALUE && I00111O(i6, iOOOi1, ii10o1i0iI00000oOI)) {
                    }
/* 83 */            if ((i5 | 4) != iOOOi1.I00000oOI) {
/* 101 */               OoOil11Ol1o.I001iOo1i0O("Protocol message end-group tag did not match expected tag.");
/* 11 */                return false;
                    }
/* 87 */            if (ii10o1i0iI00000oOI.I0000oI00) {
/* 89 */                ii10o1i0iI00000oOI.I0000oI00 = false;
                    }
/* 95 */            ((ii10O1i0I) obj).I0000Il00O(i5 | 3, ii10o1i0iI00000oOI);
/* 12 */            return true;
                }

                @Override
                public byte[] I00000oIO(byte[] bArr, int i, int i2) {
/* 2 */             return Arrays.copyOfRange(bArr, i, i2 + i);
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 15 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
/* 35 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
/* 36 */            int i = OiO101lO.I00000oIO;
/* 106 */           return jFloatToRawIntBits;
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             i0O0oOiO11 i0o0ooio11 = new i0O0oOiO11();
/* 11 */            i0o0ooio11.I00000oIO = new HashMap();
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            return i0o0ooio11;
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) {
/* 13 */            Intent intent = (Intent) ((Bundle) oloIIoII1oo.I000II()).getParcelable("notification_data");
/* 15 */            if (intent != null) {
/* 19 */                return new IOO1o0(intent);
                    }
/* 23 */            return null;
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
                }

                @Override
                public void I0001Ioi1lo(int i, Object obj) {
                    String str;
                    switch (i) {
                        case 1:
/* 34 */                    str = "RESULT_INSTALL_SUCCESS";
                            break;
                        case 2:
/* 31 */                    str = "RESULT_ALREADY_INSTALLED";
                            break;
                        case 3:
/* 28 */                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                            break;
                        case 4:
/* 25 */                    str = "RESULT_NOT_WRITABLE";
                            break;
                        case 5:
/* 22 */                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                            break;
                        case 6:
/* 19 */                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                            break;
                        case 7:
/* 16 */                    str = "RESULT_IO_EXCEPTION";
                            break;
                        case 8:
/* 13 */                    str = "RESULT_PARSE_EXCEPTION";
                            break;
                        case 9:
                        default:
/* 4 */                     str = "";
                            break;
                        case 10:
/* 10 */                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                            break;
                        case 11:
/* 7 */                     str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                            break;
                    }
/* 37 */            if (i == 6 || i == 7 || i == 8) {
/* 51 */                Log.e("ProfileInstaller", str, (Throwable) obj);
                    }
                }

                @Override
                public void I000II(Object obj, IoIlI1oli ioIlI1oli) {
/* 13 */            ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000o00OoI0I, new IoOIOiI01i00((IoOIi0o) obj, ioIlI1oli, null));
                }

                @Override
                public Object I000O01llI0(Function1 function1) {
/* 8 */             function1.invoke(new i1O10l1io1iO(12));
/* 13 */            IoOIi0o ioOIi0o = new IoOIi0o();
/* 21 */            ioOIi0o.I00000oIO = new ArrayList();
/* 23 */            VarHandle.storeStoreFence();
/* 29 */            return ioOIi0o;
                }

                @Override
                public boolean I000OiO() {
/* 1 */             return false;
                }

                public Typeface I000iOII(Context context, List list, int i) {
/* 1 */             ContentResolver contentResolver = context.getContentResolver();
                    try {
/* 13 */                FontFamily fontFamilyI000lI = I000lI((Ilili1O1io[]) list.get(0), contentResolver);
/* 17 */                if (fontFamilyI000lI == null) {
/* 6 */                     return null;
                        }
/* 22 */                Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyI000lI);
/* 30 */                for (int i2 = 1; i2 < list.size(); i2++) {
/* 38 */                    FontFamily fontFamilyI000lI2 = I000lI((Ilili1O1io[]) list.get(i2), contentResolver);
/* 42 */                    if (fontFamilyI000lI2 != null) {
/* 44 */                        customFallbackBuilder.addCustomFallback(fontFamilyI000lI2);
                            }
                        }
/* 65 */                return customFallbackBuilder.setStyle(I000l1(fontFamilyI000lI, i).getStyle()).build();
                    } catch (Exception e) {
/* 74 */                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
/* 6 */                 return null;
                    }
                }

                public O0O01001OOII I000oI1ioi(O0IOli0o0 o0IOli0o0, Object obj) {
/* 6 */             if (!o0IOli0o0.I001i1O0Ol(obj)) {
/* 5 */                 return null;
                    }
/* 10 */            OoOOI1100oI0.I0000O(1, null);
/* 5 */             return null;
                }

                public Ooioo0o1l0 I00100l0(O0iIo0i1 o0iIo0i1) {
                    Ooioo0o1l0 ooioo0o1l0I00000oIO;
/* 4 */             if (!(o0iIo0i1 instanceof O0iIl1)) {
/* 75 */                I000II.I000iOII("Failed requirement.");
/* 3 */                 return null;
                    }
/* 8 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = ((O0iIl1) o0iIo0i1).I00l0OO0IO();
/* 14 */            if (ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O) {
/* 19 */                ooioo0o1l0I00000oIO = I00100o1O0lo((Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO);
                    } else {
/* 26 */                if (!(ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io)) {
/* 69 */                    I000II.I00000oIO();
/* 3 */                     return null;
                        }
/* 29 */                IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
/* 31 */                Ol0O0iI0l0O ol0O0iI0l0O = ilOIOIi00io.I00iiO;
/* 33 */                Ol0O0iI0l0O ol0O0iI0l0O2 = ilOIOIi00io.I00iiI;
/* 35 */                Ol0O0iI0l0O ol0O0iI0l0OI00100o1O0lo = I00100o1O0lo(ol0O0iI0l0O2);
/* 39 */                Ol0O0iI0l0O ol0O0iI0l0OI00100o1O0lo2 = I00100o1O0lo(ol0O0iI0l0O);
/* 50 */                ooioo0o1l0I00000oIO = (ol0O0iI0l0OI00100o1O0lo == ol0O0iI0l0O2 && ol0O0iI0l0OI00100o1O0lo2 == ol0O0iI0l0O) ? ooioo0o1l0I00l0OO0IO : l0loOIIo0iOo.I00000oIO(ol0O0iI0l0OI00100o1O0lo, ol0O0iI0l0OI00100o1O0lo2);
                    }
/* 54 */            O0iIl1 o0iIl1I00000oIO = lOoll01ll0I.I00000oIO(ooioo0o1l0I00l0OO0IO);
/* 64 */            return lOoll01ll0I.I00000oOI(ooioo0o1l0I00000oIO, o0iIl1I00000oIO != null ? I00100l0(o0iIl1I00000oIO) : null);
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             return (byte[]) obj;
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 7 */             OOiO0Il oOiO0IlI0001Ioi1lo = ((I1ii1o0) iOiOIoiiO0i).I0001Ioi1lo(iolOOiI.class);
/* 11 */            Oi00Ii oi00Ii = new Oi00Ii();
/* 14 */            oi00Ii.I00000oIO = oOiO0IlI0001Ioi1lo;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return oi00Ii;
                }

                @Override
                public I1OoollI1Il1 getKey() {
/* 1 */             return IoOIi0o.I0000Il00O;
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 120 */                   List list = iol1II1ii1i.I00000oIO;
/* 124 */                   iI1lO0li.I00iiI.get();
/* 144 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 94 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 98 */                    iI1lO0li.I00iiI.get();
/* 117 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
                        case PoseLandmark.LEFT_HIP:
/* 60 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 64 */                    iI1lO0li.I00iiI.get();
/* 89 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
                        case PoseLandmark.RIGHT_HIP:
/* 36 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 40 */                    iI1lO0li.I00iiI.get();
/* 57 */                    return (Boolean) iI1liIi1li.I00000oIO.I0010o(true, "measurement.config.notify_trigger_uris_on_backgrounded", 31).get();
                        case PoseLandmark.LEFT_KNEE:
/* 13 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 17 */                    iIO0ooOool.I00iiI.get();
/* 33 */                    return (Boolean) iIO1lO.I00000oIO.I0010o(true, "measurement.rb.attribution.service", 6).get();
                        default:
/* 9 */                     return new LinkedHashMap();
                    }
                }

                @Override
/* 146 */       public iOIIOoOoii zza() {
/* 147 */           return iOIIOoOoii.I0000Il00O(6, null, "AICore service disconnected");
                }
            }

            package p000;

            import android.media.CamcorderProfile;
            import android.media.EncoderProfiles;
            import android.os.Build;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
            import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class Il0IIO implements Il0IIIo1I {
                public String I00000oOI;
                public OOil0lI I0000Il00O;
                public boolean I0000O;
                public int I0000oI00;
                public LinkedHashMap I0001Ioi1lo;

                @Override
                public final boolean I00000oIO(int i) {
                    return this.I0000O && I00000oOI(i) != null;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I1l01l0lllO I00000oOI(int i) {
                    I1l01l0lllO i1l01l0lllOI00000oIO;
                    CamcorderProfile camcorderProfile;
                    String str;
                    int i2;
                    String str2;
                    boolean zContains;
/* 5 */             int i3 = this.I0000oI00;
/* 7 */             LinkedHashMap linkedHashMap = this.I0001Ioi1lo;
/* 11 */            I1l01l0lllO i1l01l0lllO = null;
/* 12 */            if (!this.I0000O || !CamcorderProfile.hasProfile(i3, i)) {
/* 11 */                return null;
                    }
/* 30 */            if (linkedHashMap.containsKey(Integer.valueOf(i))) {
/* 40 */                return (I1l01l0lllO) linkedHashMap.get(Integer.valueOf(i));
                    }
/* 45 */            EncoderProfiles all = CamcorderProfile.getAll(this.I00000oOI, i);
/* 50 */            if (all != null) {
/* 64 */                if (IiOoli.I00000oIO(InvalidVideoProfilesQuirk.class) != null) {
/* 66 */                    l11I11lO.I0000O(3, "EncoderProfilesProviderAdapter");
                        } else {
                            try {
/* 70 */                        i1l01l0lllOI00000oIO = ilI1iII00oO.I00000oIO(all);
                            } catch (NullPointerException e) {
/* 79 */                        l11I11lO.I0001Ioi1lo("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e);
                            }
                        }
                        try {
/* 82 */                    camcorderProfile = CamcorderProfile.get(i3, i);
                        } catch (RuntimeException e2) {
/* 102 */                   l11I11lO.I0001Ioi1lo("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + i, e2);
/* 105 */                   camcorderProfile = null;
                        }
/* 106 */               if (camcorderProfile != null) {
/* 131 */                   l11I11lO.I0000oI00("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + Build.VERSION.SDK_INT + "instead. CamcorderProfile is deprecated on API 31.");
/* 134 */                   int i4 = camcorderProfile.duration;
/* 136 */                   int i5 = camcorderProfile.fileFormat;
/* 140 */                   ArrayList arrayList = new ArrayList();
/* 143 */                   int i6 = camcorderProfile.audioCodec;
                            switch (i6) {
                                case 1:
/* 163 */                           str = "audio/3gpp";
                                    break;
                                case 2:
/* 160 */                           str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
/* 157 */                           str = "audio/mp4a-latm";
                                    break;
                                case 6:
/* 154 */                           str = "audio/vorbis";
                                    break;
                                case 7:
/* 151 */                           str = "audio/opus";
                                    break;
                                default:
/* 148 */                           str = "audio/none";
                                    break;
                            }
/* 165 */                   int i7 = camcorderProfile.audioBitRate;
/* 167 */                   int i8 = camcorderProfile.audioSampleRate;
/* 169 */                   int i9 = camcorderProfile.audioChannels;
/* 171 */                   if (i6 != 3) {
/* 174 */                       i2 = 5;
/* 175 */                       if (i6 != 4) {
/* 181 */                           i2 = i6 != 5 ? -1 : 39;
                                }
                            } else {
/* 184 */                       i2 = 2;
                            }
/* 189 */                   arrayList.add(I1l01I10II1.I00000oIO(i6, str, i7, i8, i9, i2));
/* 194 */                   ArrayList arrayList2 = new ArrayList();
/* 197 */                   int i10 = camcorderProfile.videoCodec;
                            switch (i10) {
                                case 1:
/* 226 */                           str2 = "video/3gpp";
                                    break;
                                case 2:
/* 223 */                           str2 = "video/avc";
                                    break;
                                case 3:
/* 220 */                           str2 = "video/mp4v-es";
                                    break;
                                case 4:
/* 217 */                           str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
/* 214 */                           str2 = "video/hevc";
                                    break;
                                case 6:
/* 211 */                           str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
/* 208 */                           str2 = "video/dolby-vision";
                                    break;
                                case 8:
/* 205 */                           str2 = "video/av01";
                                    break;
                                default:
/* 202 */                           str2 = "video/none";
                                    break;
                            }
/* 248 */                   arrayList2.add(I1l01ooO.I00000oIO(i10, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
/* 251 */                   i1l01l0lllOI00000oIO = I1l01l0lllO.I00000oIO(i4, i5, arrayList, arrayList2);
                        } else {
/* 52 */                    i1l01l0lllOI00000oIO = null;
                        }
                    }
/* 255 */           if (i1l01l0lllOI00000oIO != null) {
/* 265 */               CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.I0000Il00O.I00000oOI(CamcorderProfileResolutionQuirk.class);
/* 268 */               if (camcorderProfileResolutionQuirk == null) {
/* 270 */                   zContains = true;
/* 318 */                   if (!zContains) {
/* 320 */                       List list = Il0IIIo1I.I00000oIO;
/* 322 */                       if (i == 0) {
/* 355 */                           int iI000II = IOOi1I.I000II(list);
                                    while (true) {
/* 359 */                               if (-1 < iI000II) {
/* 371 */                                   I1l01l0lllO i1l01l0lllOI00000oOI = I00000oOI(((Number) list.get(iI000II)).intValue());
/* 375 */                                   if (i1l01l0lllOI00000oOI != null) {
/* 377 */                                       i1l01l0lllO = i1l01l0lllOI00000oOI;
                                            } else {
                                                iI000II--;
                                            }
                                        }
                                    }
                                } else if (i == 1) {
/* 327 */                           Iterator it = list.iterator();
                                    while (true) {
/* 335 */                               if (it.hasNext()) {
/* 347 */                                   I1l01l0lllO i1l01l0lllOI00000oOI2 = I00000oOI(((Integer) it.next()).intValue());
/* 351 */                                   if (i1l01l0lllOI00000oOI2 != null) {
/* 353 */                                       i1l01l0lllO = i1l01l0lllOI00000oOI2;
                                            }
                                        }
                                    }
                                }
/* 382 */                       i1l01l0lllOI00000oIO = i1l01l0lllO;
                            }
                        } else {
/* 272 */                   List list2 = i1l01l0lllOI00000oIO.I0000O;
/* 278 */                   if (!list2.isEmpty()) {
/* 286 */                       I1l01ooO i1l01ooO = (I1l01ooO) list2.get(0);
/* 298 */                       List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o((List) camcorderProfileResolutionQuirk.I00000oOI.getValue());
/* 302 */                       i1l01ooO.getClass();
/* 314 */                       zContains = listI00iIi0i1o.contains(new Size(i1l01ooO.I0000oI00, i1l01ooO.I0001Ioi1lo));
                            }
/* 318 */                   if (!zContains) {
                            }
                        }
                    }
/* 387 */           linkedHashMap.put(Integer.valueOf(i), i1l01l0lllOI00000oIO);
/* 390 */           return i1l01l0lllOI00000oIO;
                }
            }

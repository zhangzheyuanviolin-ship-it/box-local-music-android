            package p000;

            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class i0O1Oi1Ioll implements i0OiOI1 {
                public static final OlOilIlol1 I000O01llI0 = new OlOilIlol1("FakeAssetPackService");
                public static final AtomicInteger I000OOo1O = new AtomicInteger(1);
                public String I00000oIO;
                public i0Iii1o10 I00000oOI;
                public i0O0oOiO11 I0000Il00O;
                public i0OI1ii10 I0000O;
                public i0OI1IOoili1 I0000oI00;
                public Handler I0001Ioi1lo;
                public i0IOo0i0 I000II;

                public static long I000O01llI0(int i, long j) {
/* 2 */             if (i == 2) {
/* 16 */                return j / 2;
                    }
/* 5 */             if (i == 3 || i == 4) {
/* 13 */                return j;
                    }
/* 10 */            return 0L;
                }

                @Override
                public final o0IiOl I00000oIO(ArrayList arrayList, HashMap map) {
/* 9 */             I000O01llI0.I0000O("startDownload(%s)", arrayList);
/* 14 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 23 */            Executor executor = (Executor) this.I000II.I0000Il00O();
/* 28 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(5);
/* 31 */            o10oO1IiI1.I00iiI = this;
/* 33 */            o10oO1IiI1.I00iiO = arrayList;
/* 35 */            o10oO1IiI1.I00iio = oloIlI0ll;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            executor.execute(o10oO1IiI1);
/* 43 */            return oloIlI0ll.I00000oIO;
                }

                @Override
                public final void I00000oOI(int i) {
/* 8 */             I000O01llI0.I0000O("notifySessionFailed", new Object[0]);
                }

                @Override
                public final void I0000Il00O(int i, String str) {
/* 8 */             I000O01llI0.I0000O("notifyModuleCompleted", new Object[0]);
/* 17 */            Executor executor = (Executor) this.I000II.I0000Il00O();
/* 22 */            I1I1Oi0iil i1I1Oi0iil = new I1I1Oi0iil(2);
/* 25 */            i1I1Oi0iil.I00iiO = this;
/* 27 */            i1I1Oi0iil.I00iiI = i;
/* 29 */            i1I1Oi0iil.I00iio = str;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            executor.execute(i1I1Oi0iil);
                }

                @Override
                public final void I0000O(int i, int i2, String str, String str2) {
/* 8 */             I000O01llI0.I0000O("notifyChunkTransferred", new Object[0]);
                }

                @Override
                public final void I0000oI00(List list) {
/* 9 */             I000O01llI0.I0000O("cancelDownload(%s)", list);
                }

                @Override
                public final o0IiOl I0001Ioi1lo(int i, int i2, String str, String str2) throws O11oIi {
/* 11 */            Object[] objArr = {Integer.valueOf(i), str, str2, Integer.valueOf(i2)};
/* 17 */            OlOilIlol1 olOilIlol1 = I000O01llI0;
/* 19 */            olOilIlol1.I0000O("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
/* 24 */            o0IiOl o0iiol = new o0IiOl();
                    try {
/* 27 */                File[] fileArrI000OiO = I000OiO(str);
/* 33 */                for (File file : fileArrI000OiO) {
/* 45 */                    if (liIlIOI0OOI.I00000oIO(file).equals(str2)) {
/* 53 */                        o0iiol.I000lI(ParcelFileDescriptor.open(file, 268435456));
/* 56 */                        return o0iiol;
                            }
                        }
/* 91 */                throw new O11oIi("Local testing slice for '" + str2 + "' not found.");
                    } catch (O11oIi e) {
/* 96 */                olOilIlol1.I0000oI00("getChunkFileDescriptor failed", e);
/* 99 */                o0iiol.I000oI1ioi(e);
/* 483 */               return o0iiol;
                    } catch (FileNotFoundException e2) {
/* 107 */               olOilIlol1.I0000oI00("getChunkFileDescriptor failed", e2);
/* 117 */               o0iiol.I000oI1ioi(new O11oIi("Asset Slice file not found.", e2));
/* 483 */               return o0iiol;
                    }
                }

                @Override
                public final o0IiOl I000II(HashMap map) {
/* 8 */             I000O01llI0.I0000O("syncPacks()", new Object[0]);
/* 16 */            return lOio0o.I0000oI00(new ArrayList());
                }

                public final void I000OOo1O(int i, int i2, String str) {
/* 9 */             Bundle bundle = new Bundle();
/* 20 */            bundle.putInt("app_version_code", this.I0000O.I00000oIO());
/* 27 */            bundle.putInt("session_id", i);
/* 30 */            File[] fileArrI000OiO = I000OiO(str);
/* 36 */            ArrayList<String> arrayList = new ArrayList<>();
/* 39 */            int length = fileArrI000OiO.length;
/* 40 */            long j = 0;
/* 42 */            int i3 = 0;
                    while (true) {
/* 43 */                int i4 = 3;
/* 44 */                if (i3 >= length) {
/* 163 */                   bundle.putStringArrayList(liIlli0IIoo.I00000oIO("slice_ids", str), arrayList);
/* 177 */                   bundle.putLong(liIlli0IIoo.I00000oIO("pack_version", str), r4.I00000oIO());
/* 186 */                   bundle.putInt(liIlli0IIoo.I00000oIO("status", str), i2);
/* 196 */                   bundle.putInt(liIlli0IIoo.I00000oIO("error_code", str), 0);
/* 209 */                   bundle.putLong(liIlli0IIoo.I00000oIO("bytes_downloaded", str), I000O01llI0(i2, j));
/* 218 */                   bundle.putLong(liIlli0IIoo.I00000oIO("total_bytes_to_download", str), j);
/* 236 */                   bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
/* 243 */                   bundle.putLong("bytes_downloaded", I000O01llI0(i2, j));
/* 246 */                   bundle.putLong("total_bytes_to_download", j);
/* 258 */                   Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
/* 262 */                   Handler handler = this.I0001Ioi1lo;
/* 266 */                   liOO1i1 lioo1i1 = new liOO1i1(i4);
/* 269 */                   lioo1i1.I00iiI = this;
/* 271 */                   lioo1i1.I00iiO = intentPutExtra;
/* 273 */                   VarHandle.storeStoreFence();
/* 276 */                   handler.post(lioo1i1);
/* 2160 */                  return;
                        }
/* 46 */                File file = fileArrI000OiO[i3];
/* 52 */                long length2 = j + file.length();
/* 55 */                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
/* 73 */                arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
/* 76 */                String strI00000oIO = liIlIOI0OOI.I00000oIO(file);
/* 86 */                bundle.putParcelableArrayList(liIlli0IIoo.I00000oOI("chunk_intents", str, strI00000oIO), arrayList2);
                        try {
/* 107 */                   bundle.putString(liIlli0IIoo.I00000oOI("uncompressed_hash_sha256", str, strI00000oIO), liO111OO1.I00000oIO(Arrays.asList(file)));
/* 121 */                   bundle.putLong(liIlli0IIoo.I00000oOI("uncompressed_size", str, strI00000oIO), file.length());
/* 124 */                   arrayList.add(strI00000oIO);
/* 127 */                   i3++;
/* 129 */                   j = length2;
                        } catch (IOException e) {
/* 147 */                   throw new O11oIi(String.format("Could not digest file: %s.", file), e);
                        } catch (NoSuchAlgorithmException e2) {
/* 156 */                   throw new O11oIi("SHA256 algorithm not supported.", e2);
                        }
                    }
                }

                public final File[] I000OiO(String str) {
/* 5 */             File file = new File(this.I00000oIO);
/* 12 */            if (!file.isDirectory()) {
/* 186 */               throw new O11oIi(String.format("Local testing directory '%s' not found.", file));
                    }
/* 16 */            i0O1O1oO0O i0o1o1oo0o = new i0O1O1oO0O();
/* 19 */            i0o1o1oo0o.I00000oIO = str;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            File[] fileArrListFiles = file.listFiles(i0o1o1oo0o);
/* 30 */            if (fileArrListFiles == null) {
/* 89 */                throw new O11oIi(IlIi0I0.I000lI("Failed fetching APKs for pack '", str, "'."));
                    }
/* 33 */            if (fileArrListFiles.length == 0) {
/* 77 */                throw new O11oIi(IlIi0I0.I000lI("No APKs available for pack '", str, "'."));
                    }
/* 36 */            for (File file2 : fileArrListFiles) {
/* 48 */                if (liIlIOI0OOI.I00000oIO(file2).equals(str)) {
/* 50 */                    return fileArrListFiles;
                        }
                    }
/* 65 */            throw new O11oIi(IlIi0I0.I000lI("No main slice available for pack '", str, "'."));
                }

                @Override
                public final void mo17f() {
/* 8 */             I000O01llI0.I0000O("keepAlive", new Object[0]);
                }
            }

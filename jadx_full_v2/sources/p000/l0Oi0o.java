            package p000;

            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.util.Pair;
            import android.util.SparseArray;
            import org.json.JSONException;
            
            public final class l0Oi0o extends l1i00il00li {
                public static final Pair I00oliIiO01i = new Pair("", 0L);
                public SharedPreferences I00iiO;
                public SharedPreferences I00iio;
                public I0Oo1I101o I00ilI0I1;
                public l0O0o010I I00ilO0;
                public I1ii1l10IO I00io1l;
                public String I00ioIO;
                public boolean I00l0I0l0lO1;
                public long I00l0OO0IO;
                public l0O0o010I I00li1OI;
                public l0IllIiO I00ll1;
                public I1ii1l10IO I00lli11;
                public o01l1ioOo0 I00lll10;
                public l0IllIiO I00o0iI0io1;
                public l0O0o010I I00o0l1o1o0;
                public l0O0o010I I00o101lO;
                public boolean I00oI0i;
                public l0IllIiO I00oII;
                public l0IllIiO I00oIiI10;
                public l0O0o010I I00oO101o;
                public I1ii1l10IO I00oOio10iI1;
                public I1ii1l10IO I00ol1;
                public l0O0o010I I00olI;
                public o01l1ioOo0 I00oli;

                @Override
                public final boolean I010OIo1l() {
/* 1 */             return true;
                }

                public final SharedPreferences I010ioo() {
/* 1 */             I010II();
/* 4 */             I010i10l();
/* 9 */             lII0I0I000I.I000II(this.I00iiO);
/* 12 */            return this.I00iiO;
                }

                public final SharedPreferences I010l10O() {
/* 1 */             I010II();
/* 4 */             I010i10l();
/* 7 */             SharedPreferences sharedPreferences = this.I00iio;
/* 9 */             if (sharedPreferences != null) {
/* 55 */                return sharedPreferences;
                    }
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 21 */            String strValueOf = String.valueOf(l0olllo1i.I00iOIl.getPackageName());
/* 25 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 27 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 30 */            IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 34 */            String strConcat = strValueOf.concat("_preferences");
/* 40 */            iOloiOI1.I0000Il00O("Default prefs file", strConcat);
/* 46 */            SharedPreferences sharedPreferences2 = l0olllo1i.I00iOIl.getSharedPreferences(strConcat, 0);
/* 50 */            this.I00iio = sharedPreferences2;
/* 55 */            return sharedPreferences2;
                }

                public final SparseArray I010l1O() throws JSONException {
/* 3 */             Bundle bundleI0010o = this.I00lll10.I0010o();
/* 9 */             int[] intArray = bundleI0010o.getIntArray("uriSources");
/* 15 */            long[] longArray = bundleI0010o.getLongArray("uriTimestamps");
/* 19 */            if (intArray == null || longArray == null) {
/* 76 */                return new SparseArray();
                    }
/* 26 */            if (intArray.length != longArray.length) {
/* 32 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 34 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 41 */                l01o0io1ooo0.I00ilO0.I00000oOI("Trigger URI source and timestamp array lengths do not match");
/* 46 */                return new SparseArray();
                    }
/* 52 */            SparseArray sparseArray = new SparseArray();
/* 57 */            for (int i = 0; i < intArray.length; i++) {
/* 67 */                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
                    }
/* 73 */            return sparseArray;
                }

                public final l1ioIO011Oo I010l1ol111() {
/* 1 */             I010II();
/* 28 */            return l1ioIO011Oo.I0000Il00O(I010ioo().getInt("consent_source", 100), I010ioo().getString("consent_settings", "G1"));
                }

                public final void I010lI0oi(boolean z) {
/* 1 */             I010II();
/* 8 */             l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 10 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 21 */            l01o0io1ooo0.I00lll10.I0000Il00O("App measurement setting deferred collection", Boolean.valueOf(z));
/* 28 */            SharedPreferences.Editor editorEdit = I010ioo().edit();
/* 34 */            editorEdit.putBoolean("deferred_analytics_collection", z);
/* 37 */            editorEdit.apply();
                }

                public final boolean I010o0o0oO(long j) {
                    return j - this.I00li1OI.I00000oIO() > this.I00o0l1o1o0.I00000oIO();
                }
            }

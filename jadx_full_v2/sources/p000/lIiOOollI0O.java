            package p000;

            import android.content.SharedPreferences;
            import java.util.Objects;
            
            public final class lIiOOollI0O implements SharedPreferences.OnSharedPreferenceChangeListener {
                public lIl1O1li I00000oIO;

                @Override
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
/* 1 */             lIl1O1li lil1o1li = this.I00000oIO;
/* 3 */             lil1o1li.getClass();
/* 12 */            if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
/* 36 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 38 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 45 */                l01o0io1ooo0.I00lll10.I00000oOI("IABTCF_TCString change picked up in listener.");
/* 48 */                l1o00OIlII l1o00oilii = lil1o1li.I00oO101o;
/* 50 */                lII0I0I000I.I000II(l1o00oilii);
/* 55 */                l1o00oilii.I00000oOI(500L);
                    }
                }
            }

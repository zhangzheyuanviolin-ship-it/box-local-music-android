            package com.google.android.gms.measurement;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import p000.i1I1oIl;
            import p000.iOoIOOi0I1;
            import p000.iil0oiil0;
            import p000.il1i11oOloil;
            import p000.l0olllO1i;
            import p000.lII0I0I000I;
            import p000.lIl1O1li;
            import p000.lIlI1I;
            import p000.ll0I11O;
            
            @Deprecated
            public class AppMeasurement {
                public static volatile AppMeasurement I00000oOI;
                public iil0oiil0 I00000oIO;

                public static class ConditionalUserProperty {
                    public boolean mActive;
                    public String mAppId;
                    public long mCreationTimestamp;
                    public String mExpiredEventName;
                    public Bundle mExpiredEventParams;
                    public String mName;
                    public String mOrigin;
                    public long mTimeToLive;
                    public String mTimedOutEventName;
                    public Bundle mTimedOutEventParams;
                    public String mTriggerEventName;
                    public long mTriggerTimeout;
                    public String mTriggeredEventName;
                    public Bundle mTriggeredEventParams;
                    public long mTriggeredTimestamp;
                    public Object mValue;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Deprecated
                public static AppMeasurement getInstance(Context context) {
/* 3 */             if (I00000oOI == null) {
                        synchronized (AppMeasurement.class) {
/* 10 */                    if (I00000oOI == null) {
/* 37 */                        lIlI1I lili1i = (lIlI1I) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
/* 44 */                        if (lili1i != null) {
/* 48 */                            AppMeasurement appMeasurement = new AppMeasurement();
/* 53 */                            iOoIOOi0I1 iooiooi0i1 = new iOoIOOi0I1();
/* 56 */                            iooiooi0i1.I00000oIO = lili1i;
/* 58 */                            VarHandle.storeStoreFence();
/* 61 */                            appMeasurement.I00000oIO = iooiooi0i1;
/* 63 */                            VarHandle.storeStoreFence();
/* 66 */                            I00000oOI = appMeasurement;
                                } else {
/* 81 */                            l0olllO1i l0olllo1iI000l1 = l0olllO1i.I000l1(context, new il1i11oOloil(0L, 0L, true, null, null), null, null);
/* 87 */                            AppMeasurement appMeasurement2 = new AppMeasurement();
/* 92 */                            i1I1oIl i1i1oil = new i1I1oIl();
/* 95 */                            lII0I0I000I.I000II(l0olllo1iI000l1);
/* 98 */                            i1i1oil.I00000oIO = l0olllo1iI000l1;
/* 100 */                           lIl1O1li lil1o1li = l0olllo1iI000l1.I00lli11;
/* 102 */                           l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 105 */                           i1i1oil.I00000oOI = lil1o1li;
/* 107 */                           VarHandle.storeStoreFence();
/* 110 */                           appMeasurement2.I00000oIO = i1i1oil;
/* 112 */                           VarHandle.storeStoreFence();
/* 115 */                           I00000oOI = appMeasurement2;
                                }
                            }
                        }
                    }
/* 121 */           return I00000oOI;
                }

                public void beginAdUnitExposure(String str) {
/* 3 */             this.I00000oIO.I0000O(str);
                }

                public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
/* 3 */             this.I00000oIO.I0000oI00(str, str2, bundle);
                }

                public void endAdUnitExposure(String str) {
/* 3 */             this.I00000oIO.I00000oOI(str);
                }

                public long generateEventId() {
/* 3 */             return this.I00000oIO.zzl();
                }

                public String getAppInstanceId() {
/* 3 */             return this.I00000oIO.zzj();
                }

                public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
/* 3 */             List<Bundle> listI0001Ioi1lo = this.I00000oIO.I0001Ioi1lo(str, str2);
/* 17 */            ArrayList arrayList = new ArrayList(listI0001Ioi1lo == null ? 0 : listI0001Ioi1lo.size());
/* 28 */            for (Bundle bundle : listI0001Ioi1lo) {
/* 38 */                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
/* 41 */                lII0I0I000I.I000II(bundle);
/* 55 */                conditionalUserProperty.mAppId = (String) ll0I11O.I00000oOI(bundle, "app_id", String.class, null);
/* 65 */                conditionalUserProperty.mOrigin = (String) ll0I11O.I00000oOI(bundle, "origin", String.class, null);
/* 75 */                conditionalUserProperty.mName = (String) ll0I11O.I00000oOI(bundle, "name", String.class, null);
/* 85 */                conditionalUserProperty.mValue = ll0I11O.I00000oOI(bundle, "value", Object.class, null);
/* 95 */                conditionalUserProperty.mTriggerEventName = (String) ll0I11O.I00000oOI(bundle, "trigger_event_name", String.class, null);
/* 117 */               conditionalUserProperty.mTriggerTimeout = ((Long) ll0I11O.I00000oOI(bundle, "trigger_timeout", Long.class, 0L)).longValue();
/* 127 */               conditionalUserProperty.mTimedOutEventName = (String) ll0I11O.I00000oOI(bundle, "timed_out_event_name", String.class, null);
/* 139 */               conditionalUserProperty.mTimedOutEventParams = (Bundle) ll0I11O.I00000oOI(bundle, "timed_out_event_params", Bundle.class, null);
/* 149 */               conditionalUserProperty.mTriggeredEventName = (String) ll0I11O.I00000oOI(bundle, "triggered_event_name", String.class, null);
/* 159 */               conditionalUserProperty.mTriggeredEventParams = (Bundle) ll0I11O.I00000oOI(bundle, "triggered_event_params", Bundle.class, null);
/* 173 */               conditionalUserProperty.mTimeToLive = ((Long) ll0I11O.I00000oOI(bundle, "time_to_live", Long.class, 0L)).longValue();
/* 183 */               conditionalUserProperty.mExpiredEventName = (String) ll0I11O.I00000oOI(bundle, "expired_event_name", String.class, null);
/* 193 */               conditionalUserProperty.mExpiredEventParams = (Bundle) ll0I11O.I00000oOI(bundle, "expired_event_params", Bundle.class, null);
/* 211 */               conditionalUserProperty.mActive = ((Boolean) ll0I11O.I00000oOI(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
/* 225 */               conditionalUserProperty.mCreationTimestamp = ((Long) ll0I11O.I00000oOI(bundle, "creation_timestamp", Long.class, 0L)).longValue();
/* 239 */               conditionalUserProperty.mTriggeredTimestamp = ((Long) ll0I11O.I00000oOI(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
/* 241 */               arrayList.add(conditionalUserProperty);
                    }
/* 332 */           return arrayList;
                }

                public String getCurrentScreenClass() {
/* 3 */             return this.I00000oIO.zzi();
                }

                public String getCurrentScreenName() {
/* 3 */             return this.I00000oIO.zzh();
                }

                public String getGmpAppId() {
/* 3 */             return this.I00000oIO.zzk();
                }

                public int getMaxUserProperties(String str) {
/* 3 */             return this.I00000oIO.I000II(str);
                }

                public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
/* 3 */             return this.I00000oIO.I000O01llI0(str, str2, z);
                }

                public void logEventInternal(String str, String str2, Bundle bundle) {
/* 3 */             this.I00000oIO.I0000Il00O(str, str2, bundle);
                }

                public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
/* 1 */             lII0I0I000I.I000II(conditionalUserProperty);
/* 6 */             Bundle bundle = new Bundle();
/* 9 */             String str = conditionalUserProperty.mAppId;
/* 11 */            if (str != null) {
/* 15 */                bundle.putString("app_id", str);
                    }
/* 18 */            String str2 = conditionalUserProperty.mOrigin;
/* 20 */            if (str2 != null) {
/* 24 */                bundle.putString("origin", str2);
                    }
/* 27 */            String str3 = conditionalUserProperty.mName;
/* 29 */            if (str3 != null) {
/* 33 */                bundle.putString("name", str3);
                    }
/* 36 */            Object obj = conditionalUserProperty.mValue;
/* 38 */            if (obj != null) {
/* 40 */                ll0I11O.I00000oIO(bundle, obj);
                    }
/* 43 */            String str4 = conditionalUserProperty.mTriggerEventName;
/* 45 */            if (str4 != null) {
/* 49 */                bundle.putString("trigger_event_name", str4);
                    }
/* 56 */            bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
/* 59 */            String str5 = conditionalUserProperty.mTimedOutEventName;
/* 61 */            if (str5 != null) {
/* 65 */                bundle.putString("timed_out_event_name", str5);
                    }
/* 68 */            Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
/* 70 */            if (bundle2 != null) {
/* 74 */                bundle.putBundle("timed_out_event_params", bundle2);
                    }
/* 77 */            String str6 = conditionalUserProperty.mTriggeredEventName;
/* 79 */            if (str6 != null) {
/* 83 */                bundle.putString("triggered_event_name", str6);
                    }
/* 86 */            Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
/* 88 */            if (bundle3 != null) {
/* 92 */                bundle.putBundle("triggered_event_params", bundle3);
                    }
/* 99 */            bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
/* 102 */           String str7 = conditionalUserProperty.mExpiredEventName;
/* 104 */           if (str7 != null) {
/* 108 */               bundle.putString("expired_event_name", str7);
                    }
/* 111 */           Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
/* 113 */           if (bundle4 != null) {
/* 117 */               bundle.putBundle("expired_event_params", bundle4);
                    }
/* 120 */           iil0oiil0 iil0oiil0Var = this.I00000oIO;
/* 126 */           bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
/* 133 */           bundle.putBoolean("active", conditionalUserProperty.mActive);
/* 140 */           bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
/* 143 */           iil0oiil0Var.I00000oIO(bundle);
                }
            }

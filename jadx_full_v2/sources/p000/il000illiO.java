            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IInterface;
            import java.util.Map;
            
            public interface il000illiO extends IInterface {
                void beginAdUnitExposure(String str, long j);

                void clearConditionalUserProperty(String str, String str2, Bundle bundle);

                void clearMeasurementEnabled(long j);

                void endAdUnitExposure(String str, long j);

                void generateEventId(il0IOO il0ioo);

                void getAppInstanceId(il0IOO il0ioo);

                void getCachedAppInstanceId(il0IOO il0ioo);

                void getConditionalUserProperties(String str, String str2, il0IOO il0ioo);

                void getCurrentScreenClass(il0IOO il0ioo);

                void getCurrentScreenName(il0IOO il0ioo);

                void getGmpAppId(il0IOO il0ioo);

                void getMaxUserProperties(String str, il0IOO il0ioo);

                void getSessionId(il0IOO il0ioo);

                void getTestFlag(il0IOO il0ioo, int i);

                void getUserProperties(String str, String str2, boolean z, il0IOO il0ioo);

                void initForTests(Map map);

                void initialize(IoOlilli0ol ioOlilli0ol, il1i11oOloil il1i11ooloil, long j);

                void initializeWithElapsedTime(IoOlilli0ol ioOlilli0ol, il1i11oOloil il1i11ooloil, long j, long j2);

                void isDataCollectionEnabled(il0IOO il0ioo);

                void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

                void logEventAndBundle(String str, String str2, Bundle bundle, il0IOO il0ioo, long j);

                void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

                void logHealthData(int i, String str, IoOlilli0ol ioOlilli0ol, IoOlilli0ol ioOlilli0ol2, IoOlilli0ol ioOlilli0ol3);

                void onActivityCreated(IoOlilli0ol ioOlilli0ol, Bundle bundle, long j);

                void onActivityCreatedByScionActivityInfo(il1l0io1O il1l0io1o, Bundle bundle, long j);

                void onActivityDestroyed(IoOlilli0ol ioOlilli0ol, long j);

                void onActivityDestroyedByScionActivityInfo(il1l0io1O il1l0io1o, long j);

                void onActivityPaused(IoOlilli0ol ioOlilli0ol, long j);

                void onActivityPausedByScionActivityInfo(il1l0io1O il1l0io1o, long j);

                void onActivityResumed(IoOlilli0ol ioOlilli0ol, long j);

                void onActivityResumedByScionActivityInfo(il1l0io1O il1l0io1o, long j);

                void onActivitySaveInstanceState(IoOlilli0ol ioOlilli0ol, il0IOO il0ioo, long j);

                void onActivitySaveInstanceStateByScionActivityInfo(il1l0io1O il1l0io1o, il0IOO il0ioo, long j);

                void onActivityStarted(IoOlilli0ol ioOlilli0ol, long j);

                void onActivityStartedByScionActivityInfo(il1l0io1O il1l0io1o, long j);

                void onActivityStopped(IoOlilli0ol ioOlilli0ol, long j);

                void onActivityStoppedByScionActivityInfo(il1l0io1O il1l0io1o, long j);

                void performAction(Bundle bundle, il0IOO il0ioo, long j);

                void registerOnMeasurementEventListener(il10Io00IlII il10io00ilii);

                void resetAnalyticsData(long j);

                void resetAnalyticsDataWithElapsedTime(long j, long j2);

                void retrieveAndUploadBatches(il0lI0oo1 il0li0oo1);

                void setConditionalUserProperty(Bundle bundle, long j);

                void setConsent(Bundle bundle, long j);

                void setConsentThirdParty(Bundle bundle, long j);

                void setCurrentScreen(IoOlilli0ol ioOlilli0ol, String str, String str2, long j);

                void setCurrentScreenByScionActivityInfo(il1l0io1O il1l0io1o, String str, String str2, long j);

                void setDataCollectionEnabled(boolean z);

                void setDefaultEventParameters(Bundle bundle);

                void setEventInterceptor(il10Io00IlII il10io00ilii);

                void setInstanceIdProvider(il1OIOoloo il1oiooloo);

                void setMeasurementEnabled(boolean z, long j);

                void setMinimumSessionDuration(long j);

                void setSessionTimeoutDuration(long j);

                void setSgtmDebugInfo(Intent intent);

                void setUserId(String str, long j);

                void setUserProperty(String str, String str2, IoOlilli0ol ioOlilli0ol, boolean z, long j);

                void unregisterOnMeasurementEventListener(il10Io00IlII il10io00ilii);
            }

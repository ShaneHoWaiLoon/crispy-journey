import type { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.sky.crispyJourney',
  appName: 'crispy-journey',
  webDir: 'dist',
  bundledWebRuntime: false,
  server: {
    url: '', // Ensure no localhost URL in production builds
    cleartext: true,
  },
};

export default config;

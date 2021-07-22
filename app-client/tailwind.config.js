module.exports = {
  mode: 'jit',
  purge: ['./src/**/*.{js,jsx,ts,tsx}', './public/index.html'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors: {
        gray: {
          13: '#f0f2f5'
        }
      }
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
